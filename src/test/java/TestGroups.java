import org.testng.annotations.Test;

public class TestGroups {

    @Test(groups = "Regression")
    public void test()
    {
        System.out.println("Regression");
    }
    @Test(groups = "Sanity")
    public void test1()
    {
        System.out.println("Sanity");
    }
    @Test(groups = "Smoke")
    public void test2()
    {
        System.out.println("Smoke");
    }
    @Test(groups = {"Regression","Smoke"})
    public void test3()
    {
        System.out.println("Regression and Smoke");
    }
    @Test(groups = "Regression")
    public void test4()
    {
        System.out.println("Regression");
    }
    @Test(groups = {"Regression","Sanity"})
    public void test5()
    {
        System.out.println("Regression and Sanity");
    }

}
