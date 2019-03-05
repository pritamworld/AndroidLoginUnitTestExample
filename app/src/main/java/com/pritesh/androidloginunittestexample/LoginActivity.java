package com.pritesh.androidloginunittestexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//https://medium.com/@temidjoy/a-simple-local-unit-test-for-a-login-system-on-android-studio-560ff5fd4e39

public class LoginActivity extends AppCompatActivity
{
    private Button btnLogin;
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        userName=(EditText)findViewById(R.id.edtUsername);
        password=(EditText)findViewById(R.id.edtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(),password.getText().toString());
            }
        });
    }

    public String validate(String userName, String password)
    {
        if(userName.equals("user") && password.equals("user"))
            return "Login was successful";
        else
            return "Invalid login!";
    }
}
