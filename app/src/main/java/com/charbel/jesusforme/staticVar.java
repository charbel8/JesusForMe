package com.charbel.jesusforme;

import com.charbel.jesusforme.data.salawet.SaintRafqa;
import com.charbel.jesusforme.data.salawet.Saintcharbel;
import com.charbel.jesusforme.data.salawet.againstEvil;
import com.charbel.jesusforme.data.massbaha.alra7ma;
import com.charbel.jesusforme.data.salawet.gardAngel;
import com.charbel.jesusforme.data.salawetKhassa.AnfoudAlmathariyeh;
import com.charbel.jesusforme.data.salawetKhassa.babyCancer;
import com.charbel.jesusforme.data.salawetKhassa.mariamt7ik3ikad;
import com.charbel.jesusforme.data.salawetKhassa.takrisKalebMariam;
import com.charbel.jesusforme.data.salawetKhassa.takrisKalebYassou3;
import com.charbel.jesusforme.data.telbet.althaloth;
import com.charbel.jesusforme.data.salatYawmiyeh.beforsleep;
import com.charbel.jesusforme.data.massbaha.masbahaAlFarah;
import com.charbel.jesusforme.data.massbaha.masbahaAlHezen;
import com.charbel.jesusforme.data.massbaha.masbahaAlMajed;
import com.charbel.jesusforme.data.massbaha.masbahaAlNour;
import com.charbel.jesusforme.data.salatYawmiyeh.myfather;
import com.charbel.jesusforme.data.salawet.padrePioS1;
import com.charbel.jesusforme.data.salawet.rou7koudous;
import com.charbel.jesusforme.data.telbet.telbetElMawta;
import com.charbel.jesusforme.data.telbet.telbitAlra7maIlahiyeh;
import com.charbel.jesusforme.data.tesawiyet.alra7maIlahiyeh;
import com.charbel.jesusforme.data.tesawiyet.saintCharbel;
import com.charbel.jesusforme.data.salawet.saintJoseph;
import com.charbel.jesusforme.data.salawet.saintJoseph2;
import com.charbel.jesusforme.data.tesawiyet.saintKassab;
import com.charbel.jesusforme.data.tesawiyet.saintRafqa;
import com.charbel.jesusforme.data.salawet.saintRita;
import com.charbel.jesusforme.data.salatYawmiyeh.ssaidniyarab;
import com.charbel.jesusforme.data.salawet.tabchirAlMala2ika;
import com.charbel.jesusforme.data.telbet.telbatElAddra;
import com.charbel.jesusforme.data.telbet.telbetkalebyassouh;
import com.charbel.jesusforme.data.template;
import com.charbel.jesusforme.data.tesawiyet.tssaiiatSaintRita;

public class staticVar {

    public static int code=0;
    public static template _template;

 public static int groupNumber = 0;


    public static template getSalat() {
        switch (staticVar.code) {
            case 1:
                return new saintCharbel();
            case 2:
                return new saintRafqa();
            case 3:
                return new saintKassab();
            case 4:
                return new alra7ma();
            case 5:
                return new rou7koudous();
            case 6:
                return new saintRita();
            case 7:
                return new saintJoseph();
            case 8:
                return new saintJoseph2();
            case 9:
                return new telbatElAddra();
            case 10:
                return new tabchirAlMala2ika();
            case 11:
                return new telbetkalebyassouh();
            case 12:
                return new althaloth();
            case 13:
                return new beforsleep();
            case 14:
                return new ssaidniyarab();
            case 15:
                return new myfather();
            case 16:
                return new padrePioS1();
            case 17:
                return new againstEvil();
            case 18:
                return new tssaiiatSaintRita();
// ---------------------------------------
            case 19:
                return new masbahaAlFarah();
            case 20:
                return new masbahaAlHezen();
            case 21:
                return new masbahaAlMajed();
            case 22:
                return new masbahaAlNour();
            case 23:
                return new alra7maIlahiyeh();

            case 24:
                return new telbitAlra7maIlahiyeh();
            case 25:
                return new gardAngel();

            case 26:
                return new babyCancer();
            case 27:
                return new mariamt7ik3ikad();


            case 28:
                return new takrisKalebMariam();
            case 29:
                return new takrisKalebYassou3();

            case 30:
                return new telbetElMawta();
            case 31:
                return new AnfoudAlmathariyeh();

            // --- -----------
            case 32:
                return new Saintcharbel();
            case 33:
                return new SaintRafqa();







            // -----------------------------------
            default:
                return new template();

        }
    }


    public static void setGroupNumber(int code) {
        groupNumber = code;
    }

    public static int getGroupNumber() {
        return groupNumber;
    }

}
