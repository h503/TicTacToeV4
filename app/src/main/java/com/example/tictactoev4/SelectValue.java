package com.example.tictactoev4;
import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class SelectValue extends MainActivity implements View.OnClickListener
{
    // Creating Buttons

    // Button X
    private Button buttonX;

    // Button O
    private Button buttonO;

    // Character Array
    public char[] selection = new char[9];

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Setting to X and O Board
        setContentView(R.layout.tictactoe);

        // Button X
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonX.setOnClickListener(this);

        // Button O
        buttonO = (Button) findViewById(R.id.buttonO);
        buttonO.setOnClickListener(this);
    }

    // OnClick Listener Method
    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.buttonX)
        {
            // Set Corresponding Clicked Button to X
            if (isClickedButtonZero)
            {
                // Change variables in another class
                //throw new RuntimeException("This is a crash");
                // buttonOne.setText("X"); // BUGGGGGG

                // Inputting X into array
                selection[0] = 'X';

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if (isClickedButtonOne)
            {

                // Inputting X into array
                selection[1] = 'X';

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if (isClickedButtonTwo)
            {

                // Inputting X into array
                selection[2] = 'X';

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if(isClickedButtonThree)
            {

                // Inputting X into array
                selection[3] = 'X';

                // Set Corresponding Clicked Button to O
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if(isClickedButtonFour)
            {
                // Inputting X into array
                selection[4] = 'X';

                // Set Corresponding Clicked Button to O
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if(isClickedButtonFive)
            {
                // Inputting X into array
                selection[5] = 'X';

                // Set Corresponding Clicked Button to O
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if (isClickedButtonSix)
            {
                // Inputting X into array
                selection[6] = 'X';

                // Set Corresponding Clicked Button to O
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else if (isClickedButtonSeven)
            {
                // Inputting X into array
                selection[7] = 'X';

                // Set Corresponding Clicked Button to O
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }

            else
            {
                // Inputting X into array
                selection[8] = 'X';

                // Set Corresponding Clicked Button to O
                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", "X");

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        }

        else if(v.getId() == R.id.buttonO)
        {
            if (isClickedButtonZero)
            {
                // Inputting O into array
                selection[0] = 'O';

                if (selection[0] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }

            else if(isClickedButtonOne)
            {
                // Inputting O into array
                selection[1] = 'O';

                if (selection[1] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }

            // BIG ERROR WITH SECOND BUTTON NOT CLICKING
            else if(isClickedButtonTwo)
            {
                // Inputting 0 into array
                selection[2] = 'O';

                if (selection[2] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", 'O');

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            }

            else if(isClickedButtonThree)
            {
                // Inputting 0 into array
                selection[3] = 'O';

                if (selection[3] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }

            else if(isClickedButtonFour)
            {
                // Inputting 0 into array
                selection[4] = 'O';

                if (selection[4] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }

            else if(isClickedButtonFive)
            {
                // Inputting 0 into array
                selection[5] = 'O';

                if (selection[5] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else {

                    throw new RuntimeException("This is a crash");
                }
            }

            else if (isClickedButtonSix)
            {
                // Inputting 0 into array
                selection[6] = 'O';

                if (selection[6] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }

            else if (isClickedButtonSeven)
            {
                // Inputting 0 into array
                selection[7] = 'O';

                if (selection[7] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }

            else
            {
                // Inputting 0 into array
                selection[8] = 'O';

                if (selection[8] == 'O')
                {
                    // Set Corresponding Clicked Button to O
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("result", "O");

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
                else
                {
                    throw new RuntimeException("This is a crash");
                }
            }
        }
    }
}