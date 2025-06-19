import java.io.*;
public class FilTask20 {
  public static void main(String args[]) {

      try {
          byte b = 0;
          FileInputStream infile = new FileInputStream("FileName1.txt");
          FileOutputStream outfile = new FileOutputStream("in.txt");

          // Initialize byteread here….
          int bytesread;

          while ((bytesread = infile.read()) != -1) {
              b = (byte) infile.read();
              outfile.write(bytesread);
          }
          System.out.println("Byte Copied From in.txt to out.txt FIle ");
      } catch (FileNotFoundException e) {
          System.out.println("Sorry..!! File Not Found...!!!");
      } catch (IOException e) {
          System.out.println(e.getMessage());
      }
  }
}



