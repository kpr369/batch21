import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertonsDemo {

    @Test
    public void test()
    {
        SoftAssert sa = new SoftAssert();
        String expected ="google";
        String actual = "google";

        sa.assertTrue(true,"asfasdfsd");
        sa.assertEquals(actual,expected,"Testfailed with issue");
        sa.assertFalse(true);
        sa.assertAll();

    }
}
