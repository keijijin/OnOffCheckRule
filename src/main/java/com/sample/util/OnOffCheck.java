package com.sample.util;

public class OnOffCheck {

    public static Boolean あり(String onOff) {
        Boolean b = false;
        if (onOff != null && !onOff.equals("")) b = true;
        return b;
    }

    public static Boolean なし(String onOff) {
        Boolean b = false;
        if (onOff == null || onOff.equals("")) b = true;
        return b;
    }

    public static void main (String... args) {
        
        String onOff = null;
        if (なし(onOff)) System .out .println("ぬるなし");
        if (あり(onOff)) System .out .println("ぬるあり");

        onOff = "";
        if (なし(onOff)) System .out .println("文字なし");
        if (あり(onOff)) System .out .println("文字あり");

        onOff = "あり";
        if(なし(onOff)) System.out.println(onOff + "なし");
        if(あり(onOff)) System.out.println(onOff + "あり");
     }
}
