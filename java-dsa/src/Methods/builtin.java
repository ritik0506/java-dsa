package Methods;

import java.util.Scanner;

public class builtin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        //built in function
        //square root
        System.out.println(Math.sqrt(n));
        //floor function
        System.out.println(Math.floor(n));
        //celing function
        System.out.print(Math.ceil(n));
        //absolute value
        System.out.println(Math.abs(n));
        //min value
        System.out.println(Math.min(5,6));
        //max value
        System.out.println(Math.max(5,6));
    }
}
