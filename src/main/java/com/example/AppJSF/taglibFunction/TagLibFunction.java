package com.example.AppJSF.taglibFunction;

import org.apache.commons.lang3.text.WordUtils;

public class TagLibFunction {

    public static String capitalize(String str){
        return WordUtils.capitalizeFully(str);
    }
}
