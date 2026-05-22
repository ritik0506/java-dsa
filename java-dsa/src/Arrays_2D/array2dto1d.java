package Arrays_2D;

public class array2dto1d {
    public static void main(String[] args) {
        int [][]  mat = {{1,2},{2,3}};
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];

        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = mat[i][j];
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
