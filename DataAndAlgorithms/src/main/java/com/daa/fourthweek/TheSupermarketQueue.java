package com.daa.fourthweek;

public class TheSupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] queue = new int[n];
        int time = 0;
        int curCustomer = 0;
        int sumQueue = 0;
        while(!(sumQueue==0 && curCustomer == customers.length)){
            sumQueue = 0;
            for(int i = 0; i< queue.length; i++){
                if(queue[i] == 0 && curCustomer != customers.length){
                    queue[i] = customers[curCustomer];
                    curCustomer++;
                }
                if(queue[i] > 0)
                    queue[i] = queue[i]-1;
                sumQueue += queue[i];
            }
            time++;
        }
        return time;
    }
}
