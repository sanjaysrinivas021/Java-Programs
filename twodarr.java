import java.util.Scanner;
import java.util.Arrays;
public class twodarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
    /* 
       1 2 3
       4 5 6
       7 8 9
    */

    int[][] arr= new int[3][3];
    /*int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };*/
    System.out.println(arr.length);

    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){
           arr[row][col]=in.nextInt();
        }
       }

   /*for(int row=0;row<arr.length;row++){
    for(int col=0;col<arr[row].length;col++){
        System.out.print(arr[row][col]+" ");
    }
    System.out.println();
   }*/

   /*for(int row=0;row<arr.length;row++){
    System.out.println(Arrays.toString(arr[row]));
   }*/

   /*for(int[] a : arr){
    System.out.println(Arrays.toString(a));
   }*/

  }
}
