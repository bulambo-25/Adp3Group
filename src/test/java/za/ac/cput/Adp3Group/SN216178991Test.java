package za.ac.cput.Adp3Group;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SN216178991Test {
    private SN216178991 Mane ;
    private SN216178991 Salah;

    @Test
    public void methodEquality()
    {
        Mane= Mane;
        //this test the value must be equal
        assertEquals(Mane ,Mane );


    }
    @Test
    public void methodIdentity()
    {
        Salah=Mane;
        //this test the value must be same
        assertSame(Mane,Salah);

    }
    @Test
    public void methodTimeout() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(2);

    }
    @Test
    public void methodDisabling()
    {
        String method=" Disabling method";
        System.out.println(method);
    }
    @Test
    public void Failingmethod()
    {
        String value=" failing method";
        fail(value);

    }

}