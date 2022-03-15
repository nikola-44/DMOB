package com.example.cook_eat;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Seconnecter extends AppCompatActivity {
//    private String username = (EditText)findViewById(R.id.edittext); = R.id.editTextTextPersonName.;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.seconnecter);
            setTitle("Se connecter");
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("AppBar","Création");
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_accueil:
                Log.d("ToolBar","=> Accueil");
                displayToast("Accueil");
                Intent intent = new Intent(Seconnecter.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_recherche:
                Log.d("ToolBar","=> Recherche");
                displayToast("Recherche");
                Intent intent2 = new Intent(Seconnecter.this, Rechercher.class);
                startActivity(intent2);
                return true;
            case R.id.action_ajouterrecette:
                Log.d("ToolBar","=> Ajouter recette");
                displayToast("Ajouter recette");
                return true;
            case R.id.action_mesrecettes:
                Log.d("ToolBar","=> Mes recettes");
                displayToast("Mes recettes");
                return true;
            case R.id.action_favoris:
                Log.d("ToolBar","=> Favoris");
                displayToast("Favoris");
                return true;
            case R.id.action_comtpe:
                Log.d("ToolBar","=> Compte");
                displayToast("Compte");
                return true;
            case R.id.action_sinscrire:
                Log.d("ToolBar","=> S'inscrire");
                displayToast("S'inscrire");
//                newGame();
                return true;
            case R.id.action_seconnecter:
                Log.d("ToolBar","=> Se connecter");
                displayToast("Se connecter");
                Intent intent8 = new Intent(Seconnecter.this, Seconnecter.class);
//                intent.putExtra("Blablabla", "hihihi");
                startActivity(intent8);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void connexion(View view) {
            EditText input =(EditText)findViewById(R.id.editTextTextPersonName);
            if(input.getText().toString().equals("hello")){
                displayToast("Ca marche!");
            }
    }
}
