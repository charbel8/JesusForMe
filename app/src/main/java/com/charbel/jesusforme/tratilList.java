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
import com.charbel.jesusforme.data.tratil.mounaa2.*;
import com.charbel.jesusforme.data.tratil.mounaa3.*;
import com.charbel.jesusforme.data.tratil.mounaa4.*;
import android.widget.TextView;

public class tratilList extends AppCompatActivity {

    // {title, code}  -> add new records here only
    private static  Object[][] ITEMS = new Object[0][0];
    

private static void BuildFor1(){
    ITEMS = new Object[][]{     
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
};
    
private static void BuildFor2(){
    ITEMS = new Object[][]{
       { (new oudElSalib()).getTitle() , 60000},
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

private static void BuildFor3(){
    ITEMS = new Object[][]{
        { (new al3alamJa2i3()).getTitle() , 60048},
        { (new alhamdouWalChoukran()).getTitle() , 60049},
        { (new alhamedWalMajed()).getTitle() , 60050},
        { (new alki2alaRabHamouka()).getTitle() , 60051},
        { (new allahNouryKhalassi()).getTitle() , 60052},
        { (new allahoumaSma3Khalassi()).getTitle() , 60053},
        { (new almajdLaka()).getTitle() , 60054},
        { (new almajdMalikMajed()).getTitle() , 60055},
        { (new AlmajdouAllahFiAl2a3ali()).getTitle() , 60056},
        { (new Almassi7KamMinBayinAmouwat()).getTitle() , 60057},
        { (new alrabHouwaAllah()).getTitle() , 60058},
        { (new alrabNouryKhalasi()).getTitle() , 60059},
        { (new alrabouRa3i()).getTitle() , 60060},
        { (new alrabRahimSami3()).getTitle() , 60061},
        { (new alrabYamchi()).getTitle() , 60062},
        { (new alrabYassou3Wassatouna()).getTitle() , 60063},
        { (new Alrou7Yajma3ouna()).getTitle() , 60064},
        { (new alsadikKalNakhel()).getTitle() , 60065},
        { (new anaNadaytoukaYaAllah()).getTitle() , 60066},
        { (new annaKouliIman()).getTitle() , 60067},
    };
};

    private static void BuildFor4(){
    ITEMS = new Object[][]{
        { (new annaMousta3id()).getTitle() , 60068},
        { (new annaRabKa2inat()).getTitle() , 60069},
        { (new annaWakif3alaBabak()).getTitle() , 60070},
        { (new antaChafi()).getTitle() , 60071},
        { (new antaChafi3Akdam()).getTitle() , 60072},
        { (new antaIlahi()).getTitle() , 60073},
        { (new antaKoultLiHaloumou()).getTitle() , 60074},
        { (new antaMoulkouna()).getTitle() , 60075},
        { (new antaWa7dakDa3out()).getTitle() , 60076},
        { (new antoumMil7Ared()).getTitle() , 60077},
        { (new ilahhi2ousabi7ouka()).getTitle() , 60078},
        { (new ilahiRaffa3tIlaykaYady()).getTitle() , 60079},
        { (new ilahouna()).getTitle() , 60080},
        { (new ilahouna3alli()).getTitle() , 60081},
        { (new ilaykaRafa3tou3aynay()).getTitle() , 60082},
        { (new ilaykaYassou32Touk()).getTitle() , 60083},
        { (new ilaykiWouroudYaMariam()).getTitle() , 60084},
        { (new ilaykKalbiHayati()).getTitle() , 60085},
        { (new illaAkassiAred()).getTitle() , 60086},
        { (new inaclaKam7a()).getTitle() , 60087},
        { (new inaFara7RabKouwatana()).getTitle() , 60088},
        { (new inLanTa3oudouKalAtfal()).getTitle() , 60089},
        { (new inni7abatKam7i()).getTitle() , 60090},      
        { (new oumounaMariam()).getTitle() , 60091},
    };
};

  private static void BuildFor5(){
    ITEMS = new Object[][]{
        { (new anna3alaBabak()).getTitle() , 60092}, 
        { (new ayouhaAbKoudous()).getTitle() , 60093}, 
        { (new ayouhaMassihKalima()).getTitle() , 60094}, 
        { (new barikiNafssiElRab()).getTitle() , 60095}, 
        { (new barikYaRabChabak()).getTitle() , 60096}, 
        { (new bassmeh7elweh()).getTitle() , 60097}, 
        { (new bhebakYaYassou3()).getTitle() , 60098}, 
        { (new bidamYassou3()).getTitle() , 60099}, 
        { (new bikalebMahbassy()).getTitle() , 60100}, 
        { (new bima2oukafi2Rab()).getTitle() , 60101}, 
        { (new bismikaAlyomNajtami3()).getTitle() , 60102}, 
        { (new bissikaAtakadam()).getTitle() , 60103}, 
        { (new bnourakN3ayinNour()).getTitle() , 60104}, 
        { (new bsawtiIlaRab()).getTitle() , 60105}, 
        { (new bwehdetnaSalamna()).getTitle() , 60106}, 
        { (new charbelWelSalla()).getTitle() , 60107}, 
        { (new chilElZa3al()).getTitle() , 60108}, 
        { (new chouHelwehElSama()).getTitle() , 60109}, 
        { (new hajtiDawman2illak()).getTitle() , 60110}, 
        { (new hananakYaRabAkwan()).getTitle() , 60111}, 
        { (new hattaMata()).getTitle() , 60112}, 
        { (new hayatiHiyaMassi7()).getTitle() , 60113}, 
        { (new ihtifoulelrab()).getTitle() , 60114}, 
        { (new jamilat2anti()).getTitle() , 60115}, 
        { (new jaritKourban()).getTitle() , 60116}, 
        { (new jayiL3indak()).getTitle() , 60117}, 
        { (new jinna2idassan2idess()).getTitle() , 60118}, 
        { (new kebezKhamerMay()).getTitle() , 60119}, 
        { (new khallesCha3bak()).getTitle() , 60120}, 
        { (new khatabRabCha3bouh()).getTitle() , 60121}, 
        { (new kheweHe7deh()).getTitle() , 60122}, 
        { (new khouzHayatiYaRab()).getTitle() , 60123}, 
        { (new RabMajed()).getTitle() , 60124},		
    };
};
		
  private static void BuildFor6(){
    ITEMS = new Object[][]{		 
        { (new khouzYaRab()).getTitle() , 60125}, 
        { (new rabbiAnnaWarakaBayda2()).getTitle() , 60127}, 
        { (new rabbiAntaTasstati3()).getTitle() , 60128}, 
        { (new rabbiJassadouka()).getTitle() , 60129}, 
        { (new rabbiTakabal()).getTitle() , 60130}, 
        { (new rabi3azzim()).getTitle() , 60131}, 
        { (new rabiIj3alni()).getTitle() , 60132}, 
        { (new rabiJassadouka()).getTitle() , 60133}, 
        { (new rabiKoulaChayi2()).getTitle() , 60134}, 
        { (new raffa3t3aynni()).getTitle() , 60135}, 
        { (new rajawtRab()).getTitle() , 60136}, 
        { (new rannimHallilouya()).getTitle() , 60137}, 
        { (new ranSawtMin2a3la()).getTitle() , 60138}, 
        { (new rissala2a3titani()).getTitle() , 60139},
        { (new sabbi7ouAlRab()).getTitle() , 60140}, 
        { (new sallamSallam()).getTitle() , 60141}, 
        { (new sallamtKalbi()).getTitle() , 60142}, 
        { (new salwaKouloub()).getTitle() , 60143}, 
        { (new sarkhati()).getTitle() , 60144}, 
        { (new sawfaAkoudoukoum()).getTitle() , 60145}, 
        { (new sehran()).getTitle() , 60146}, 
        { (new shekerAlla()).getTitle() , 60147}, 
        { (new snninTawilleh()).getTitle() , 60148}, 
        { (new ta3alaMla2niL2an()).getTitle() , 60149}, 
        { (new ta3alBaynana()).getTitle() , 60150}, 
        { (new ta3alouIlaRab()).getTitle() , 60151}, 
        { (new thallaKalbi()).getTitle() , 60152}, 
        { (new tjalla()).getTitle() , 60153}, 
        { (new toubou()).getTitle() , 60154}, 
        { (new toubouIlaRab()).getTitle() , 60155}, 
        { (new twakalna3Alla()).getTitle() , 60156}, 
        { (new yaRavRahmak()).getTitle() , 60157}, 
        { (new zahraFiBiladi()).getTitle() , 60158}, 
    };
};


    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tratil_list);

        TextView title = findViewById(R.id.title);
        title.setText(staticVar.cameFromListTitle);

        switch(staticVar.cameFromListcode) {
            case 1:  BuildFor1();  break;
            case 2:  BuildFor2();  break;
            case 3:  BuildFor3();  break;
            case 4:  BuildFor4();  break;
            case 5:  BuildFor5();  break;
            case 6:  BuildFor6();  break;
            default:  BuildFor1();
        }
              
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
