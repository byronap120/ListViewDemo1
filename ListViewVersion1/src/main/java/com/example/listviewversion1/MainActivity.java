package com.example.listviewversion1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos el array y lo llenamos con los datos que queremos que aparescan en la lista
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Guatemala");
        nombres.add("El Salvador");
        nombres.add("Honduras");
        nombres.add("Nicaragua");
        nombres.add("Costa Rica");
        nombres.add("Panama");
        nombres.add("Guatemala");
        nombres.add("El Salvador");
        nombres.add("Honduras");
        nombres.add("Nicaragua");
        nombres.add("Costa Rica");
        nombres.add("Panama");
        nombres.add("Guatemala");
        nombres.add("El Salvador");
        nombres.add("Honduras");
        nombres.add("Nicaragua");
        nombres.add("Costa Rica");
        nombres.add("Panama");

        //hacemos referencia desde el codigo a nuestro listview del layout
        ListView ListaUI = (ListView) findViewById(R.id.ListaPaises);

        //creamos el adaptador para nuestra lista
        ListaUI.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
