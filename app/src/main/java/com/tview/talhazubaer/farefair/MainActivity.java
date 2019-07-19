package com.tview.talhazubaer.farefair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    Toolbar toolbar;
    ListView listView;
    ArrayAdapter<String> adapter;
    SearchView searchView;
    String[] countryNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));

        listView= findViewById(R.id.listViewId);
        searchView=findViewById(R.id.searchViewId);

        countryNames=getResources().getStringArray(R.array.country_name);

        adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.textViewId,countryNames);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        //developer.setOnClickListener();
    }


    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        String value=adapter.getItem(position);
        Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("countryNames", listView.getItemAtPosition(position).toString());
        startActivity(intent);

    }


}
