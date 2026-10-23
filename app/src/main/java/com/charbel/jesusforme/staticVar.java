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
import com.charbel.jesusforme.data.tratil.*;
import com.charbel.jesusforme.data.tratil.AnachidMariam.*;
import com.charbel.jesusforme.data.biography.*;
import com.charbel.jesusforme.data.tratil.mounaa.*;
import com.charbel.jesusforme.data.tratil.mounaa2.*;
import com.charbel.jesusforme.data.tratil.mounaa3.*;
import com.charbel.jesusforme.data.tratil.mounaa4.*;

public class staticVar {

    public static int code=0;
    public static template _template;
    public static boolean cameFromList = false;
	 public static String cameFromListTitle="";
	 public static int cameFromListcode= 1;
	
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
            case 47:
                return new SaintVeronicaJulyani();
            case 48:
                return new TelbitSaintVeronicaJulyani();
            case 49:
                return new TseiiyetSaintVeronicaJulyani();

            case 50:
                return new saintGrandAntonios();

            case 51:
                return new TseiiyetSaintPio();

			case 52:
                return new SaintArss();

            case 53:
                return new TseiiyetSaintArss();

		
            case 417:
                return new SaintCharbelCancer();
	

				
			// ------------ sira zatiyeh
			 case 500:
                return new gemma();	
			  case 501:
                return new saintCharbelBiog();	


// ------------------ tratill -----------------
// ---- tratil list section
			case 60000: return new oudElSalib();
			case 60001: return new ifrahhi();
			case 60002: return new touazimNafssi();
            case 60003: return new wouroud();
            case 60004: return new yaNajmatSoboh();				
            case 60005: return new alaykisalam();
            case 60006: return new salamSalam();				
            case 60007: return new nahnouBanouki();
            case 60008: return new mariamFoukty();				
            case 60009: return new majdouMariam();
            case 60010: return new houbouki();			
			case 60011: return new maljaElBanin();
            case 60012: return new fiZillHimayitiki();				
            case 60013: return new sallwaKouloub();
            case 60014: return new yaOumana();				
            case 60015: return new rayaIftikhar();
            case 60016: return new majdLeb();
            case 60017: return new oumHayat();				
            case 60018: return new kanzBaraket();
            case 60019: return new antichafih();
				
			case 60020: return new a3tiniKalam();
			case 60021: return new a3tinirabi();
			case 60022: return new a3tiniYaIlahiMoulk();
			case 60023: return new AbanaT();
			case 60024: return new abanaWsalama();
			case 60025: return new abati();
			case 60026: return new abFoukara2();
			case 60027: return new ach3ourBelAmen();
			case 60028: return new AchrakNourou3alaAbrar();
			case 60029: return new ahmadouka();
			case 60030: return new anta3azim();
			case 60031: return new arakaIlahiArak();
			case 60032: return new aredSalla3layaAllah();
			case 60033: return new arsaltouka();
			case 60034: return new arselRouhaka();
			case 60035: return new ibtahijiNafssi();
			case 60036: return new ichta2naTemroukMin3ina();
			case 60037: return new ikhdimouRab();
			case 60038: return new inssanMithloukaKhala2t();
			case 60039: return new irfa3IsemFadi();
			case 60040: return new is2alouTa3tou();
			case 60041: return new ithamniYaAllah();
			case 60042: return new itloubouMalakoutLah();
			case 60043: return new izhaboufiAlredKoulouha();
			case 60044: return new ouhebakRabiYassou3();
			case 60045: return new ouhiboukaYaRab();
			case 60046: return new outroukKoulaChayi2();
			case 60047: return new tabchirMala2ikiT();
				// -------------------
			case 60048: return new al3alamJa2i3();
			case 60049: return new alhamdouWalChoukran();
			case 60050: return new alhamedWalMajed();
			case 60051: return new alki2alaRabHamouka();
			case 60052: return new allahNouryKhalassi();
			case 60053: return new allahoumaSma3Khalassi();
			case 60054: return new almajdLaka();
			case 60055: return new almajdMalikMajed();
			case 60056: return new AlmajdouAllahFiAl2a3ali();
			case 60057: return new Almassi7KamMinBayinAmouwat();
			case 60058: return new alrabHouwaAllah();
			case 60059: return new alrabNouryKhalasi();
			case 60060: return new alrabouRa3i();
			case 60061: return new alrabRahimSami3();
			case 60062: return new alrabYamchi();
			case 60063: return new alrabYassou3Wassatouna();
			case 60064: return new Alrou7Yajma3ouna();
			case 60065: return new alsadikKalNakhel();
			case 60066: return new anaNadaytoukaYaAllah();
			case 60067: return new annaKouliIman();
			case 60068: return new annaMousta3id();
			case 60069: return new annaRabKa2inat();
			case 60070: return new annaWakif3alaBabak();
			case 60071: return new antaChafi();
			case 60072: return new antaChafi3Akdam();
			case 60073: return new antaIlahi();
			case 60074: return new antaKoultLiHaloumou();
			case 60075: return new antaMoulkouna();
			case 60076: return new antaWa7dakDa3out();
			case 60077: return new antoumMil7Ared();
			case 60078: return new ilahhi2ousabi7ouka();
			case 60079: return new ilahiRaffa3tIlaykaYady();
			case 60080: return new ilahouna();
			case 60081: return new ilahouna3alli();
			case 60082: return new ilaykaRafa3tou3aynay();
			case 60083: return new ilaykaYassou32Touk();
			case 60084: return new ilaykiWouroudYaMariam();
			case 60085: return new ilaykKalbiHayati();
			case 60086: return new illaAkassiAred();
			case 60087: return new inaclaKam7a();
			case 60088: return new inaFara7RabKouwatana();
			case 60089: return new inLanTa3oudouKalAtfal();
			case 60090: return new inni7abatKam7i();
			case 60091: return new oumounaMariam();
				// -------------------
			case 60092: return new  anna3alaBabak();
			case 60093: return new  ayouhaAbKoudous();
			case 60094: return new  ayouhaMassihKalima();
			case 60095: return new  barikiNafssiElRab();
			case 60096: return new  barikYaRabChabak();
			case 60097: return new  bassmeh7elweh();
			case 60098: return new  bhebakYaYassou3();
			case 60099: return new  bidamYassou3();
			case 60100: return new  bikalebMahbassy();
			case 60101: return new  bima2oukafi2Rab();
			case 60102: return new  bismikaAlyomNajtami3();
			case 60103: return new  bissikaAtakadam();
			case 60104: return new  bnourakN3ayinNour();
			case 60105: return new  bsawtiIlaRab();
			case 60106: return new  bwehdetnaSalamna();
			case 60107: return new  charbelWelSalla();
			case 60108: return new  chilElZa3al();
			case 60109: return new  chouHelwehElSama();
			case 60110: return new  hajtiDawman2illak();
			case 60111: return new  hananakYaRabAkwan();
			case 60112: return new  hattaMata();
			case 60113: return new  hayatiHiyaMassi7();
			case 60114: return new  ihtifoulelrab();
			case 60115: return new  jamilat2anti();
			case 60116: return new  jaritKourban();
			case 60117: return new  jayiL3indak();
			case 60118: return new  jinna2idassan2idess();
			case 60119: return new  kebezKhamerMay();
			case 60120: return new  khallesCha3bak();
			case 60121: return new  khatabRabCha3bouh();
			case 60122: return new  kheweHe7deh();
			case 60123: return new  khouzHayatiYaRab();
			case 60124: return new  RabMajed();
			case 60125: return new  khouzYaRab();
			case 60127: return new  rabbiAnnaWarakaBayda2();
			case 60128: return new  rabbiAntaTasstati3();
			case 60129: return new  rabbiJassadouka();
			case 60130: return new  rabbiTakabal();
			case 60131: return new  rabi3azzim();
			case 60132: return new  rabiIj3alni();
			case 60133: return new  rabiJassadouka();
			case 60134: return new  rabiKoulaChayi2();
			case 60135: return new  raffa3t3aynni();
			case 60136: return new  rajawtRab();
			case 60137: return new  rannimHallilouya();
			case 60138: return new  ranSawtMin2a3la();
			case 60139: return new  rissala2a3titani();
			case 60140: return new  sabbi7ouAlRab();
			case 60141: return new  sallamSallam();
			case 60142: return new  sallamtKalbi();
			case 60143: return new  salwaKouloub();
			case 60144: return new  sarkhati();
			case 60145: return new  sawfaAkoudoukoum();
			case 60146: return new  sehran();
			case 60147: return new  shekerAlla();
			case 60148: return new  snninTawilleh();
			case 60149: return new  ta3alaMla2niL2an();
			case 60150: return new  ta3alBaynana();
			case 60151: return new  ta3alouIlaRab();
			case 60152: return new  thallaKalbi();
			case 60153: return new  tjalla();
			case 60154: return new  toubou();
			case 60155: return new  toubouIlaRab();
			case 60156: return new  twakalna3Alla();
			case 60157: return new  yaRavRahmak();
			case 60158: return new  zahraFiBiladi();
				
				
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
