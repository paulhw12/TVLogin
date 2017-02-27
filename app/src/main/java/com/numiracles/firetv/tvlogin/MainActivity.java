package com.numiracles.firetv.tvlogin;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.common.base.Stopwatch;
import com.numiracles.firetv.tvlogin.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public final static String EXTRA_MESSAGE = "test";
    private String CURRENT_ACTION = "email";
    private String FirstPass = "";
    private String ConfPass = "";
    private String KeyboardCase = "upper";
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
    public void onCreate(Bundle savedInstanceState) {
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

        binding.buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "A");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "a");
                }
            }
        });

        binding.buttonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "B");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "b");
                }
            }
        });

        binding.buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "C");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "c");
                }
            }
        });

        binding.buttonD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "D");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "d");
                }
            }
        });

        binding.buttonE.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "E");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "e");
                }
            }
        });

        binding.buttonF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "F");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "f");
                }
            }
        });

        binding.buttonG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "G");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "g");
                }
            }
        });

        binding.buttonH.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "I");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "i");
                }
            }
        });

        binding.buttonJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "J");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "j");
                }
            }
        });

        binding.buttonK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "K");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "k");
                }
            }
        });

        binding.buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "L");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "l");
                }
            }
        });

        binding.buttonM.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "M");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "m");
                }
            }
        });

        binding.buttonN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "N");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "n");
                }
            }
        });

        binding.buttonO.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "O");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "o");
                }
            }
        });

        binding.buttonP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "P");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "p");
                }
            }
        });

        binding.buttonQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "Q");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "q");
                }
            }
        });

        binding.buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "R");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "r");
                }
            }
        });

        binding.buttonS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "S");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "s");
                }
            }
        });

        binding.buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "T");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "t");
                }
            }
        });

        binding.buttonU.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "U");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "u");
                }
            }
        });

        binding.buttonV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "V");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "v");
                }
            }
        });

        binding.buttonW.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "W");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "w");
                }
            }
        });

        binding.buttonX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "X");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "x");
                }
            }
        });

        binding.buttonY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "Y");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "y");
                }
            }
        });

        binding.buttonZ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (KeyboardCase.equals("upper")) {
                    binding.editText.setText(binding.editText.getText() + "Z");
                }
                if (KeyboardCase.equals("lower")) {
                    binding.editText.setText(binding.editText.getText() + "z");
                }
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
                    // Toast.makeText(getApplicationContext(), "PW " + FirstPass + "Conf " + ConfPass, Toast.LENGTH_LONG).show();
                    if (!FirstPass.equals(ConfPass)) {
                        Toast.makeText(getApplicationContext(), "Passwords did not match - try again", Toast.LENGTH_LONG).show();
                        binding.infoTextViewEmail.setText("Enter Password" );
                        binding.editText.setText("");
                        Button myButton = (Button) findViewById(R.id.buttonSubmit);
                        myButton.setText("Next");
                        CURRENT_ACTION = "password";
                        return;
                    }
                    // Toast.makeText(getApplicationContext(), "You pressed " + ActualKeyPresses + " buttons registering!", Toast.LENGTH_LONG).show();
                    showResults();
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


        binding.buttonCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (KeyboardCase.equals("upper")) {
                    setLowercase();
                    return;
                }
                if (KeyboardCase.equals("lower")) {
                    setUppercase();
                    return;
                }
            }
        });

        binding.buttonLWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginWithAmazon();
            }
        });

    }

    public void showResults() {
        Intent intent = new Intent(this, ResultsActivity.class);
        String message = "Registering your email address via the remote took " + ActualKeyPresses + " keypresses.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void LoginWithAmazon() {
        startActivity(new Intent(this, LWAActivity.class));
    }

    public void setLowercase() {
        KeyboardCase = "lower";
        Button myAButton = (Button) findViewById(R.id.buttonA);
        myAButton.setText("a");
        Button myBButton = (Button) findViewById(R.id.buttonB);
        myBButton.setText("b");
        Button myCButton = (Button) findViewById(R.id.buttonC);
        myCButton.setText("c");
        Button myDButton = (Button) findViewById(R.id.buttonD);
        myDButton.setText("d");
        Button myEButton = (Button) findViewById(R.id.buttonE);
        myEButton.setText("e");
        Button myFButton = (Button) findViewById(R.id.buttonF);
        myFButton.setText("f");
        Button myGButton = (Button) findViewById(R.id.buttonG);
        myGButton.setText("g");
        Button myHButton = (Button) findViewById(R.id.buttonH);
        myHButton.setText("h");
        Button myIButton = (Button) findViewById(R.id.buttonI);
        myIButton.setText("i");
        Button myJButton = (Button) findViewById(R.id.buttonJ);
        myJButton.setText("j");
        Button myKButton = (Button) findViewById(R.id.buttonK);
        myKButton.setText("k");
        Button myLButton = (Button) findViewById(R.id.buttonL);
        myLButton.setText("l");
        Button myMButton = (Button) findViewById(R.id.buttonM);
        myMButton.setText("m");
        Button myNButton = (Button) findViewById(R.id.buttonN);
        myNButton.setText("n");
        Button myOButton = (Button) findViewById(R.id.buttonO);
        myOButton.setText("o");
        Button myPButton = (Button) findViewById(R.id.buttonP);
        myPButton.setText("p");
        Button myQButton = (Button) findViewById(R.id.buttonQ);
        myQButton.setText("q");
        Button myRButton = (Button) findViewById(R.id.buttonR);
        myRButton.setText("r");
        Button mySButton = (Button) findViewById(R.id.buttonS);
        mySButton.setText("s");
        Button myTButton = (Button) findViewById(R.id.buttonT);
        myTButton.setText("t");
        Button myUButton = (Button) findViewById(R.id.buttonU);
        myUButton.setText("u");
        Button myVButton = (Button) findViewById(R.id.buttonV);
        myVButton.setText("v");
        Button myWButton = (Button) findViewById(R.id.buttonW);
        myWButton.setText("w");
        Button myXButton = (Button) findViewById(R.id.buttonX);
        myXButton.setText("x");
        Button myYButton = (Button) findViewById(R.id.buttonY);
        myYButton.setText("y");
        Button myZButton = (Button) findViewById(R.id.buttonZ);
        myZButton.setText("z");
    }

    public void setUppercase() {
        KeyboardCase = "upper";
        Button myAButton = (Button) findViewById(R.id.buttonA);
        myAButton.setText("A");
        Button myBButton = (Button) findViewById(R.id.buttonB);
        myBButton.setText("B");
        Button myCButton = (Button) findViewById(R.id.buttonC);
        myCButton.setText("C");
        Button myDButton = (Button) findViewById(R.id.buttonD);
        myDButton.setText("D");
        Button myEButton = (Button) findViewById(R.id.buttonE);
        myEButton.setText("E");
        Button myFButton = (Button) findViewById(R.id.buttonF);
        myFButton.setText("F");
        Button myGButton = (Button) findViewById(R.id.buttonG);
        myGButton.setText("G");
        Button myHButton = (Button) findViewById(R.id.buttonH);
        myHButton.setText("H");
        Button myIButton = (Button) findViewById(R.id.buttonI);
        myIButton.setText("I");
        Button myJButton = (Button) findViewById(R.id.buttonJ);
        myJButton.setText("J");
        Button myKButton = (Button) findViewById(R.id.buttonK);
        myKButton.setText("K");
        Button myLButton = (Button) findViewById(R.id.buttonL);
        myLButton.setText("L");
        Button myMButton = (Button) findViewById(R.id.buttonM);
        myMButton.setText("M");
        Button myNButton = (Button) findViewById(R.id.buttonN);
        myNButton.setText("N");
        Button myOButton = (Button) findViewById(R.id.buttonO);
        myOButton.setText("O");
        Button myPButton = (Button) findViewById(R.id.buttonP);
        myPButton.setText("P");
        Button myQButton = (Button) findViewById(R.id.buttonQ);
        myQButton.setText("Q");
        Button myRButton = (Button) findViewById(R.id.buttonR);
        myRButton.setText("R");
        Button mySButton = (Button) findViewById(R.id.buttonS);
        mySButton.setText("S");
        Button myTButton = (Button) findViewById(R.id.buttonT);
        myTButton.setText("T");
        Button myUButton = (Button) findViewById(R.id.buttonU);
        myUButton.setText("U");
        Button myVButton = (Button) findViewById(R.id.buttonV);
        myVButton.setText("V");
        Button myWButton = (Button) findViewById(R.id.buttonW);
        myWButton.setText("W");
        Button myXButton = (Button) findViewById(R.id.buttonX);
        myXButton.setText("X");
        Button myYButton = (Button) findViewById(R.id.buttonY);
        myYButton.setText("Y");
        Button myZButton = (Button) findViewById(R.id.buttonZ);
        myZButton.setText("Z");
    }
}
