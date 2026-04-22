package Arrays;

public class slidingwindow {
    public static void main(String[] args) {
        int []arr={100,200,300,400};
        int k=2;
        int n= arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int j=k;j<n;j++){
            sum+=arr[j];
            sum-=arr[j-k];
            if(maxsum<sum){
                maxsum=sum;
            }
        }
        System.out.println(maxsum);
    }
}
