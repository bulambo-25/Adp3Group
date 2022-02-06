package za.ac.cput.Adp3Group;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SN219383448Test
{



    @Test
    public void Failingtest() {
        fail("Cape Town Weather");
    }
    @Test
    public void testEquality(){
        String statA = "Spring";
        String statB = "Spring";
        assertEquals(statA , statB);
    }
    @Test
    public void testIdentity(){
        String statC  = "Winter";
        String statD = "Winter";
        assertSame(statC, statD);
    }
    @Test

    public void disabledTest(){
        int e = 24;
        int h = 32;
        int sum = e + h;
        System.out.println("The Sum of e + h = " +sum);

    }

}