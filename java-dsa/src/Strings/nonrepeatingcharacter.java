package Strings;

public class nonrepeatingcharacter {
    public static void main(String[] args) {
        String s="aabbccc";
        char[] arr= s.toCharArray();
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag= false;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                }
            }
            if(!flag){
                System.out.println(arr[i]);
                break;
            }else System.out.println("$");
        }
    }
}
