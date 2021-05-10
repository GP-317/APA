package com.example.apa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class PageMedecin extends AppCompatActivity {

    private Button btnCreateAPA;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_medecin);

        FragmentManager frManager = getSupportFragmentManager();

        btnCreateAPA = findViewById(R.id.add_apa);
        btnCreateAPA.setOnClickListener(v -> {
            AddAPA fragment = new AddAPA();
            FragmentTransaction frTransaction = frManager.beginTransaction();
            frTransaction.add().commit();
            btnCreateAPA.setVisibility(View.GONE);
        });
    }




}
