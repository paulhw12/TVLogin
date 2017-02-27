package com.numiracles.firetv.tvlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.amazon.identity.auth.device.authorization.api.AmazonAuthorizationManager;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants;
import com.amazon.identity.auth.device.shared.APIListener;
import com.amazon.identity.auth.device.AuthError;


/**
 * Created by phampton on 2/27/17.
 */

public class LWAActivity extends AppCompatActivity {
    private static final String TAG = LWAActivity.class.getName();

    private static final String[] APP_SCOPES= {"profile"};

    private TextView mProfileText;
    private ImageButton mLoginButton;
    private TextView mLogoutTextView;
    private AmazonAuthorizationManager mAuthManager;
    private ProgressBar mLogInProgress;
    private boolean mIsLoggedIn;
    private TextView mReturnToApp;

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            mAuthManager = new AmazonAuthorizationManager(this, Bundle.EMPTY);
        }
        catch(IllegalArgumentException e)
        {
            showAuthToast("APIKey is incorrect or does not exist.");
            Log.e(TAG, "Unable to Use Amazon Authorization Manager. APIKey is incorrect or does not exist.", e);
        }
        setContentView(R.layout.activity_lwa);
        initializeUI();
    }

    /**
     * Initializes all of the UI elements in the activity
     */
    private void initializeUI() {
        mProfileText = (TextView) findViewById(R.id.profile_info);

        mLoginButton = (ImageButton) findViewById(R.id.login_with_amazon);
        mLoginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setLoggingInState(true);
                mAuthManager.authorize(APP_SCOPES, Bundle.EMPTY, new AuthListener());
            }
        });

        mLogoutTextView = (TextView) findViewById(R.id.logout);
        String logoutText = getString(R.string.logout);
        SpannableString underlinedLogoutText = new SpannableString(logoutText);
        underlinedLogoutText.setSpan(new UnderlineSpan(), 0, logoutText.length(), 0);
        mLogoutTextView.setText(underlinedLogoutText);
        mLogoutTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mAuthManager.clearAuthorizationState(new APIListener() {
                    @Override
                    public void onSuccess(Bundle results) {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                setLoggedOutState();
                            }
                        });
                    }

                    @Override
                    public void onError(AuthError authError) {
                        Log.e(TAG, "Error clearing authorization state.", authError);
                    }
                });
            }
        });

        mLogInProgress = (ProgressBar) findViewById(R.id.log_in_progress);

        mReturnToApp = (TextView)findViewById(R.id.return_to_app);

        String returnToAppText = getString(R.string.return_to_app);
        SpannableString underlinedReturnToAppText = new SpannableString(returnToAppText);
        underlinedReturnToAppText.setSpan(new UnderlineSpan(), 0, returnToAppText.length(), 0);
        mReturnToApp.setText(underlinedReturnToAppText);
        mReturnToApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuthManager.clearAuthorizationState(new APIListener() {
                    @Override
                    public void onSuccess(Bundle results) {
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                if ( mAuthManager != null )
                                {
                                    // if user clicks on Return to App link, check the login state.
                                    updateLoginState();
                                }
                            }
                        });
                    }

                    @Override
                    public void onError(AuthError authError) {
                        Log.e(TAG, "Error clearing authorization state.", authError);
                    }
                });
            }
        });
    }

    /**
     * {@link AuthorizationListener} which is passed in to authorize calls made on the {@link AmazonAuthorizationManager} member.
     * Starts getToken workflow if the authorization was successful, or displays a toast if the user cancels authorization.
     * @implements {@link AuthorizationListener}
     */
    private class AuthListener implements AuthorizationListener{

        /**
         * Authorization was completed successfully.
         * Display the profile of the user who just completed authorization
         * @param response bundle containing authorization response. Not used.
         */
        @Override
        public void onSuccess(Bundle response) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    // At this point we know the authorization completed, so remove the ability to return to the app to sign-in again
                    mReturnToApp.setVisibility(TextView.GONE);
                }
            });
            mAuthManager.getProfile(new ProfileListener());
        }


        /**
         * There was an error during the attempt to authorize the application.
         * Log the error, and reset the profile text view.
         * @param ae the error that occurred during authorize
         */
        @Override
        public void onError(AuthError ae) {
            Log.e(TAG, "AuthError during authorization", ae);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    showAuthToast("Error during authorization.  Please try again.");
                    resetProfileView();
                    setLoggingInState(false);
                }
            });
        }

        /**
         * Authorization was cancelled before it could be completed.
         * A toast is shown to the user, to confirm that the operation was cancelled, and the profile text view is reset.
         * @param cause bundle containing the cause of the cancellation. Not used.
         */
        @Override
        public void onCancel(Bundle cause) {
            Log.e(TAG, "User cancelled authorization");
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    showAuthToast("Authorization cancelled");
                    resetProfileView();
                }
            });
        }

    }

    /**
     * Sets the text in the mProfileText {@link TextView} to the value of the provided String.
     * @param profileInfo the String with which to update the {@link TextView}.
     */
    private void updateProfileView(String profileInfo) {
        Log.d(TAG, "Updating profile view");
        mProfileText.setText(profileInfo);
    }

    /**
     * Sets the text in the mProfileText {@link TextView} to the prompt it originally displayed.
     */
    private void resetProfileView(){
        setLoggingInState(false);
        mProfileText.setText(getString(R.string.default_message));
    }

    /**
     * Sets the state of the application to reflect that the user is not currently authorized.
     */
    private void setLoggedOutState(){
        mLoginButton.setVisibility(Button.VISIBLE);
        setLoggedInButtonsVisibility(Button.GONE);
        mIsLoggedIn = false;
        resetProfileView();
    }

    /**
     * Sets the state of the application to reflect that the user is currently authorized.
     */
    private void setLoggedInState(){
        mLoginButton.setVisibility(Button.GONE);
        setLoggedInButtonsVisibility(Button.VISIBLE);
        mIsLoggedIn = true;
        setLoggingInState(false);
    }

    /**
     * Changes the visibility for both of the buttons that are available during the logged in state
     * @param visibility the visibility to which the buttons should be set
     */
    private void setLoggedInButtonsVisibility(int visibility){
        mLogoutTextView.setVisibility(visibility);
    }

    /**
     * Turns on/off display elements which indicate that the user is currently in the process of logging in
     * @param loggingIn whether or not the user is currently in the process of logging in
     */
    private void setLoggingInState(final boolean loggingIn){
        if(loggingIn){
            mLoginButton.setVisibility(Button.GONE);
            setLoggedInButtonsVisibility(Button.GONE);
            mLogInProgress.setVisibility(ProgressBar.VISIBLE);
            mReturnToApp.setVisibility(TextView.VISIBLE);
            mProfileText.setVisibility(TextView.GONE);
        }
        else{
            if(mIsLoggedIn){
                setLoggedInButtonsVisibility(Button.VISIBLE);
            }
            else{
                mLoginButton.setVisibility(Button.VISIBLE);
            }
            mReturnToApp.setVisibility(TextView.GONE);
            mLogInProgress.setVisibility(ProgressBar.GONE);
            mProfileText.setVisibility(TextView.VISIBLE);
        }
    }

    private void showAuthToast(String authToastMessage){
        Toast authToast = Toast.makeText(getApplicationContext(), authToastMessage, Toast.LENGTH_LONG);
        authToast.setGravity(Gravity.CENTER, 0, 0);
        authToast.show();
    }

    /**
     * Updates the login state of the user, based on whether or not the user is currently authorized.
     */
    private void updateLoginState(){
        mAuthManager.getToken(APP_SCOPES, new APIListener() {

            /**
             * If the user is logged in, update the view with the user's profile information
             * If the user is logged out, set the logged out state
             */
            @Override
            public void onSuccess(Bundle response) {
                final String authzToken = response.getString(AuthzConstants.BUNDLE_KEY.TOKEN.val);
                mIsLoggedIn = !TextUtils.isEmpty(authzToken);
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        if(mIsLoggedIn){
                            setLoggingInState(true);
                            mAuthManager.getProfile(new ProfileListener());
                        }
                        else{
                            setLoggedOutState();
                        }
                    }
                });
            }

            /**
             * Handles the case where there is an error in the getProfile call
             */
            @Override
            public void onError(AuthError ae) {
                Log.e(TAG, "AuthError during updateLoginState", ae);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setLoggedOutState();
                    }
                });
            }
        });
    }

    /**
     * {@link AuthListener} which is passed in to the {@link AmazonAuthorizationManager} getProfile api call
     */
    private class ProfileListener implements APIListener{

        /**
         * Updates the profile view with data from the successful getProfile response.
         * Sets app state to logged in
         */
        @Override
        public void onSuccess(Bundle response) {
            Bundle profileBundle = response.getBundle(AuthzConstants.BUNDLE_KEY.PROFILE.val);
            if(profileBundle == null){
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setLoggedOutState();
                        String errorMessage = "Error retrieving profile information.\nPlease log in again";
                        Toast errorToast = Toast.makeText(getApplicationContext(), errorMessage, Toast.LENGTH_LONG);
                        errorToast.setGravity(Gravity.CENTER, 0, 0);
                        errorToast.show();
                    }
                });
            }
            else{
                StringBuilder profileBuilder = new StringBuilder();
                profileBuilder.append(String.format("Hello, %s\n", profileBundle.getString(AuthzConstants.PROFILE_KEY.NAME.val)));
                profileBuilder.append(String.format("Your registered email on this device is: %s\n", profileBundle.getString(AuthzConstants.PROFILE_KEY.EMAIL.val)));
                profileBuilder.append(String.format("\nAs a 3rd party developer you could now send a welcome email to your new customer."));
                profileBuilder.append(String.format("\n\nLogin with Amazon takes 2 clicks instead of an average of over 200 with an on-screen keyboard."));
                profileBuilder.append(String.format("\n\nPress back to return."));
                final String profile = profileBuilder.toString();
                Log.d(TAG, "Profile Response: " + profile);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        updateProfileView(profile);
                        setLoggedInState();
                    }
                });
            }
        }

        /**
         * Updates profile view to reflect that there was an error while retrieving profile information
         */
        @Override
        public void onError(AuthError ae) {
            Log.e(TAG, ae.getMessage(), ae);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    updateProfileView("ERROR: Request for profile information failed.\nPlease log out, and then try logging in again.\nPress back to return to the previous screen.");
                    setLoggingInState(false);
                }
            });
        }
    }
}
