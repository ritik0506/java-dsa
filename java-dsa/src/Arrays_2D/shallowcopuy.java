package Arrays_2D;

public class shallowcopuy {
    public static void main(String[] args) {

        int[][] arr = {{2, 3}, {3, 4}};
        int[][] brr = {{2, 3}, {3, 4}};
        brr[1][1] = 5;
        System.out.println(arr[1][1]);
    }

}
