import java.util.Arrays;
import java.util.Scanner;
class Array{
    public static void main(String[] args){
      int [] a = {3,4,5,6};
      System.out.print(Arrays.toString(a));
      change(a);
      System.out.print(Arrays.toString(a));
    }
    static void change(int[] arr){
        arr[0]=1;
    }
}