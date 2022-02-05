package za.ac.cput.Adp3Group;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
/**
 *
 * @author Name:Mutamba Prince Bulambo
 *    Student N: 220177767
 *
 */

public class St220177767Test
{
    private  St220177767 Bulambo;
    private  St220177767 Mutamba;
    private  St220177767 Prince;
    @Before
    public void setUp() throws Exception
    {
        Bulambo= Bulambo;
        Mutamba=new St220177767();
        Bulambo=Prince;

    }
    @Test
    public void testEquality()
    {
        assertEquals(Bulambo,Bulambo);
    }
    @Test
    public void testIdentity()
    {
        assertSame(Bulambo,Prince);
    }


    @Test(timeout = 10000)
    public void TestTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
    @Test
    public void testDisabling()
    {
        System.out.println("the test is Disable");
    }
    @Test
    public void FailingTest()
    {
        int num1=2,num2=3;
        int total=75;
        fail("deliberately made the test fail");

    }
}