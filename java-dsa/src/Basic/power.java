package Basic;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter power");
        int b= sc.nextInt();
        int res=1;
        for (int i=1;i<=b;i++){
            res*=a;
        }
        System.out.println(res);
    }
}
