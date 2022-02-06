package za.ac.cput.Adp3Group;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SN220048762Test
{
    private SN220048762 Student1;
    private SN220048762 Student2;
    private SN220048762 Student3;

    @Before

    public void setUp() {
        Student1 = new SN220048762();
        Student2 = Student3;
    }
    @Test
    public void Equality() {
        assertEquals(Student3, Student2);
    }
   @Test
    public void Identity() {
        assertEquals(Student3, Student2);
    }

    @Test
    public  void Failing() {

        fail("this method is going to fail");
    }


    @Test
    public void Disable()
    {
        System.out.println("This is the testcase test_JUnit4() The method Disable");
    }

    @Test
    public void testTimeoutOne() throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(1);
    }
}