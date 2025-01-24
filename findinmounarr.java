//find in mountain array
public class findinmounarr {
    public static void main(String[] args) {
        
    }

    int search(int[] arr,int target){
        int peak = mountainarray(arr);
        int firstTry = orderAgonsticBS(arr,target,start,peak);
        if(firstTry!=-1){
        return firstTry;
        }

        //try to search in second half
        return orderAgnosticBS(arr,target,start,peak);
    }
    public int mountainArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //In dec part of array
                //this may be the ans, but look at the left
                //this is why end!= mid-1
                end = mid;
            }
            else{
                //In Asc part of array
                start = mid+1; //because w.k.t mid+1 element > mid element
            }
        }
        //in the end, start == end and pointing to the largest number because of the two checks above
        //start and end are always trying to find the max element in tha aboe 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the checks says
        //more elaboration : at every point of time for start and end, they have best possible ans till that time 
        //and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;
   }

   static int orderAgonsticBS(int[] arr,int target,int start,int end){
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
