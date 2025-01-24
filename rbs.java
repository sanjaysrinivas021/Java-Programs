public class rbs {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }

    static int search(int[] arr, int target){
        int pivot = findpivot(nums);

        //if you did not find a pivot, it means the array is not rotated

        if(pivot == -1){
            //just do normal binary search
           return binarysearch(arr,target,0,arr.length-1);
        }
        if()
    }

    static int binarysearch(int[] arr,int target,int start,int end){
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
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
               return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
              return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
