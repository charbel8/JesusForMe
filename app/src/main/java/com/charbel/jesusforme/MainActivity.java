package com.charbel.jesusforme;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity  extends AppCompatActivity {



    private Button saintCharbel, saintRafqa,saintKassab;
    private Button  alra7ma, rou7koudous, rita1;
    private Button Saintcharbel, SaintRafqaS;

    private Button saintJoseph, saintJoseph2, telbatElAddra;
    private Button tabchirmalaika, telbitkalebyassouh, althaloth, telbetElMawta;
    private Button beforsleep, ssaidniyarab,myfather;

// ------------------------
    private Button padrePioS1, againstEvil, tssaiiatSaintRita;
    private Button masbahaAlFarah, masbahaAlHezen, masbahaAlMajed, masbahaAlNour;
    private Button alra7maIlahiyeh, telbitAlra7maIlahiyeh;
    private Button gardAngel;

    private Button babyCancer, mariamt7ik3ikad, takrisKalebMariam;
    private Button   takrisKalebYassou3, AnfoudAlmathariyeh;


    private Button btnGroupTsaiiyat, btnGroupTalabet,btnGroupSalawetYawmiyeh, btnGroupSalawet , btnGroupMassebih ;
    private Button  btnGroupSalawetKhassa;
    private LinearLayout TsaiiyatExpandableButtons,talabetExpandableButtons;
    private LinearLayout SalawetkhassaExpandableButtons , SalawetYawmiyehExpandableButtons;
    private LinearLayout SalawetExpandableButtons, MassebihExpandableButtons;
    private boolean isTsaiiyatExpanded = false;
    private boolean istalabetExpanded = false;
    private boolean isSalawetYawmiyeh = false;
    private boolean isSalawet= false;
    private boolean isMassebih= false;
    private boolean isSalawetKhassa= false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


        // --------------Salawet Yawmiyeh ------------------

        btnGroupSalawetYawmiyeh = findViewById(R.id.btnGroupSalawetYawmiyeh);
        SalawetYawmiyehExpandableButtons = findViewById(R.id.SalawetYawmiyehExpandableButtons);
        SalawetYawmiyehExpandableButtons.setVisibility(View.GONE);
        btnGroupSalawetYawmiyeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                staticVar.setGroupNumber(1);

                Expend();
             //   SalawetYawmiyehtoggleExpansion();
            }
        });


        // ------------- Salawet ------------------
        btnGroupSalawet = findViewById(R.id.btnGroupSalawet);
        SalawetExpandableButtons = findViewById(R.id.SalawetExpandableButtons);
        SalawetExpandableButtons.setVisibility(View.GONE);
        btnGroupSalawet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                staticVar.setGroupNumber(2);

                Expend();
               // SalawettoggleExpansion();
            }
        });


      // ------------- Tsaiiyat ------------------
        btnGroupTsaiiyat = findViewById(R.id.btnGroupTsaiiyat);
        TsaiiyatExpandableButtons = findViewById(R.id.tsaiiyatExpandableButtons);
        TsaiiyatExpandableButtons.setVisibility(View.GONE);

        btnGroupTsaiiyat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                staticVar.setGroupNumber(3);

                Expend();
              //  TsaiiyattoggleExpansion();
            }
        });


      // ------------- Talabet ------------------
        btnGroupTalabet = findViewById(R.id.btnGroupTalabet);
        talabetExpandableButtons = findViewById(R.id.talabetExpandableButtons);
        talabetExpandableButtons.setVisibility(View.GONE);

        btnGroupTalabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                staticVar.setGroupNumber(4);

                Expend();
                //talabettoggleExpansion();
            }
        });

        // ------------- Massebih ------------------
        btnGroupMassebih = findViewById(R.id.btnGroupMassebih);
        MassebihExpandableButtons = findViewById(R.id.MassebihExpandableButtons);
        MassebihExpandableButtons.setVisibility(View.GONE);
        btnGroupMassebih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                staticVar.setGroupNumber(5);
                Expend();
              //  MassebihtoggleExpansion();
            }
        });

        //---------------------- SalawetkhassaExpandableButtons -----------
        btnGroupSalawetKhassa =  findViewById(R.id.btnGroupSalawetKhassa);
        SalawetkhassaExpandableButtons = findViewById(R.id.SalawetkhassaExpandableButtons);
        SalawetkhassaExpandableButtons.setVisibility(View.GONE);
        btnGroupSalawetKhassa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                staticVar.setGroupNumber(6);
                Expend();
            }
        });




        // ----------------------------------------------

        saintCharbel = findViewById(R.id.SaintCharbel);
        saintCharbel.setOnClickListener(v -> {
            staticVar.code=1;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        saintRafqa = findViewById(R.id.saintRafqa);
        saintRafqa.setOnClickListener(v -> {
            staticVar.code=2;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        saintKassab = findViewById(R.id.saintKassab);
        saintKassab.setOnClickListener(v -> {
            staticVar.code=3;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        // ---------------------
        alra7ma = findViewById(R.id.alra7ma);
        alra7ma.setOnClickListener(v -> {
            staticVar.code=4;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        rou7koudous = findViewById(R.id.rou7koudous);
        rou7koudous.setOnClickListener(v -> {
            staticVar.code=5;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        rita1 = findViewById(R.id.rita1);
        rita1.setOnClickListener(v -> {
            staticVar.code=6;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });




        Saintcharbel = findViewById(R.id.charbel);
        Saintcharbel.setOnClickListener(v -> {
            staticVar.code=32;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        SaintRafqaS = findViewById(R.id.saintRafqaS);
        SaintRafqaS.setOnClickListener(v -> {
            staticVar.code=33;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        // --------------------
        saintJoseph = findViewById(R.id.saintJoseph);
        saintJoseph.setOnClickListener(v -> {
            staticVar.code=7;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        saintJoseph2 = findViewById(R.id.saintJoseph2);
        saintJoseph2.setOnClickListener(v -> {
            staticVar.code=8;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });



        telbatElAddra = findViewById(R.id.telbatElAddra);
        telbatElAddra.setOnClickListener(v -> {
            staticVar.code=9;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        tabchirmalaika = findViewById(R.id.tabchirmalaika);
        tabchirmalaika.setOnClickListener(v -> {
            staticVar.code=10;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        telbitkalebyassouh = findViewById(R.id.telbitkalebyassouh);
        telbitkalebyassouh.setOnClickListener(v -> {
            staticVar.code=11;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        althaloth = findViewById(R.id.althaloth);
        althaloth.setOnClickListener(v -> {
            staticVar.code=12;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        telbetElMawta = findViewById(R.id.telbetElMawta);
        telbetElMawta.setOnClickListener(v -> {
            staticVar.code=30;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });



        beforsleep = findViewById(R.id.beforsleep);
        beforsleep.setOnClickListener(v -> {
            staticVar.code=13;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        ssaidniyarab = findViewById(R.id.ssaidniyarab);
        ssaidniyarab.setOnClickListener(v -> {
            staticVar.code=14;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        myfather = findViewById(R.id.myfather);
        myfather.setOnClickListener(v -> {
            staticVar.code=15;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        // ---------------------------
        padrePioS1= findViewById(R.id.padrePioS1);
        padrePioS1.setOnClickListener(v -> {
            staticVar.code=16;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        // ---------------------------
        againstEvil= findViewById(R.id.againstEvil);
        againstEvil.setOnClickListener(v -> {
            staticVar.code=17;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });
        // ---------------------------
        tssaiiatSaintRita= findViewById(R.id.tssaiiatSaintRita);
        tssaiiatSaintRita.setOnClickListener(v -> {
            staticVar.code=18;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        //--------------------------
        masbahaAlFarah= findViewById(R.id.masbahaAlFarah);
        masbahaAlFarah.setOnClickListener(v -> {
            staticVar.code=19;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        masbahaAlHezen= findViewById(R.id.masbahaAlHezen);
        masbahaAlHezen.setOnClickListener(v -> {
            staticVar.code=20;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        masbahaAlMajed= findViewById(R.id.masbahaAlMajed);
        masbahaAlMajed.setOnClickListener(v -> {
            staticVar.code=21;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        masbahaAlNour= findViewById(R.id.masbahaAlNour);
        masbahaAlNour.setOnClickListener(v -> {
            staticVar.code=22;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        alra7maIlahiyeh= findViewById(R.id.alra7maIlahiyeh);
        alra7maIlahiyeh.setOnClickListener(v -> {
            staticVar.code=23;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });



        telbitAlra7maIlahiyeh= findViewById(R.id.telbitAlra7maIlahiyeh);
        telbitAlra7maIlahiyeh.setOnClickListener(v -> {
            staticVar.code=24;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        gardAngel= findViewById(R.id.gardAngel);
        gardAngel.setOnClickListener(v -> {
            staticVar.code=25;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        babyCancer= findViewById(R.id.babyCancer);
        babyCancer.setOnClickListener(v -> {
            staticVar.code=26;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        mariamt7ik3ikad= findViewById(R.id.mariamt7ik3ikad);
        mariamt7ik3ikad.setOnClickListener(v -> {
            staticVar.code=27;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });



        takrisKalebMariam= findViewById(R.id.takrisKalebMariam);
        takrisKalebMariam.setOnClickListener(v -> {
            staticVar.code=28;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        takrisKalebYassou3= findViewById(R.id.takrisKalebYassou3);
        takrisKalebYassou3.setOnClickListener(v -> {
            staticVar.code=29;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });

        AnfoudAlmathariyeh= findViewById(R.id.AnfoudAlmathariyeh);
        AnfoudAlmathariyeh.setOnClickListener(v -> {
            staticVar.code=31;
            Intent intent = new Intent(MainActivity.this, dynamicAct.class);
            startActivity(intent);
            finish(); // optional, closes SigActivity so user can't return to it with back button
        });


        Expend();
    }

// ------------------------------ Block selector -------------

    private void Expend(){

      switch (staticVar.getGroupNumber()){
          case 1:
              isSalawetYawmiyeh= true;
              isSalawet= false;
              isTsaiiyatExpanded= false;
              istalabetExpanded= false;
              isMassebih= false;
              isSalawetKhassa =false;
              break;

          case 2:
              isSalawetYawmiyeh= false;
              isSalawet= true;
              isTsaiiyatExpanded= false;
              istalabetExpanded= false;
              isMassebih= false;
              isSalawetKhassa =false;
              break;

          case 3:
              isSalawetYawmiyeh= false;
              isSalawet= false;
              isTsaiiyatExpanded= true;
              istalabetExpanded= false;
              isMassebih= false;
              isSalawetKhassa =false;
              break;
          case 4:
              isSalawetYawmiyeh= false;
              isSalawet= false;
              isTsaiiyatExpanded= false;
              istalabetExpanded= true;
              isMassebih= false;
              isSalawetKhassa =false;
              break;
          case 5:
              isSalawetYawmiyeh= false;
              isSalawet= false;
              isTsaiiyatExpanded= false;
              istalabetExpanded= false;
              isMassebih= true;
              isSalawetKhassa =false;
              break;

          case 6:
              isSalawetYawmiyeh= false;
              isSalawet= false;
              isTsaiiyatExpanded= false;
              istalabetExpanded= false;
              isMassebih= false;
              isSalawetKhassa =true;
              break;
      }


                SalawetYawmiyehtoggleExpansion();
                SalawettoggleExpansion();
                TsaiiyattoggleExpansion();
                talabettoggleExpansion();
                MassebihtoggleExpansion();
                SalawetKhassaExpansion();
    }




     // ------------------- expend ... ---------------------------
        private void TsaiiyattoggleExpansion() {
            if (!isTsaiiyatExpanded) {
                // Collapse
                TsaiiyatExpandableButtons.setVisibility(View.GONE);
                btnGroupTsaiiyat.setText("التساعيّات  ◀ ");
                isTsaiiyatExpanded = false;
            } else {
                // Expand
                TsaiiyatExpandableButtons.setVisibility(View.VISIBLE);
                btnGroupTsaiiyat.setText("التساعيّات  ▼");
                isTsaiiyatExpanded = true;
            }
        }

    private void talabettoggleExpansion() {
        if (!istalabetExpanded) {
            // Collapse
            talabetExpandableButtons.setVisibility(View.GONE);
            btnGroupTalabet.setText("الطلبات  ◀ ");
            istalabetExpanded = false;
        } else {
            // Expand
            talabetExpandableButtons.setVisibility(View.VISIBLE);
            btnGroupTalabet.setText("الطلبات  ▼");
            istalabetExpanded = true;
        }
    }

    private void SalawetYawmiyehtoggleExpansion() {

        if (!isSalawetYawmiyeh) {
            // Collapse
            SalawetYawmiyehExpandableButtons.setVisibility(View.GONE);
            btnGroupSalawetYawmiyeh.setText("الصلاة اليومية  ◀ ");
            isSalawetYawmiyeh = false;
        } else {
            // Expand
            SalawetYawmiyehExpandableButtons.setVisibility(View.VISIBLE);
            btnGroupSalawetYawmiyeh.setText("الصلاة اليومية  ▼");
            isSalawetYawmiyeh = true;
        }
    }


    private void SalawettoggleExpansion() {
        if (!isSalawet) {
            // Collapse
            SalawetExpandableButtons.setVisibility(View.GONE);
            btnGroupSalawet.setText("الصلوات  ◀ ");
            isSalawet = false;
        } else {
            // Expand
            SalawetExpandableButtons.setVisibility(View.VISIBLE);
            btnGroupSalawet.setText("الصلوات  ▼");
            isSalawet = true;
        }
    }

    private void MassebihtoggleExpansion() {
        if (!isMassebih) {
            // Collapse
            MassebihExpandableButtons.setVisibility(View.GONE);
            btnGroupMassebih.setText("المسابح  ◀ ");
            isMassebih = false;
        } else {
            // Expand
            MassebihExpandableButtons.setVisibility(View.VISIBLE);
            btnGroupMassebih.setText("المسابح  ▼");
            isMassebih = true;
        }
    }


    private void SalawetKhassaExpansion() {
        if (!isSalawetKhassa) {
            // Collapse
            SalawetkhassaExpandableButtons.setVisibility(View.GONE);
            btnGroupSalawetKhassa.setText("صلاوات خاصة  ◀ ");
            isSalawetKhassa = false;
        } else {
            // Expand
            SalawetkhassaExpandableButtons.setVisibility(View.VISIBLE);
            btnGroupSalawetKhassa.setText("صلاوات خاصة  ▼");
            isSalawetKhassa = true;
        }
    }



}
