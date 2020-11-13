package com.daa.secondweek;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BinaryToTextASCIIConversionTest extends TestCase {
    @Test
    public void testHello() {
        assertEquals(
                "Hello",
                BinaryToTextASCIIConversion.binaryToText("0100100001100101011011000110110001101111"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(
                "",
                BinaryToTextASCIIConversion.binaryToText(""));
    }
}