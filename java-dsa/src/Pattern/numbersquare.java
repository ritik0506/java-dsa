package Pattern;

import java.util.Scanner;

public class numbersquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        //rows
        for(int i=1;i<=n;i++){
            //column
            for (int j=67;j<=67+n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
