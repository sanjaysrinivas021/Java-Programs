public class findmin {
    public static void main(String[] args) {
        int[] arr = {12,34,5,67,89,23};
        System.out.print(min(arr));
    }
    static int min(int[] arr){
        int minVal = arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<minVal){
           minVal = arr[i];
        }
    }
    return minVal;
 }
}
