package Arrays_2D;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{6, 4, 3, 1}, {2, 4, 6, 8}, {0, 8, 5, 4}, {4, 5, 6, 7}};
        for(int i=0;i< arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int [] a: arr){
            for(int ele:a){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
