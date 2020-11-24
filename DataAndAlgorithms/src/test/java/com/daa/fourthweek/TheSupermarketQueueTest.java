package com.daa.fourthweek;

import org.junit.Assert;
import org.junit.Test;


public class TheSupermarketQueueTest {

    @Test
    public void testNormalCondition() {
        Assert.assertEquals(9, TheSupermarketQueue.solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2));
    }

    @Test
    public void testEmptyArray() {
        Assert.assertEquals(0, TheSupermarketQueue.solveSuperMarketQueue(new int[]{}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        Assert.assertEquals(15, TheSupermarketQueue.solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
    }

}