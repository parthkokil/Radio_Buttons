package com.parth.demonstrateradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


//Create an Android Application that Demonstrate Radio Button.

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonSelected;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.Radiogroup);
        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {      // -1 => kahich select nahiye

                    Toast.makeText(MainActivity.this, "Please Select Your Gender", Toast.LENGTH_SHORT).show();
                } else {

                    radioButtonSelected = findViewById(selectedId);

                    String selectedGender = radioButtonSelected.getText().toString();

                    Toast.makeText(MainActivity.this, "Your Gender is " + selectedGender, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}