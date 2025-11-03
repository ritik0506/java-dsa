package Basic;

import java.util.Scanner;

public class evenusingloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        //even
        for (int i=1; i<=n;i++){
            if(i%2==0){
                System.out.println("even"+i);
            }else{
                System.out.println("odd"+i);
            }
        }
    }
}
