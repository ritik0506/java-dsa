package Arrays_2D;

public class reverseofmatrices {
    public static void main(String[] args) {
        int[][] arr = {{6, 4, 3, 1}, {2, 4, 6, 8}, {0, 8, 5, 4}, {4, 5, 6, 7}};
        for (int i = 0; i < arr.length; i++) {
                int x = 0;
                int n = arr[i].length - 1;
                while (x < n) {
                    int temp = arr[i][x];
                    arr[i][x] = arr[i][n];
                    arr[i][n] = temp;
                    x++;
                    n--;
                }
            }
        for(int [] a: arr){
            for(int ele: a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
