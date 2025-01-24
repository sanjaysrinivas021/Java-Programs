import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        /*list.add(67);
        list.add(65);
        list.add(23);
        list.add(45);*/

        //System.out.println(list);
        //list.set(0,99);
        //System.out.println(list);
        //System.out.println(list.contains(46));
        
        //input
        /*for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }*/

        //to get input at index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); //pass index here list[index], else it won't work
        }
        System.out.println(list);
    }
}
