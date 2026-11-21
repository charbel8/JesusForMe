package com.charbel.jesusforme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // ── model ─────────────────────────────────────────────────────
    private static class Group {
        final int headerId, containerId;
        final String title;
        final int[][] pages;          // {viewId, pageCode}
        Button header;                // resolved in onCreate
        LinearLayout container;

        Group(int headerId, int containerId, String title, int[][] pages) {
            this.headerId = headerId;
            this.containerId = containerId;
            this.title = title;
            this.pages = pages;
        }

        void setExpanded(boolean expanded) {
            container.setVisibility(expanded ? View.VISIBLE : View.GONE);
            header.setText(title + (expanded ? "  ▼ " : "  ◀ "));
        }
    }

    // ── data ──────────────────────────────────────────────────────
    private final List<Group> groups = Arrays.asList(

            new Group(R.id.btnGroupSalawetYawmiyeh, R.id.SalawetYawmiyehExpandableButtons,
                    "الصلاة اليومية", new int[][]{
                    {R.id.myfather, 15},
                    {R.id.ssaidniyarab, 14},
                    {R.id.beforsleep, 13},
                    {R.id.evening, 40},
                    {R.id.morning, 39},
            }),

            new Group(R.id.btnGroupSalawetKhassa, R.id.SalawetkhassaExpandableButtons,
                    "صلاوات خاصة", new int[][]{
                    {R.id.AnfoudAlmathariyeh, 31},
                    {R.id.babyCancer, 26},
                    {R.id.mariamt7ik3ikad, 27},
                    {R.id.takrisKalebYassou3, 29},
                    {R.id.takrisKalebMariam, 28},
                    {R.id.padrePioS1, 16},
                    {R.id.againstEvil, 17},
                    {R.id.SaintCharbelCancer, 417},
                    {R.id.saintGrandAntonios, 50},
            }),

            new Group(R.id.btnGroupSalawet, R.id.SalawetExpandableButtons,
                    "الصلوات", new int[][]{
                    {R.id.rita1, 6},
                    {R.id.SaintRita2, 45},
                    {R.id.charbel, 32},
                    {R.id.saintRafqaS, 33},
                    {R.id.tabchirmalaika, 10},
                    {R.id.rou7koudous, 5},
                    {R.id.saintJoseph2, 8},
                    {R.id.saintJoseph, 7},
                    {R.id.gardAngel, 25},
                    {R.id.SaintMarina, 41},
                    {R.id.SaintNemaAllah, 42},
                    {R.id.SaintVeronicaJulyani, 47},
                    {R.id.SaintArss, 52},
            }),

            new Group(R.id.btnGroupTsaiiyat, R.id.tsaiiyatExpandableButtons,
                    "التساعيّات", new int[][]{
                    {R.id.saintKassab, 3},
                    {R.id.saintRafqa, 2},
                    {R.id.tssaiiatSaintRita, 18},
                    {R.id.tessawiyetSaintJoseph, 34},
                    {R.id.TseiiyetSaintVeronicaJulyani, 49},
                    {R.id.SaintCharbel, 1},
                    {R.id.alra7maIlahiyeh, 23},
                    {R.id.TseiiyetSaintPio, 51},
                    {R.id.TseiiyetSaintArss, 53},
            }),

            new Group(R.id.btnGroupTalabet, R.id.talabetExpandableButtons,
                    "الطلبات", new int[][]{
                    {R.id.TelbitSaintVeronicaJulyani, 48},
                    {R.id.telbitAlra7maIlahiyeh, 24},
                    {R.id.telbetSaintJoseph, 35},
                    {R.id.althaloth, 12},
                    {R.id.telbitkalebyassouh, 11},
                    {R.id.telbetElMawta, 30},
                    {R.id.telbatElAddra, 9},
            }),

            new Group(R.id.btnGroupMassebih, R.id.MassebihExpandableButtons,
                    "المسابح", new int[][]{
                    {R.id.masbahaAlFarah, 19},
                    {R.id.masbahaAlHezen, 20},
                    {R.id.masbahaAlMajed, 21},
                    {R.id.masbahaAlNour, 22},
                    {R.id.masbahaSaintJoseph, 36},
                    {R.id.alra7ma, 4},
            }),

            new Group(R.id.btnGroupDouaat, R.id.DouaatExpandableButtons,
                    "الدعاءات", new int[][]{
                    {R.id.doua2SaintJoseph, 37},
                    {R.id.FransistoViergeMarie, 38},
                    {R.id.sallatNafes, 43},
                    {R.id.sallatJassad, 44},
            }),

            new Group(R.id.irchadat, R.id.irchadatExpandableButtons,
                    "ارشادات", new int[][]{
                    {R.id.ali3tiraf, 46},
            }),

            new Group(R.id.btnGroupBioghraphy, R.id.BioghraphyExpandableButtons,
                    "حياة القديسين", new int[][]{
                    {R.id.gemma, 500},
                    {R.id.saintCharbelBiog, 501},
            }),

            // Tratil buttons open a list instead of a page (see TRATIL_BUTTONS)
            new Group(R.id.btnGroupTratil, R.id.TratilExpandableButtons,
                    "تراتيل", new int[0][])
    );

    // Tratil list buttons: the first one is "أناشيد مريم" (list code 1),
    // the rest are "N ترانيم منوعة" with N = 1..11 (list codes 2..12).
    private static final int[] TRATIL_BUTTONS = {
            R.id.tratilMnouwaa,   R.id.tratilMnouwaa2,  R.id.tratilMnouwaa3,
            R.id.tratilMnouwaa4,  R.id.tratilMnouwaa5,  R.id.tratilMnouwaa6,
            R.id.tratilMnouwaa7,  R.id.tratilMnouwaa8,  R.id.tratilMnouwaa9,
            R.id.tratilMnouwaa10, R.id.tratilMnouwaa11,
    };

    // ── lifecycle ─────────────────────────────────────────────────
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < groups.size(); i++) {
            Group g = groups.get(i);
            g.header = findViewById(g.headerId);
            g.container = findViewById(g.containerId);

            final int index = i;
            g.header.setOnClickListener(v -> toggle(index));

            for (int[] page : g.pages) {
                final int code = page[1];
                findViewById(page[0]).setOnClickListener(v -> openPage(code));
            }
        }

        bindTratil();
        toggle(staticVar.getGroupNumber());
    }

    // ── helpers ───────────────────────────────────────────────────
    private void bindTratil() {
        bindList(R.id.tratilAnachidMariam, "أناشيد مريم", 1);

        for (int i = 0; i < TRATIL_BUTTONS.length; i++) {
            bindList(TRATIL_BUTTONS[i], (i + 1) + " ترانيم منوعة", i + 2);
        }
    }

    private void bindList(int viewId, String title, int listCode) {
        findViewById(viewId).setOnClickListener(v -> {
            staticVar.cameFromListTitle = title;
            staticVar.cameFromListcode = listCode;
            startActivity(new Intent(this, tratilList.class));
            finish();
        });
    }

    private void toggle(int index) {
        for (int i = 0; i < groups.size(); i++) {
            groups.get(i).setExpanded(i == index);
        }
        staticVar.setGroupNumber(index);
    }

    private void openPage(int code) {

        staticVar.code = code;
        staticVar.cameFromList = false;
        startActivity(new Intent(this, dynamicAct.class));
        finish();
    }
}