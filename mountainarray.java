public class mountainarray {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //In des part of array
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
        return start; //or return end as both are equal
    }
}
