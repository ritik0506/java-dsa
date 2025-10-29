package Basic;

import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int x= sc.nextInt();
        int count=0;
        while (x > 0) {
            x=x/10;
            count++;
        }
        System.out.println("this no contain "+count+" digit");

        //for(int i=1; x>0; i++)
    }
}
