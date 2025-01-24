public class first{
    public static void main(String[] args) {
        int[] nums = {1,23,34,45,67,9,32};
        int target = 9;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        
    }

    //search the array; return the item found
    //otherwise return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        //for(int i=0;i<arr.length;i++)
        for(int element : arr) {
            //int element = arr[i];
            if(element == target){
                return element;
            }
        }

        return -1;
    }
}