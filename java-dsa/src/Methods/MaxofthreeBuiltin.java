package Methods;

import java.util.Scanner;

public class MaxofthreeBuiltin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
