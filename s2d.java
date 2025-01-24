import java.util.Arrays;

public class s2d {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {77,98,59,36},
            {1,2}
        };
        int target = 18;
        //int[] ans = search(arr,target);
        //System.out.println(Arrays.toString(ans));
        System.out.println(min(arr));
    }

    static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        //for(int row=0;row<arr.length;row++){
            //for(int col=0;col<arr[row].length;col++){
            for(int[] nums : arr){
            for(int element : nums){
                if(element>max){
                   max = element;
                }
            }
        }
        return max;
    }

    static int min(int[][] arr){
        //int min = Integer.MAX_VALUE;
        int min = arr[0][0];
        for(int[] nums : arr){
            for(int element : nums){
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }
}
