import java.util.Scanner;
class loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        for(int row=0;row<=n-1;row++){
            for(int col=0;col<=n-1;col++){
                if(row == col){
                   System.out.print(s.charAt(row));
                 }
                 else if( col==n-row-1){
                     System.out.print(s.charAt(col));
                 }
                 else{
                     System.out.print("  ");
                 }
        }
         System.out.println();
    }
}
}

