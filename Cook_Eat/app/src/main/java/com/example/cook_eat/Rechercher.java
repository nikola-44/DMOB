package com.example.cook_eat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Rechercher extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recherche);
        setTitle("Rechercher");
        ListView listView=(ListView) findViewById(R.id.list_view_id);
        String[] items = {"Américaine", "Indienne", "Chinoise", "Italienne",
        "Espagnole", "Française", "Mexicaine", "Libannaise"};
        arrayList = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.txtitem, arrayList);
        listView.setAdapter(adapter);

        txtInput = (EditText) findViewById(R.id.txtinput);
        Button brAdd = (Button) findViewById(R.id.btadd);
        brAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newItem = txtInput.getText().toString();
                arrayList.add(newItem);
                adapter.notifyDataSetChanged();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("AppBar", "Création");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_accueil:
                Log.d("ToolBar", "=> Accueil");
                displayToast("Accueil");
                Intent intent = new Intent(Rechercher.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_recherche:
                Log.d("ToolBar", "=> Recherche");
                displayToast("Recherche");
                Intent intent2 = new Intent(Rechercher.this, Rechercher.class);
                startActivity(intent2);
                return true;
            case R.id.action_ajouterrecette:
                Log.d("ToolBar", "=> Ajouter recette");
                displayToast("Ajouter recette");
                return true;
            case R.id.action_mesrecettes:
                Log.d("ToolBar", "=> Mes recettes");
                displayToast("Mes recettes");
                return true;
            case R.id.action_favoris:
                Log.d("ToolBar", "=> Favoris");
                displayToast("Favoris");
                return true;
            case R.id.action_comtpe:
                Log.d("ToolBar", "=> Compte");
                displayToast("Compte");
                return true;
            case R.id.action_sinscrire:
                Log.d("ToolBar", "=> S'inscrire");
                displayToast("S'inscrire");
//                newGame();
                return true;
            case R.id.action_seconnecter:
                Log.d("ToolBar", "=> Se connecter");
                displayToast("Se connecter");
                Intent intent8 = new Intent(Rechercher.this, Seconnecter.class);
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

    public void rechercher(View view) {
            displayToast("Vous avez effectuez une recherche!");
    }
}
