package Recursion;

public class oddevenoptimized {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int i=0,j=arr.length-1;

        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] % 2 == 0) {
                i++;
            } else if (arr[j] % 2 != 0) {
                j--;
            }
        }

//        int count=0;
//        for(int x=0;x< arr.length;x++){
//            if(arr[x]%2==0) count++;
//        }
//        System.out.println(count);
//        for(int m=0;m<count-1;m++) {
//            for(int n=m+1;n<count-m-1;n++) {
//                if (arr[n] < arr[n+1] && n!=count) {   // swap adjacent
//                    int temp = arr[n];
//                    arr[n] = arr[n+1];
//                    arr[n+1] = temp;
//                }
//            }
//        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
