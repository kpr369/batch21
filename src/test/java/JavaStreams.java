import java.util.Scanner;

public class JavaStreams {

    public static void main(String[] args) {


        System.out.println("Please Enter Name");
        Scanner scanner = new Scanner(System.in);
       /* String data = scanner.nextLine();
        System.out.println(data.toUpperCase());*/

        if(scanner.nextInt()<18)
        {
            System.out.println("Not Eligible");
        }
    }
}
