package Basic;

import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the negative no");
        float x=sc.nextFloat();
        if(x>=0){
            System.out.println(x);
        }else{
            x*=(-1);
            System.out.println(x);
        }
    }
}
