package Strings;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s= sc.nextLine();
//        String rev="";
//        for(int i=s.length()-1;i>=0;i--){
//            rev+=s.charAt(i);
//        }
//        System.out.println(rev);
        char[] ch= s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String rev= new String(ch);
        System.out.println(rev);
    }
}
