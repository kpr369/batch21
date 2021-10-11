import org.testng.annotations.*;

public class TestNgDemo {

    @Test  //Testcase
    public void test()
    {
        System.out.println("Test");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite");
    }
    @Test
    public void test1()
    {
        System.out.println("Test1");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method");
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class");

    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");

    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }
}
