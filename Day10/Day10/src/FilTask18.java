import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
class FilTask18 {
    public static void main(String args[]) {
        File f1 = new File("FileName3.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f1);
            fw.write("ahmedabad \n");
            fw.write(" baroda \n");
            fw.write(" hyderabad \n");

            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Write operation done !");
    }
}


