package com.example.fragments1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
/**
 * MainActivity is the main entry point of the application.
 * It allows users to switch between two fragments: SmsFragment and EmailFragment.
 */
public class MainActivity extends AppCompatActivity {
    // UI elements
    Button btSms, btEmail;
    // Fragments
    Fragment smsFragment, emailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Set the user interface layout for this Activity
// The layout file is defined in the project res/layout/activity_main.xml file

        setContentView(R.layout.activity_main);
// Initialize UI elements
        btSms = findViewById(R.id.btSms);
        btEmail = findViewById(R.id.btEmail);
// Set click listener for the SMS button
        btSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Create a new instance of SmsFragment
             //   smsFragment = new SmsFragment();
// Get the FragmentManager and start a transaction
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// Replace the content of the fragmentContainerView with SmsFragment
                ft.replace(R.id.fragmentContainerView, smsFragment);
// Commit the transaction
                ft.commit();
            }
        });
// Set click listener for the Email button
        btEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// Create a new instance of EmailFragment
                emailFragment = new EmailFragment();
// Get the FragmentManager and start a transaction
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// Replace the content of the fragmentContainerView with EmailFragment
                ft.replace(R.id.fragmentContainerView, emailFragment);
// Commit the transaction
                ft.commit();
            }
        });
    }
}