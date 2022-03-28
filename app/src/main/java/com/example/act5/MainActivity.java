package com.example.act5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variabel Untuk Button
    Button btnlogin;

    //Deklarasi Variabel Untuk EditText
    EditText edemail, edpassword;

    //Deklarasi Variabel Untuk Menyimpan Email dan Password
    String username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnlogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                username = edemail.getText().toString();
                password =edpassword.getText().toString();
                 String email ="naufal";
                 String pass ="nopal";

                 if (username.equals(email) && password.equals(pass)) {
                     Toast t = Toast.makeText(getApplicationContext(),
                             "login sukses", Toast.LENGTH_SHORT);
                     t.show();
                      Bundle b = new Bundle();

                      b.putString("a", username.trim());
                      b.putString("b", password.trim());

                      Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                      i.putExtras(b);

                      startActivity(i);


                 }else{
                     Toast t =Toast.makeText(getApplicationContext(),
                             "Login Gagal",Toast.LENGTH_LONG);
                     t.show();

                 }

            }
        }
        );
    }
}