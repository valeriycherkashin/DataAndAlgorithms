package com.daa.secondweek;

public class BinaryToTextASCIIConversion {
    public static String binaryToText(String binary) {
        String str = "";
        for (int i = 0; i < binary.length()/8; i++) {
            int a = Integer.parseInt(binary.substring(8*i,(i+1)*8),2);
            str += (char)(a);
        }
        return str;}
}
