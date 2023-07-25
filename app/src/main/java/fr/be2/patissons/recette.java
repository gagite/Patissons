package fr.be2.patissons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class recette extends MainActivity {
Spinner smiley;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recette);
        smiley = findViewById(R.id.list_box);

    }


    public void quitter(View v){
        AlertDialog.Builder alerte = new AlertDialog.Builder(this);
        alerte.setTitle("Attention");
        alerte.setMessage("Voulez vous quittez?");
        alerte.setPositiveButton("oui", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish(); // L'utilisateur a cliqué sur le bouton OK
            }
        });
        alerte.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // L'utilisateur a cliqué sur le bouton Annuler
            }
        });
        AlertDialog dialog = alerte.create();
        dialog.show();
    }
}