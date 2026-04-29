package com.charbel.jesusforme;

import com.charbel.jesusforme.data.doua2.*;
import com.charbel.jesusforme.data.massbaha.*;
import com.charbel.jesusforme.data.salatYawmiyeh.*;
import com.charbel.jesusforme.data.salawet.*;
import com.charbel.jesusforme.data.salawetKhassa.*;
import com.charbel.jesusforme.data.telbet.*;
import com.charbel.jesusforme.data.template;
import com.charbel.jesusforme.data.tesawiyet.*;
import com.charbel.jesusforme.data.irchadat.*;

public class staticVar {

    public static int code=0;
    public static template _template;

 public static int groupNumber = -1;


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


                // -----
            case 34:
                return new tessawiyetSaintJoseph();

            case 35:
                return new telbetSaintJoseph();
            case 36:
                return new masbahaSaintJoseph();
            case 37:
                return new doua2SaintJoseph();
            case 38:
                return new FransistoViergeMarie();


            case 39:
                return new morning();
            case 40:
                return new evening();

            case 41:
                return new SaintMarina();
            case 42:
                return new SaintNemaAllah();


            case 43:
                return new sallatNafes();
            case 44:
                return new sallatJassad();
            case 45:
                return new SaintRita2();
				
            case 46:
                return new ali3tiraf();



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
