package com.daa.thirdweek;

import java.util.ArrayList;
import java.util.List;

public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<T>();
        int index = 0;
        List<Integer> persons = new ArrayList<Integer>(items.size());
        for(int i = 0; i < items.size(); i++){
            persons.add(i);
        }
        while(persons.size() > 0){
            index = (index + k - 1) % persons.size();
            result.add(items.get(persons.get(index)));
            persons.remove(index);
        }
        return result;
    }
}
