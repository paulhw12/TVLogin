package com.numiracles.firetv.tvlogin;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.numiracles.firetv.tvlogin.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private String CURRENT_ACTION = "email";
    private String FirstPass = "";
    private String ConfPass = "";
    private int KeyPresses = 0;
    private int ActualKeyPresses = 0;

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        // Log.i("key pressed", String.valueOf(event.getKeyCode()));
        Log.i("key presses",String.valueOf(ActualKeyPresses));
        KeyPresses ++;
        ActualKeyPresses = KeyPresses / 2;
        // Toast.makeText(getApplicationContext(), "STRING MESSAGE", Toast.LENGTH_LONG).show();
        binding.infoTextViewKeypresses.setText("Number of Keypresses: " + ActualKeyPresses );
        return super.dispatchKeyEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "1");
                
            }
        });



        binding.button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "3");
                
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "4");
                
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "6");
                
            }
        });

        binding.button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "7");
                
            }
        });

        binding.button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "8");
                
            }
        });

        binding.button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "9");
                
            }
        });

        binding.button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
                
            }
        });

        binding.buttonQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "Q");
                
            }
        });

        binding.buttonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "W");
                
            }
        });

        binding.buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "E");
                
            }
        });

        binding.buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "R");
                
            }
        });

        binding.buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "T");
                
            }
        });

        binding.buttonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "Y");
                
            }
        });

        binding.buttonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "U");
                
            }
        });

        binding.buttonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "I");
                
            }
        });

        binding.buttonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "O");
                
            }
        });

        binding.buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "P");
                
            }
        });

        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + ".");
                
            }
        });

        binding.buttonAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "@");
                
            }
        });

        binding.buttonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "Z");
                
            }
        });

        binding.buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "X");
                
            }
        });

        binding.buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "C");
                
            }
        });

        binding.buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "V");
                
            }
        });


        binding.buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "B");
                
            }
        });

        binding.buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "N");
                
            }
        });

        binding.buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "M");
                
            }
        });


        binding.buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "A");
                
            }
        });

        binding.buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "S");
                
            }
        });

        binding.buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "D");
                
            }
        });

        binding.buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "F");
                
            }
        });

        binding.buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "G");
                
            }
        });

        binding.buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "H");
                
            }
        });

        binding.buttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "J");
                
            }
        });

        binding.buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "K");
                
            }
        });

        binding.buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "L");
                
            }
        });

        binding.buttonUnderscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "_");
                
            }
        });

        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "+");
                
            }
        });

        binding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(CURRENT_ACTION == "email") {
                    binding.infoTextViewEmail.setText("Enter Password" );
                    binding.editText.setText("");
                    CURRENT_ACTION = "password";
                    return;
                }

                if(CURRENT_ACTION == "password") {
                    binding.infoTextViewEmail.setText("Confirm Password" );
                    FirstPass = binding.editText.getText().toString();
                    binding.editText.setText("");
                    Button myButton = (Button) findViewById(R.id.buttonSubmit);
                    myButton.setText("Register");
                    CURRENT_ACTION = "confpassword";
                    return;
                }

                if(CURRENT_ACTION == "confpassword") {
                    ConfPass = binding.editText.getText().toString();
                    Toast.makeText(getApplicationContext(), "PW " + FirstPass + "Conf " + ConfPass, Toast.LENGTH_LONG).show();
                    if (!FirstPass.equals(ConfPass)) {
                        Toast.makeText(getApplicationContext(), "Passwords did not match - try again", Toast.LENGTH_LONG).show();
                        binding.infoTextViewEmail.setText("Enter Password" );
                        binding.editText.setText("");
                        Button myButton = (Button) findViewById(R.id.buttonSubmit);
                        myButton.setText("Next");
                        CURRENT_ACTION = "password";
                        return;
                    }
                    Toast.makeText(getApplicationContext(), "You pressed " + ActualKeyPresses + " buttons registering!", Toast.LENGTH_LONG).show();
                }

            }
        });

        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText("");
            }
        });

        binding.buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.infoTextViewEmail.setText("Enter Email Address" );
                binding.editText.setText("");
                CURRENT_ACTION = "email";
                KeyPresses = 0;
                ActualKeyPresses = 0;
                binding.infoTextViewKeypresses.setText("Number of Keypresses: " + ActualKeyPresses );
                Button myButton = (Button) findViewById(R.id.buttonSubmit);
                myButton.setText("Next");
                Button myBtn = (Button)findViewById(R.id.button1);
                myBtn.requestFocus();
            }
        });

        binding.buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editText.getText().length() > 0) {
                    CharSequence currentText = binding.editText.getText();
                    binding.editText.setText(currentText.subSequence(0, currentText.length()-1));
                }
                else {
                    binding.editText.setText("");
                }
            }
        });

    }

    public void setKeyPressess() {
        binding.infoTextViewKeypresses.setText("Number of Keypresses: " + ActualKeyPresses );
        binding.editText.setText("");
    }
}
