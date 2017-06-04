package com.trampapp.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseReference= FirebaseDatabase.getInstance().getReference();
        Flower NewFlower= new Flower("Rose","","3");
        databaseReference.child(NewFlower.name).setValue(NewFlower);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}

