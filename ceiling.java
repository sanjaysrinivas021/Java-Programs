public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,14,19,25};
        int target = 1;
        int ans = ceiling(arr,target);
        System.out.println(ans);
        
    }
    //return the index
    //return start if doesn't exist
    //Ceiling - return the index of smallest number which is greater than or equal to target
    static int ceiling(int[] arr,int target){

        //condition if the target element is greatest of greater element
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2 there might be a possible that it exceed the int range
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target >arr[mid]){
                start = mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return start;
    } 
}
