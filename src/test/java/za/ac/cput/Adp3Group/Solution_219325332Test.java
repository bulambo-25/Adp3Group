/**
 * SolutionTest.java
 * This is a class for TDD solution testing
 * Author Martinez safari 219325332
 * 06 Feb 2022
 */

package za.ac.cput.Adp3Group;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.*;

public class Solution_219325332Test {
    private int num1;
    private int num2;
    private int num3;

    @BeforeEach
    public void setUp() {
        num1  = 3;
        num2= 6;
        num3 = num2;
    }

    //Testing for object Equality
    @Test
    public void testEquality(){

        assertEquals(num2,num3);// Test passed because num2 equals num3
    }

    //Testing for object Identity
    @Test
    public void testIdentity(){

        assertSame(num2,num3);// Test passed num2 == num3
        //assertSame(num1,num2);//Test failed because num1 != num2
    }

    //Failing a test
    @Test
    public void failingTest(){
        fail("The following test will fail because it returns true when tested");
        assertSame(num2,num3);
    }

    //Testing for timeouts
    @Test(timeout = 1000)
    public void testTimeOuts(){
        assertEquals(num1, num3);

    }

    //Disabling a test
    @Test
    @Disabled("Disabled until a new feature is implemented")
    public void testSetNumber1() {
        System.out.println("setNumber1");
        int expected = 1;
        int result   = num1;
        assertEquals(expected, result);
    }


}

