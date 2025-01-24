public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,14,19,25};
        int target = 17;
        int ans = floor(arr,target);
        System.out.println(ans);
        
    }
    //Floor - return the index of greatest number which is smaller than or equal to target
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1;
        }
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
        return end;
    } 
}
