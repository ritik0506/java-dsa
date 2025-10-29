package Basic;

import java.util.Scanner;

public class profitorloss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Cost price");
        float cp= sc.nextFloat();
        System.out.println("enter Selling price");
        float sp= sc.nextFloat();
        if(cp==sp){
            System.out.println("neither profit nor loss");
        }
        else if(cp<=sp){
            float profit= sp-cp;
            System.out.println("profit of rs:- " +profit);
        }else{
            float loss= cp-sp;
            System.out.println("loss of Rs:- " +loss);
        }
    }
}
