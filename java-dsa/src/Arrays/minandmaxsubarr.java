package Arrays;

public class minandmaxsubarr {
    public static void main(String[] args) {
        int [] arr={2,5,-1,7,-3,-1,-2};
        int k=4;
        int n= arr.length;
        int sum=0;
        for(int i=0;i<=n-k;i++) {
            int min=arr[i];
            int max=arr[i];
            for (int j = i; j < k + i; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
                if(arr[j]>max) {
                    max = arr[j];
                }
            }
            System.out.println(min+""+max);
            sum+=(max+min);

        }
        System.out.println(sum);
    }
}
