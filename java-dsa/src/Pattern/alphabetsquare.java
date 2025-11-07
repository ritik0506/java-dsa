package Pattern;

import java.util.Scanner;

public class alphabetsquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        //rows
        for(int i=1;i<n;i++){
            //column
            //typecasting (char)
            for (int j=65;j<67+n;j++){
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
