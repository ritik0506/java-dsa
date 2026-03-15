package Arrays;

import java.util.Scanner;

public class mergetwosortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the Second array");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int x= (2*n);
        int[] c= new int[x];
        int p=0;int q=0;int r=0;
        while (p<a.length && q< b.length){
            if(a[p]<b[q]){
                c[r]=a[p];
                p++;
            }else{
                c[r]=b[q];
                q++;
            }
            r++;
        }
            while(q<b.length){
                c[r]=b[q];
                q++;
                r++;
            }
            while (p<a.length) {
                c[r] = a[p];
                p++;
                r++;
            }
        for(int ele: c){
            System.out.println(ele);
        }
    }
}
