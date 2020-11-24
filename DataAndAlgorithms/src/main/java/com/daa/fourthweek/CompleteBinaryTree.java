package com.daa.fourthweek;

import java.util.function.Function;

public class CompleteBinaryTree implements Function<int[], int[]> {
    private int[] firstArray;
    private int[] secondArray;

    @Override
    public int[] apply(int[] input) {
        firstArray = input;
        secondArray = new int[input.length];
        bfsArray(0,0);
        return secondArray;
    }

    private int bfsArray(int newIndex, int oldIndex) {
        if(newIndex*2+1 < firstArray.length)
            oldIndex=bfsArray(newIndex*2+1,oldIndex);
        secondArray[newIndex] = firstArray[oldIndex];
        oldIndex++;
        if(newIndex*2+2 < firstArray.length)
            oldIndex = bfsArray(newIndex*2+2, oldIndex);
        return oldIndex;
    }

}
