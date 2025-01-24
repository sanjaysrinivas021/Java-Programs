public class orderagnobs {
    public static void main(String[] args) {
        int[] arr = {99,45,32,19,6,4,1};
        int target = 1;
        int ans = orderAgonsticBS(arr,target);
        System.out.println(ans);
    }
    
   


    static int orderAgonsticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
         //find whether the array is sorted in asc or des
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(isAsc){
                if(target < arr[mid]){
                end = mid-1;
                }
              else{
                  start = mid+1;
                }
            } 
            else{
                if(target > arr[mid]){
                  end = mid-1;
                }
                else {
                   start = mid+1;
                }

             } 
        }
        return -1;
    }
}
