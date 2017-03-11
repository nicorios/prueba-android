package com.oksocios.oksocios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signIn(View view){
        Toast.makeText(getApplicationContext(),"Implementar funcion signIn",Toast.LENGTH_SHORT).show();
    }

    public void forgotPassword(View view){
        Toast.makeText(getApplicationContext(),"Implementar funcion forgotPassword",Toast.LENGTH_SHORT).show();
    }

    public void logIn(View view){
        Toast.makeText(getApplicationContext(),"Implementar funcion logIn()",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ContainerActivity.class);
        startActivity(intent);
}
}
