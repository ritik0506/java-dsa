package Arrays;

public class maxsum {
    public static void main(String[] args) {
        int [] arr= {100,200,300,400};
        int k=2;
        int n= arr.length;
        int totalsum=0;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum+=arr[j];
            }
            if(totalsum<sum){
                totalsum= sum;
            }
        }
        System.out.println(totalsum);
    }
}
