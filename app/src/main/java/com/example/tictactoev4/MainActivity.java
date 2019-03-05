package com.example.tictactoev4;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // Creating buttons

    //Button One
    public Button buttonZero;
    public static boolean isClickedButtonZero = false;

    // Button Two
    public Button buttonOne;
    public static boolean isClickedButtonOne = false;

    // Button Three
    public Button buttonTwo;
    public static boolean isClickedButtonTwo = false;

    // Button Four
    public Button buttonThree;
    public static boolean isClickedButtonThree = false;

    // Button Five
    public Button buttonFour;
    public static boolean isClickedButtonFour = false;

    // Button Six
    public Button buttonFive;
    public static boolean isClickedButtonFive = false;

    // Button Seven
    public Button buttonSix;
    public static boolean isClickedButtonSix = false;

    // Button Eight
    public Button buttonSeven;
    public static boolean isClickedButtonSeven = false;

    // Button Nine
    public Button buttonEight;
    public static boolean isClickedButtonEight = false;

    // Array of choices
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // What to set the app too upon initial creation
        setContentView(R.layout.content_main);

        // Button Zero
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(this);

        // Button One
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(this);

        // Button Three
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(this);

        // Button Four
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(this);

        // Button Five
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(this);

        // Button Six
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(this);

        // Button Seven
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(this);

        // Button Eight
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(this);

        // Button Nine
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(this);
    }

    // OnClick Listener Method
    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.buttonZero)
        {
            // Button One was clicked
            isClickedButtonZero = true;

            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if (v.getId() == R.id.buttonOne)
        {
            // Button Two was clicked
            isClickedButtonOne = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if (v.getId() == R.id.buttonTwo)
        {
            // Button Three was clicked
            isClickedButtonTwo = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if(v.getId() == R.id.buttonThree)
        {
            // Button Three was clicked
            isClickedButtonThree = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if (v.getId() == R.id.buttonFour)
        {
            // Button Three was clicked
            isClickedButtonFour = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if (v.getId() == R.id.buttonFive)
        {
            // Button Three was clicked
            isClickedButtonFive = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if (v.getId() == R.id.buttonSix)
        {
            // Button Three was clicked
            isClickedButtonSix = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else if (v.getId() == R.id.buttonSeven)
        {
            // Button Three was clicked
            isClickedButtonSeven = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }

        else
        {
            // Button Three was clicked
            isClickedButtonEight = true;
            // Intent to Select X or O
            Intent XorO = new Intent(getApplicationContext(), SelectValue.class);
            // Activate Code (Interaction between multi screen intents)
            startActivityForResult(XorO, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1)
        {
            if (resultCode == RESULT_OK)
            {
                if (isClickedButtonZero)
                {
                    String result = data.getStringExtra("result");
                    buttonZero.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonZero = false;
                }

                else if(isClickedButtonOne)
                {
                    String result = data.getStringExtra("result");
                    buttonOne.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonOne = false;
                }

                else if(isClickedButtonTwo)
                {
                    String result = data.getStringExtra("result");
                    buttonTwo.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonTwo = false;
                }

                else if(isClickedButtonThree)
                {
                    String result = data.getStringExtra("result");
                    buttonThree.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonThree = false;
                }

                else if(isClickedButtonFour)
                {
                    String result = data.getStringExtra("result");
                    buttonFour.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonFour = false;
                }

                else if(isClickedButtonFive)
                {
                    String result = data.getStringExtra("result");
                    buttonFive.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonFive = false;
                }

                else if (isClickedButtonSix)
                {
                    String result = data.getStringExtra("result");
                    buttonSix.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonSix = false;
                }

                else if (isClickedButtonSeven)
                {
                    String result = data.getStringExtra("result");
                    buttonSeven.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonSeven = false;
                }

                else
                {
                    String result = data.getStringExtra("result");
                    buttonEight.setText(result);
                    // To prevent incorrect activation of button
                    isClickedButtonEight = false;
                }
            }
        }
    }
}