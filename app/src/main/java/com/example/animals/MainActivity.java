package com.example.animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] arr = {"Cat", "Dog", "Rabbit", "Horse", "Camel"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.item_view, arr);

        ListView listView = findViewById(R.id.animalList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //TODO: ASK ABOUT HOW THIS WORKS EXACTLY AND WHAT ALL PARAMETERS MEAN
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent;

                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, CatActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, DogActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, RabbitActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, HorseActivity.class);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, CamelActivity.class);
                        break;
                    default:
                        intent = null;
                }

                if (intent != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
