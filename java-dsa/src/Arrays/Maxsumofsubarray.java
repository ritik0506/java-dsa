package Arrays;

public class Maxsumofsubarray {
    public static void main(String[] args) {
        int [] arr= {1,4,2,10,23,3,1,0,20};
        int k=4;
        int n= arr.length;
        int sum=0;
        for(int i=0; i<=n-k;i++){
            int max=arr[i];
            for(int j=i;j<k+i;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            sum+=max;
        }
        System.out.println(sum);
    }
}
