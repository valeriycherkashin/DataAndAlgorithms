package com.daa.sixthweek;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelpTheBookSellerTest {
    @Test
    public void test1() {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                HelpTheBookSeller.stockSummary(art, cd));
    }
}