import java.util.ArrayList;
import java.util.Scanner;

public class multidiarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //Initialization
        for(int i=0;i<5;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.err.println(list);
    }
}
