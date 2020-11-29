package com.daa.fifthweek;

public class FindIndexOfSubArray {
    final int[] arr;
    final boolean aval;
    public FindIndexOfSubArray(int[] arr) {
        this.arr = arr;
        aval = arr[arr.length - 1] - arr[0] < 0;
    }

    public int[] findIndexOfSubArray(){
        //implementation here, return the start index m and end index n as array
        //return new int[]{m,n};

        int[] size = {arr.length, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (aval && arr[i] < arr[j] || !aval && arr[i] > arr[j]) {
                    size[0] = Math.min(i, size[0]);
                    size[1] = Math.max(j, size[1]);
                }
            }
        }
        return size[0] < arr.length ? size : new int[2];
    }
}
