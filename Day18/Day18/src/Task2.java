import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 5 digit number:");
        int num= sc.nextInt();

        int digit1 =num%10;
        int digit2 =(num/10)%10;
        int digit3 =(num/100)%10;
        int digit4 =(num/1000)%10;
        int digit5 =(num/10000)%10;

        System.out.println("At once position:" + digit1);
        System.out.println("At 10 position:" + digit2);
        System.out.println("At 100 position:" + digit3);
        System.out.println("At 1000 position:" + digit4);
        System.out.println("At 10000 position:" + digit5);


    }
}
