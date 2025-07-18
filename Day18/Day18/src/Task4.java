import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task4 {
    public static int getMax(int[] num){
        int max=0;
        for(int arr: num){
            if(arr>max){
                max=arr;
            }
        }

        return max;
    }
    public static void radixSort(int[] num){
        int max= getMax(num);
        for(int exp=1;max/exp>0;exp*=10){
            countingSort(num,exp);
        }
    }
    public static void countingSort(int[]num,int exp){
        int[]output =new int[num.length];
        int[]count =new int[10];

        for(int arr:num){
            count[(arr/ exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+= count[i-1];
        }
        for(int i= num.length-1;i>=0;i--){
           output[count[(num[i] / exp) % 10] - 1]= num[i];
            count[(num[i]/exp)%10]--;
        }
        System.arraycopy(output,0,num,0,num.length);
    }

    public static void main(String[] ars) {
        int[] num= {122,678,890,567};

       System.out.println(Arrays.toString(num));
       System.out.println(getMax(num));

       System.out.println("After sorting using Radix:");
       radixSort(num);
        System.out.println(Arrays.toString(num));

    }

}
