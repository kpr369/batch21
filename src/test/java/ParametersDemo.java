import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {


    @Test
    @Parameters({"test","numb"})
    public void test(String value,int number)
    {
        System.out.println(value);
        System.out.println(number);
    }
}
