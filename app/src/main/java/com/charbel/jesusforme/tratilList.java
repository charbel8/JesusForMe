package com.charbel.jesusforme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.charbel.jesusforme.data.tratil.*;
import com.charbel.jesusforme.data.tratil.mounaa.*;

public class tratilList extends AppCompatActivity {

    // {title, code}  -> add new records here only
    private static final Object[][] ITEMS = {
       { (new oudElSalib()).getTitle() , 
        60000},
        { (new ifrahhi()).getTitle() , 
        60001},
        { (new touazimNafssi()).getTitle() ,
        60002},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tratil_list);

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                goBack();
            }
        });

        findViewById(R.id.backList).setOnClickListener(v -> goBack());

        String[] titles = new String[ITEMS.length];
        for (int i = 0; i < ITEMS.length; i++) {
            titles[i] = (String) ITEMS[i][0];
        }

        ListView listView = findViewById(R.id.tratilListView);
        listView.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, titles));

        listView.setOnItemClickListener((parent, view, position, id) -> {
            staticVar.code = (int) ITEMS[position][1];
            staticVar.cameFromList = true;
            startActivity(new Intent(tratilList.this, dynamicAct.class));
            finish();
        });
    }

    private void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
