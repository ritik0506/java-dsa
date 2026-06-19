package Recursion;

public class oddevensort {
    public static void main(String[] args) {
        int[] arr= {2,4,7,8,1,5,9};
        int [] arr1= new int[arr.length];
        int x=0;
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr[i]%2==0){
                arr1[x++]=arr[i];
                count++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr[i]%2!=0){
                arr1[x++]=arr[i];
            }
        }
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int pass = 0; pass < count; pass++) {
            int i = 0, j = 1;
            while (j <= count) {
                if (arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
                i++;
                j++;
            }
        }

        for(int ele:arr1){
            System.out.print(ele+" ");
        }
    }
}
