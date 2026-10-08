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
import android.widget.TextView;

public class tratilList extends AppCompatActivity {

    // {title, code}  -> add new records here only
    private static  Object[][] ITEMS = new Object[0][0];
    /*= {
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

       { (new a3tiniKalam()).getTitle() , 60020 },
       { (new a3tinirabi()).getTitle() , 60021 },
       { (new a3tiniYaIlahiMoulk()).getTitle() , 60022 },
       { (new AbanaT()).getTitle() , 60023 },
       { (new abanaWsalama()).getTitle() , 60024 },
       { (new abati()).getTitle() , 60025 },
       { (new abFoukara2()).getTitle() , 60026 },
       { (new ach3ourBelAmen()).getTitle() , 60027 },
       { (new AchrakNourou3alaAbrar()).getTitle() , 60028 },
       { (new ahmadouka().getTitle()) , 60029 },
       { (new anta3azim().getTitle()) , 60030 },
       { (new arakaIlahiArak()).getTitle() , 60031 },
       { (new aredSalla3layaAllah()).getTitle() , 60032 },
       { (new arsaltouka()).getTitle() , 60033 },
       { (new arselRouhaka()).getTitle() , 60034 },
       { (new ibtahijiNafssi()).getTitle() , 60035 },
       { (new ichta2naTemroukMin3ina()).getTitle() , 60036 },
       { (new ikhdimouRab()).getTitle() , 60037 },
       { (new inssanMithloukaKhala2t()).getTitle() , 60038 },
       { (new irfa3IsemFadi()).getTitle() , 60039 },
       { (new is2alouTa3tou()).getTitle() , 60040 },
       { (new ithamniYaAllah()).getTitle() , 60041 },
       { (new itloubouMalakoutLah()).getTitle() , 60042 },
       { (new izhaboufiAlredKoulouha()).getTitle() , 60043 },
       { (new ouhebakRabiYassou3()).getTitle() , 60044 },
       { (new ouhiboukaYaRab()).getTitle() , 60045 },
       { (new outroukKoulaChayi2()).getTitle() , 60046 },
       { (new tabchirMala2ikiT()).getTitle() , 60047 },
    };
    */


private static void BuildFor1(){
    ITEMS = new Object[][]{
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

       { (new a3tiniKalam()).getTitle() , 60020 },
       { (new a3tinirabi()).getTitle() , 60021 },
       { (new a3tiniYaIlahiMoulk()).getTitle() , 60022 },
       { (new AbanaT()).getTitle() , 60023 },
       { (new abanaWsalama()).getTitle() , 60024 },
       { (new abati()).getTitle() , 60025 },
       { (new abFoukara2()).getTitle() , 60026 },
       { (new ach3ourBelAmen()).getTitle() , 60027 },
       { (new AchrakNourou3alaAbrar()).getTitle() , 60028 },
       { (new ahmadouka().getTitle()) , 60029 },
       { (new anta3azim().getTitle()) , 60030 },
       { (new arakaIlahiArak()).getTitle() , 60031 },
       { (new aredSalla3layaAllah()).getTitle() , 60032 },
       { (new arsaltouka()).getTitle() , 60033 },
       { (new arselRouhaka()).getTitle() , 60034 },
       { (new ibtahijiNafssi()).getTitle() , 60035 },
       { (new ichta2naTemroukMin3ina()).getTitle() , 60036 },
       { (new ikhdimouRab()).getTitle() , 60037 },
       { (new inssanMithloukaKhala2t()).getTitle() , 60038 },
       { (new irfa3IsemFadi()).getTitle() , 60039 },
       { (new is2alouTa3tou()).getTitle() , 60040 },
       { (new ithamniYaAllah()).getTitle() , 60041 },
       { (new itloubouMalakoutLah()).getTitle() , 60042 },
       { (new izhaboufiAlredKoulouha()).getTitle() , 60043 },
       { (new ouhebakRabiYassou3()).getTitle() , 60044 },
       { (new ouhiboukaYaRab()).getTitle() , 60045 },
       { (new outroukKoulaChayi2()).getTitle() , 60046 },
       { (new tabchirMala2ikiT()).getTitle() , 60047 },
    };
};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tratil_list);

        TextView title = findViewById(R.id.title);
        title.setText(staticVar.cameFromListTitle);
        
        if(staticVar.cameFromListcode==1){
            BuildFor1(); }
       
      
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
