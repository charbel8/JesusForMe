package com.charbel.jesusforme;


import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import java.util.Arrays;
import java.util.List;



public class MainActivity  extends AppCompatActivity {


    // ── inner model ──────────────────────────────────────────────
    private static class Group {
        final int headerBtnId;
        final int containerId;
        final String collapsedLabel;
        final String expandedLabel;
        final int[][] buttons; // {viewId, code}

        Group(int headerBtnId, int containerId,
              String collapsedLabel, String expandedLabel,
              int[][] buttons) {
            this.headerBtnId    = headerBtnId;
            this.containerId    = containerId;
            this.collapsedLabel = collapsedLabel;
            this.expandedLabel  = expandedLabel;
            this.buttons        = buttons;
        }
    }

    // ── state ─────────────────────────────────────────────────────
    private List<Group>       groups;
    private List<LinearLayout> containers;
    private List<Button>       headers;


    // ── data ──────────────────────────────────────────────────────
    private List<Group> buildGroups() {
        return Arrays.asList(

                new Group(R.id.btnGroupSalawetYawmiyeh,
                        R.id.SalawetYawmiyehExpandableButtons,
                        "الصلاة اليومية  ◀ ", "الصلاة اليومية  ▼ ",
                        new int[][]{
                                {R.id.myfather,      15},
                                {R.id.ssaidniyarab,  14},
                                {R.id.beforsleep,    13},
                                {R.id.evening,       40},
                                {R.id.morning,       39},
                        }),

                new Group(R.id.btnGroupSalawetKhassa,
                        R.id.SalawetkhassaExpandableButtons,
                        "صلاوات خاصة  ◀ ", "صلاوات خاصة  ▼ ",
                        new int[][]{
                                {R.id.AnfoudAlmathariyeh,  31},
                                {R.id.babyCancer,          26},
                                {R.id.mariamt7ik3ikad,     27},
                                {R.id.takrisKalebYassou3,  29},
                                {R.id.takrisKalebMariam,   28},
                                
                                {R.id.padrePioS1,          16}, // added
                                {R.id.againstEvil,         17}, // added
                        }),

                new Group(R.id.btnGroupSalawet,
                        R.id.SalawetExpandableButtons,
                        "الصلوات  ◀ ", "الصلوات  ▼ ",
                        new int[][]{
                                {R.id.rita1,          6},
                                {R.id.SaintRita2,    45},
                                {R.id.charbel,       32},
                                {R.id.saintRafqaS,   33},
                                {R.id.tabchirmalaika, 10},
                                {R.id.rou7koudous,    5},
                                {R.id.saintJoseph2,   8},
                                {R.id.saintJoseph,    7},
                                {R.id.gardAngel,     25},
                                {R.id.SaintMarina,    41},
                                {R.id.SaintNemaAllah, 42},
                                {R.id.SaintVeronicaJulyani, 47},
                        }),

                new Group(R.id.btnGroupTsaiiyat,
                        R.id.tsaiiyatExpandableButtons,
                        "التساعيّات  ◀ ", "التساعيّات  ▼ ",
                        new int[][]{
                                {R.id.saintKassab,       3},
                                {R.id.saintRafqa,        2},
                                {R.id.tssaiiatSaintRita,      18},
                                {R.id.tessawiyetSaintJoseph,  34},
                                {R.id.TseiiyetSaintVeronicaJulyani,  49},
                                {R.id.SaintCharbel,      1},
                                {R.id.alra7maIlahiyeh,      23},
                        }),

                new Group(R.id.btnGroupTalabet,
                        R.id.talabetExpandableButtons,
                        "الطلبات  ◀ ", "الطلبات  ▼ ",
                        new int[][]{
                               {R.id.TelbitSaintVeronicaJulyani, 48},                            
                                {R.id.telbitAlra7maIlahiyeh,24},
                                {R.id.telbetSaintJoseph, 35},
                                {R.id.althaloth,         12},
                                {R.id.telbitkalebyassouh,11},
                                {R.id.telbetElMawta,     30},                          
                                {R.id.telbatElAddra,     9},
                        }),

                new Group(R.id.btnGroupMassebih,
                        R.id.MassebihExpandableButtons,
                        "المسابح  ◀ ", "المسابح  ▼ ",
                        new int[][]{
                                {R.id.masbahaAlFarah,       19},
                                {R.id.masbahaAlHezen,       20},
                                {R.id.masbahaAlMajed,       21},
                                {R.id.masbahaAlNour,        22},
                                {R.id.masbahaSaintJoseph,   36},                            
                                {R.id.alra7ma,           4},  
                        }),

                new Group(R.id.btnGroupDouaat,
                        R.id.DouaatExpandableButtons,
                        "الدعاءات  ◀ ", "الدعاءات  ▼ ",
                        new int[][]{
                                {R.id.doua2SaintJoseph,    37},
                                {R.id.FransistoViergeMarie,38},
                                {R.id.sallatNafes,    43},
                                {R.id.sallatJassad,44},
                        }),

                new Group(R.id.irchadat,
                        R.id.irchadatExpandableButtons,
                        "ارشادات  ◀ ", "ارشادات  ▼ ",
                        new int[][]{
                                {R.id.ali3tiraf,    46},
                        })
        );
    }

    // ── lifecycle ─────────────────────────────────────────────────
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groups     = buildGroups();
        containers = new java.util.ArrayList<>();
        headers    = new java.util.ArrayList<>();

        for (int i = 0; i < groups.size(); i++) {
            Group g = groups.get(i);

            Button       header    = findViewById(g.headerBtnId);
            LinearLayout container = findViewById(g.containerId);

            headers.add(header);
            containers.add(container);

            container.setVisibility(View.GONE);

            final int index = i;
            header.setOnClickListener(v -> toggle(index));

            // wire up every content button in this group
            for (int[] pair : g.buttons) {
                int viewId = pair[0];
                int code   = pair[1];
                findViewById(viewId).setOnClickListener(
                        v -> openPage(code)
                );
            }
        }
        toggle(staticVar.getGroupNumber());
    }

    // ── helpers ───────────────────────────────────────────────────
    private void toggle(int index) {

        for (int i = 0; i < groups.size(); i++) {
            if (i == index) {
                containers.get(i).setVisibility( View.VISIBLE);
                headers.get(i).setText(groups.get(i).expandedLabel);
                continue;
            }
            containers.get(i).setVisibility(View.GONE);
            headers.get(i).setText(groups.get(i).collapsedLabel);

        }
        staticVar.setGroupNumber(index);

    }

    private void openPage(int code) {
        staticVar.code = code;
        startActivity(new Intent(this, dynamicAct.class));
        finish();
    }

}
