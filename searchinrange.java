public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {12,34,5,67,89,23};
        int startindex = 1;
        int endindex = 4;
        int target = 5;
        int ans = search(arr,startindex,endindex,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int startindex, int endindex,int target){
        for(int i=startindex;i<=endindex;i++){
            int element = arr[i];
          if(element == target){
            return i;
          }
        }
        return -1;
    }
}
