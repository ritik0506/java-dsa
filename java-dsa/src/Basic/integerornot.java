package Basic;

import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no");
         double x= sc.nextDouble();
         int y=(int)x;
         if(y-x>0){
             System.out.println(" integer");
         }else{
             System.out.println(" not an integer");
         }

    }
}
