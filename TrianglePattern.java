import java.util.Scanner;
public class TrianglePattern{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:")
        int rows=input.nextInt();
        for int(i=1;i<=rows;i++){
            for int(j=1;j<=rows-i;j++){
                System.out.println("");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}