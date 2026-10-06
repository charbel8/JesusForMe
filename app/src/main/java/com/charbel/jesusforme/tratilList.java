package com.charbel.jesusforme;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import com.charbel.jesusforme.data.doua2.*;
import com.charbel.jesusforme.data.massbaha.*;
import com.charbel.jesusforme.data.salatYawmiyeh.*;
import com.charbel.jesusforme.data.salawet.*;
import com.charbel.jesusforme.data.salawetKhassa.*;
import com.charbel.jesusforme.data.telbet.*;
import com.charbel.jesusforme.data.template;
import com.charbel.jesusforme.data.tesawiyet.*;
import com.charbel.jesusforme.data.irchadat.*;
import com.charbel.jesusforme.data.tratil.*;
import com.charbel.jesusforme.data.tratil.AnachidMariam.*;
import com.charbel.jesusforme.data.biography.*;
import com.charbel.jesusforme.data.tratil.mounaa.*;


public class tratilList extends AppCompatActivity {

    // {title, code}  -> add new records here only
    private static final Object[][] ITEMS = {
       { (new oudElSalib()).getTitle() , 60000},
       { (new ifrahhi()).getTitle() , 60001},
       { (new touazimNafssi()).getTitle() , 60002},
      
       { (new wouroud()).getTitle() , 60003},
       { (new yaNajmatSoboh()).getTitle() , 60004},
       { (new alaykisalam()).getTitle() , 60005},
       { (new salamSalam()).getTitle() , 60006},
	   
       { (new nahnouBanouki()).getTitle() , 60007},
       { (new mariamFoukty()).getTitle() , 60008},
       { (new majdouMariam()).getTitle() , 60009},				

       { (new houbouki()).getTitle() , 60010},
       { (new maljaElBanin()).getTitle() , 60011},
       { (new fiZillHimayitiki()).getTitle() , 60012},	

	   { (new sallwaKouloub()).getTitle() , 60013},
       { (new yaOumana()).getTitle() , 60014},
       { (new rayaIftikhar()).getTitle() , 60015},
		
       { (new majdLeb()).getTitle() , 60016},
       { (new oumHayat()).getTitle() , 60017},
       { (new kanzBaraket()).getTitle() , 60018},
	   
       { (new antichafih()).getTitle() , 60019},



        

        
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
            titles[i] = ""+(i+1)+ " - " +( (String) ITEMS[i][0]);
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
