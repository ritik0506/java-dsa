package Methods;

import java.util.Scanner;

public class Maxoffournubuiltin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("emter the numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));
    }
}
