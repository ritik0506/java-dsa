package Basic;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x= sc.nextInt();
        if(x%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
