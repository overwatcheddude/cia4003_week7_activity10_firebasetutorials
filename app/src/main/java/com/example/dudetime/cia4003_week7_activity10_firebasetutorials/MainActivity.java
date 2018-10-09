package com.example.dudetime.cia4003_week7_activity10_firebasetutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    //Global variable
    private DatabaseReference myFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFirebase = FirebaseDatabase.getInstance().getReference();
    }

    public void myBtn(View v)
    {
        myFirebase.child("Name").setValue("DMC");
    }
}
