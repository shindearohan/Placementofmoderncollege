package com.example.placementmoderncollege;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class StudentRegistration extends Activity {
    EditText mTextUsername;
    EditText mTextPassword;
    EditText getmTextcnfPassword;
    EditText getemail;
    Button mButtonRegister;
    TextView mTextViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);
        mTextUsername=(EditText)findViewById(R.id.username);
        mTextPassword=(EditText)findViewById(R.id.password);
        getmTextcnfPassword=(EditText)findViewById(R.id.cpassword);
       getemail=(EditText)findViewById(R.id.email);
        mButtonRegister=( Button)findViewById(R.id.register);
        mTextViewLogin=( TextView) findViewById(R.id.textview_register);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent=new Intent(StudentRegistration.this,StudentLogin.class);
                startActivity(LoginIntent);
            }
        });
    }
}
