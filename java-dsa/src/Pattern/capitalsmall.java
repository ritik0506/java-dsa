package Pattern;

import java.util.Scanner;

public class capitalsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        //odd even
        //printing the small and capital alphabet
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i%2==0){
                    System.out.print((char)(64+i));
                }
                else{
                    System.out.print((char)(96+i));
                }
            }
            System.out.println();
        }
    }
}
