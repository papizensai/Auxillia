package com.example.auxillia;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declaring fields and buttons
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking variables to buttons & text
        logout = findViewById(R.id.logoutBttn);
    }

   @Override
   protected void onStart()
   {
       super.onStart();

       logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               logOut();
           }
       });
   }

    // will sign user out and send to login
    // to login currently
    private void logOut()
    {
        Intent loginIntent = new Intent (MainActivity.this, LoginActivity.class);
        startActivity(loginIntent);
        finish();
    }
}
