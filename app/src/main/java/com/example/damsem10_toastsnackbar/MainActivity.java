package com.example.damsem10_toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button  btnSnackBar1, btnSnackBar2,btnSnackBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Vinculamos

        btnSnackBar1 = findViewById(R.id.buttonSnackBar1);
        btnSnackBar2 = findViewById(R.id.buttonSnackBar2);
        btnSnackBar3 = findViewById(R.id.buttonSnackBar3);
        // Evento Click

                btnSnackBar1.setOnClickListener(this);
                btnSnackBar2.setOnClickListener(this);
                btnSnackBar3.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonSnackBar1){
            Snackbar.make(v, "Duracion Larga", Snackbar.LENGTH_LONG).show();

       }/* else{
           // Snackbar.make(v, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_LONG).show();
        } */
        if(v.getId()==R.id.buttonSnackBar2){
            Snackbar.make(v, "Duracion Corta", Snackbar.LENGTH_SHORT).show();
           // Toast.makeText(this, "Mostrando buttonSnackBar2", Toast.LENGTH_SHORT).show();
        }/*else{
        } */
        if(v.getId()==R.id.buttonSnackBar3){
            Snackbar.make(v, "Duracion Indefinida", Snackbar.LENGTH_INDEFINITE).show();
        }else{
        }
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}