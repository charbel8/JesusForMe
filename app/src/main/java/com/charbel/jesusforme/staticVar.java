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
        REGISTRY.put(1,  saintCharbel::new);
        REGISTRY.put(2,  saintRafqa::new);
        REGISTRY.put(3,  saintKassab::new);
        REGISTRY.put(4,  alra7ma::new);
        REGISTRY.put(5,  rou7koudous::new);
        REGISTRY.put(6,  saintRita::new);
        REGISTRY.put(7,  saintJoseph::new);
        REGISTRY.put(8,  saintJoseph2::new);
        REGISTRY.put(9,  telbatElAddra::new);
        REGISTRY.put(10, tabchirAlMala2ika::new);
        REGISTRY.put(11, telbetkalebyassouh::new);
        REGISTRY.put(12, althaloth::new);
        REGISTRY.put(13, beforsleep::new);
        REGISTRY.put(14, ssaidniyarab::new);
        REGISTRY.put(15, myfather::new);
        REGISTRY.put(16, padrePioS1::new);
        REGISTRY.put(17, againstEvil::new);
        REGISTRY.put(18, tssaiiatSaintRita::new);
        REGISTRY.put(19, masbahaAlFarah::new);
        REGISTRY.put(20, masbahaAlHezen::new);
        REGISTRY.put(21, masbahaAlMajed::new);
        REGISTRY.put(22, masbahaAlNour::new);
        REGISTRY.put(23, alra7maIlahiyeh::new);
        REGISTRY.put(24, telbitAlra7maIlahiyeh::new);
        REGISTRY.put(25, gardAngel::new);
        REGISTRY.put(26, babyCancer::new);
        REGISTRY.put(27, mariamt7ik3ikad::new);
        REGISTRY.put(28, takrisKalebMariam::new);
        REGISTRY.put(29, takrisKalebYassou3::new);
        REGISTRY.put(30, telbetElMawta::new);
        REGISTRY.put(31, AnfoudAlmathariyeh::new);
        REGISTRY.put(32, Saintcharbel::new);
        REGISTRY.put(33, SaintRafqa::new);
        REGISTRY.put(34, tessawiyetSaintJoseph::new);
        REGISTRY.put(35, telbetSaintJoseph::new);
        REGISTRY.put(36, masbahaSaintJoseph::new);
        REGISTRY.put(37, doua2SaintJoseph::new);
        REGISTRY.put(38, FransistoViergeMarie::new);
        REGISTRY.put(39, morning::new);
        REGISTRY.put(40, evening::new);
        REGISTRY.put(41, SaintMarina::new);
        REGISTRY.put(42, SaintNemaAllah::new);
        REGISTRY.put(43, sallatNafes::new);
        REGISTRY.put(44, sallatJassad::new);
        REGISTRY.put(45, SaintRita2::new);
        
        REGISTRY.put(46, ali3tiraf::new);
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
