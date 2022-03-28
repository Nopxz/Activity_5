package com.example.act5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView Nama,NoHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Nama = findViewById(R.id.tf_nama);
        NoHp = findViewById(R.id.tf_nohp);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Naufal":
                Nama.setText("Naufal");
                NoHp.setText("08222122345");
                break;
            case "Gita":
                Nama.setText("Gita");
                NoHp.setText("08123234122");
                break;
            case "Mahardika":
                Nama.setText("Mahardika");
                NoHp.setText("08112343123");
                break;
            case "Rizky":
                Nama.setText("Rizky");
                NoHp.setText("082221258421");
                break;
            case "Alam":
                Nama.setText("Alam");
                NoHp.setText("08222128422");
                break;

        }
    }
}