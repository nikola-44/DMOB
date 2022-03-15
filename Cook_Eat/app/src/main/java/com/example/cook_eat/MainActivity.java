package com.example.cook_eat;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.myToolBar);
        setTitle("Accueil");
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
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_recherche:
                Log.d("ToolBar","=> Recherche");
                displayToast("Recherche");
                Intent intent2 = new Intent(MainActivity.this, Rechercher.class);
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
                Intent intent8 = new Intent(MainActivity.this, Seconnecter.class);
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
}