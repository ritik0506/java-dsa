package Strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1= "geeks";
        String s2= "kseeg";
        boolean flag= true;

       char[] arr1= s1.toCharArray();
       char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            System.out.println("false");
            return;
        }
        for(int i=0;i<s1.length();i++){
                if(arr1[i]!=arr2[i]){
                    flag= false;
                }
            }
        if(!flag) System.out.println("flase");
        else System.out.println("true");
    }
}
