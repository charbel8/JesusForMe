package com.charbel.jesusforme;

import com.charbel.jesusforme.data.template;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class staticVar {
    public static int code = 0;
    public static template _template;
    public static int groupNumber = -1;

    private static final Map<Integer, Supplier<template>> REGISTRY = new HashMap<>();

    static {
        REGISTRY.put(1,  new saintCharbel());
        REGISTRY.put(2,  new saintRafqa());
        REGISTRY.put(3,  new saintKassab());
        REGISTRY.put(4,  new alra7ma());
        REGISTRY.put(5,  new rou7koudous());
        REGISTRY.put(6,  new saintRita());
        REGISTRY.put(7,  new saintJoseph());
        REGISTRY.put(8,  new saintJoseph2());
        REGISTRY.put(9,  new telbatElAddra());
        REGISTRY.put(10, new tabchirAlMala2ika());
        REGISTRY.put(11, new telbetkalebyassouh());
        REGISTRY.put(12, new althaloth());
        REGISTRY.put(13, new beforsleep());
        REGISTRY.put(14, new ssaidniyarab());
        REGISTRY.put(15, new myfather());
        REGISTRY.put(16, new padrePioS1());
        REGISTRY.put(17, new againstEvil());
        REGISTRY.put(18, new tssaiiatSaintRita());
        REGISTRY.put(19, new masbahaAlFarah());
        REGISTRY.put(20, new masbahaAlHezen());
        REGISTRY.put(21, new masbahaAlMajed());
        REGISTRY.put(22, new masbahaAlNour());
        REGISTRY.put(23, new alra7maIlahiyeh());
        REGISTRY.put(24, new telbitAlra7maIlahiyeh());
        REGISTRY.put(25, new gardAngel());
        REGISTRY.put(26, new babyCancer());
        REGISTRY.put(27, new mariamt7ik3ikad());
        REGISTRY.put(28, new takrisKalebMariam());
        REGISTRY.put(29, new takrisKalebYassou3());
        REGISTRY.put(30, new telbetElMawta());
        REGISTRY.put(31, new AnfoudAlmathariyeh());
        REGISTRY.put(32, new Saintcharbel());
        REGISTRY.put(33, new SaintRafqa());
        REGISTRY.put(34, new tessawiyetSaintJoseph());
        REGISTRY.put(35, new telbetSaintJoseph());
        REGISTRY.put(36, new masbahaSaintJoseph());
        REGISTRY.put(37, new doua2SaintJoseph());
        REGISTRY.put(38, new FransistoViergeMarie());
        REGISTRY.put(39, new morning());
        REGISTRY.put(40, new evening());
        REGISTRY.put(41, new SaintMarina());
        REGISTRY.put(42, new SaintNemaAllah());
        REGISTRY.put(43, new sallatNafes());
        REGISTRY.put(44, new sallatJassad());
        REGISTRY.put(45, new SaintRita2());
        
        REGISTRY.put(46, new ali3tiraf());
    }

    public static template getSalat() {
        return REGISTRY.getOrDefault(code, template::new).get();
    }

    public static void setGroupNumber(int code) {
        groupNumber = code;
    }

    public static int getGroupNumber() {
        return groupNumber;
    }
}
