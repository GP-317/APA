package com.example.apa;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FragmentConnector extends Fragment {

    public FragmentConnector()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_connector,
                container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        Button boutonConnection = view.findViewById(R.id.login);
        MainActivity activity = (MainActivity) getActivity();
        boutonConnection.setOnClickListener(v -> {
            //Intent espacePatientIntent = new Intent(
            //      activity.getApplicationContext(), PagePatient.class);
            //startActivity(espacePatientIntent);
            Intent espaceMedecinIntent = new Intent(
                    activity.getApplicationContext(), PageMedecin.class);
            startActivity(espaceMedecinIntent);
        });
    }

}
