package Strings;

public class trry {
    public static void main(String[] args) {
        int [] arr= {100,200,300,400};
        int i=0,j=1;
        int n= arr.length;
        int maxsum=0;

        while(j<n){
          int sum=arr[i]+arr[j];
            if(maxsum<sum){
                maxsum=sum;
            }
            i++;
            j++;
        }
        System.out.println(maxsum);
    }
}
