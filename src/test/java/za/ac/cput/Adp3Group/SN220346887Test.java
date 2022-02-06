package za.ac.cput.Adp3Group;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SN220346887Test {
   private SN220346887 Manager;
   private SN220346887 employee;
   private SN220346887 HR;
    private SN220346887 Admin;
    @Before
    public void setUp() throws Exception
    {
         Manager=Admin;
         HR=HR;

    }
    @Test
    public void TestEquality()
    {

        assertEquals(HR,HR);

    }
    @Test
    public void TestIdentity()
    {

        assertSame(Manager,Admin);

    }


    @Test
    public void Timeout()  {
     try {
         TimeUnit.SECONDS.sleep(100);
         // sleep for 100 seconds
     }catch (Exception e)
     {
        System.out.println(e.getMessage());
     }

    }
    @Test
    public void testDisabling()
    {
        System.out.println("This test has been disabled");
    }
    @Test
    public void FailingTest()
    {

        fail("This test has failed");

    }
}