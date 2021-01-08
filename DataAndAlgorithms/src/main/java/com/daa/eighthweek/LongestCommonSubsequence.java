package com.daa.eighthweek;

public class LongestCommonSubsequence {

    public static String lcs(String a, String b) {
        int[][] lengths = new int[a.length()+1][b.length()+1];
        for (int i = 0; i < a.length(); i++)
            for (int j = 0; j < b.length(); j++)
                if (a.charAt(i) == b.charAt(j))
                    lengths[i+1][j+1] = lengths[i][j] + 1;
                else
                    lengths[i+1][j+1] = Math.max(lengths[i+1][j], lengths[i][j+1]);

        StringBuilder stringBuffer = new StringBuilder();
        for (int i = a.length(), j = b.length(); i != 0 && j != 0; ) {
            if (lengths[i][j] == lengths[i-1][j])
                i--;
            else if (lengths[i][j] == lengths[i][j-1])
                j--;
            else {
                assert a.charAt(i-1) == b.charAt(j-1);
                stringBuffer.append(a.charAt(i-1));
                i--;
                j--;
            }
        }
        return stringBuffer.reverse().toString();
    }
}
