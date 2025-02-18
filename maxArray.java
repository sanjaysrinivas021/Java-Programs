import java.util.Arrays;

public class maxArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 18,};
        System.out.println(maxRange(arr,1,3));
    }
    
    //work with some edge cases
    static int maxRange(int[] arr,int start, int end){
        if(end > start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
}

static int max(int[] arr){
    int maxVal = arr[0];
    for(int i=0;i<=arr.length;i++){
        if(arr[i] > maxVal){
            maxVal = arr[i];
        }
    }
    return maxVal;
}

}
