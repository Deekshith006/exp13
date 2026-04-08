package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class GreatestNumberTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testgreatest() {
    GreatestNumber obj=new GreatestNumber();

    assertEquals(5,obj.findGreatest(5,10));
    }
}
