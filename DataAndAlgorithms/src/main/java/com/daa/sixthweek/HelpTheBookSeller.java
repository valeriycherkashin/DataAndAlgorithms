package com.daa.sixthweek;

public class HelpTheBookSeller {

    static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if ((lstOfArt.length == 0) || (lstOf1stLetter.length == 0)) return "";
        int[] sum = new int[lstOf1stLetter.length];
        for (int i=0; i<lstOf1stLetter.length; i++) {
            for (String art : lstOfArt) {
                if (art.startsWith(lstOf1stLetter[i])) {
                    sum[i] += Integer.parseInt(art.split("\\s")[1]);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i=0; i<lstOf1stLetter.length; i++) {
            res.append(((i>0) ? " - " : "") + "(" + lstOf1stLetter[i] + " : " + sum[i] + ")");
        }
        return res.toString();
    }
}
