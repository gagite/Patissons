package fr.be2.patissons;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    TextView maDate;
    DatePickerDialog picker;
    Calendar calendrier = Calendar.getInstance(); //on declare une classe d'un calendrier qui existe deja
    int jj=calendrier.get(Calendar.DAY_OF_MONTH);
    int mm=calendrier.get(Calendar.MONTH);
    int aaaa=calendrier.get(Calendar.YEAR);

    TextView nbpersonne;

    Button plus;
    Button moin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.Button_plus);
        moin = findViewById(R.id.boutton_moin);
        nbpersonne = findViewById(R.id.quantite);
        maDate = findViewById(R.id.textview_FraisAuForfait_date);
    }


    public void ShowCal(View vv)
    {
        picker = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        maDate.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                        //date qu'on recupere une fois qu'on a selectionne
                    }
                },aaaa, mm, jj);//date qui s'affiche sur le calendrier
        picker.show();
    }
    int quantite = 0;
    public void plus(View vv){
        // Augmenter la quantité de 1
        quantite ++;

        nbpersonne.setText( quantite + " personne(s)");
    }
    public void moin(View vv){
        // diminue la quantité de 1
        quantite --;

        nbpersonne.setText( quantite + " personne(s)");
    }

    public void continuer(View vv){
        intent = new Intent(MainActivity.this, recette.class);
        startActivity(intent);
        
    }
}