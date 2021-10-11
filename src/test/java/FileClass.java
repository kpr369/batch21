import java.io.File;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {

        File file = new File("Z:\\Selenium Softwares");

        File file1 = new File("Z:\\Selenium Softwares\\test1.txt");

        for(File f: file.listFiles())
        {
            System.out.println(f.getName()+" : \t"+ f.isFile());
        }

        for(String s : file.list())
        {
            System.out.println(s);
        }
      /*  System.out.println(file.length());
        file.renameTo(file1);*/

    /*    System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.getName());*/

     /*   System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());*/
        //file.mkdir();

       /* System.out.println(file.isDirectory());
        System.out.println(file.isFile());*/
/*

    file.mkdir();*/


    }
}
