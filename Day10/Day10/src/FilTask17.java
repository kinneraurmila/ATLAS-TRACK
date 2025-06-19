
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class FilTask17 {
    public static void main(String args[]) {
        FileOutputStream outfile = null;
        // String s =args[0];
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();

        byte b1[] = str.getBytes();
        try
        {
            outfile = new FileOutputStream("FileName2.txt");
            outfile.write(b1);
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}


