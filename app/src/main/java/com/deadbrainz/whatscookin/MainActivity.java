package com.deadbrainz.whatscookin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private EditText username,password;




    public void ButtononClick(View v){
        username= (EditText) findViewById(R.id.brukernavn);
        password= (EditText) findViewById(R.id.passord);


        if(username.getText().toString().equals("brukernavn") && password.getText().toString().equals("passord")){
            startActivity(new Intent(MainActivity.this, Afterlogin.class));

        }else {
            Toast toast= new Toast(getApplicationContext());
            Toast.makeText(getApplicationContext(), "Wrong inputs " + username.getText() +" "+password.getText(), Toast.LENGTH_LONG).show();
        }

    }






}
