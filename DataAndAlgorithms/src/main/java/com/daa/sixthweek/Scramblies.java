package com.daa.sixthweek;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char ch : str1.toCharArray()) hashMap.put(ch, 1 + hashMap.getOrDefault(ch, 0));
        for (char ch : str2.toCharArray()) {
            Integer counts = hashMap.getOrDefault(ch, 0);
            if (counts == 0) return false;
            hashMap.put(ch, --counts);
        }
        return true;
    }
}
