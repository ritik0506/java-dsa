package Arrays;

import java.util.Arrays;

public class Shallowcopydeepcopy {
    public static void main(String[] args) {
        //challow copy
        int[] arr={20,30,40,50};
        int[] c=arr; //c is shallow copy of arr
        c[1]=70;
        System.out.println(arr[1]);

        //deep copy
        int[] deep= Arrays.copyOf(arr,arr.length);
        deep[2]=60;
        System.out.println(deep[2]+" "+arr[2]);
    }
}
