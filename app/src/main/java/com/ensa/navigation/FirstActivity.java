package com.ensa.navigation;

import static com.ensa.navigation.R.id.ville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FirstActivity extends AppCompatActivity {
    private EditText nom,phone,adresse,email;
    private Spinner ville;
    private Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        nom=findViewById(R.id.nom);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        email=findViewById(R.id.email);
        ville=findViewById(R.id.ville);
        envoyer=findViewById(R.id.envoyer);
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("nom",nom.getText().toString());
                intent.putExtra("phone",phone.getText().toString());
                intent.putExtra("adresse",adresse.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("ville",ville.getSelectedItem().toString());
                startActivity(intent);
                nom.setText("");
                phone.setText("");
                adresse.setText("");
                email.setText("");

            }
        });
    }
}