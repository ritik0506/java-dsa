package Arrays;

import java.util.Scanner;

public class tryy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array size");
        int size= sc.nextInt();
        int [] x=new int[size];
        System.out.println("enter the array");
        for (int i=0;i<size;i++){
            x[i]= sc.nextInt();
        }
        for (int j=0;j<size;j++){
            System.out.println(x[j]);
        }

    }
}
