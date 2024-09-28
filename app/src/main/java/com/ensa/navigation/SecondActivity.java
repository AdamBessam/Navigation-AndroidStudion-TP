package com.ensa.navigation;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView nom,phone,email,ville,adresse;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nom=findViewById(R.id.nom);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        ville = findViewById(R.id.ville);
        adresse=findViewById(R.id.adresse);
        String nomValue = this.getIntent().getStringExtra("nom");
        String phoneValue = this.getIntent().getStringExtra("phone");
        String adresseValue = this.getIntent().getStringExtra("adresse");
        String emailValue = this.getIntent().getStringExtra("email");
        String villeValue = this.getIntent().getStringExtra("ville");
        nom.setText("Nom : "+nomValue);
        email.setText("Email : "+emailValue);
        phone.setText("Phone : "+phoneValue);
        adresse.setText("Adresse : "+adresseValue);
        ville.setText("Ville : "+villeValue);







    }
}