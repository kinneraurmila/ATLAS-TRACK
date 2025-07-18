import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        System.out.println("Given number :" + num);
        int numDigits=0;
        int temp= Math.abs(num);

        if(temp==0){
            numDigits=1;
        }else{
            while (temp>0){
                temp/= 10;
                numDigits++;
            }
        }
        System.out.println("no of digits in a given number : "+ numDigits);
    }
}
