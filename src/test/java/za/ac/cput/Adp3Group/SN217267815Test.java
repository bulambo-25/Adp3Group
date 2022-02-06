package za.ac.cput.Adp3Group;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SN217267815Test {
    private SN217267815 company1;
    private SN217267815 company2;

    @Before
    public void setUp() throws Exception {
        company1 = new SN217267815();
        company2 = company1;

    }

    @Test
    public void equality() {
        assertEquals(company1, company1);
    }

    @Test
    public void Identity() {
        assertSame(company2, company2);
    }

    @Test
    public void Disabled() {
        assertSame(company2, company2);
    }

    @Test
    public void FailingTest() {

        fail("intentionally made to fail");

    }

    @Test
    public void testMethodOne() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }
}

