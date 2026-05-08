package Arrays_2D;

public class snakepatterncolumnwise {
    public static void main(String[] args) {
        int[][] arr = {{6, 4, 3, 1, 7}, {2, 4, 6, 8}, {0, 8, 5, 4}, {4, 5, 6, 7}};
        for (int i = 0; i < arr.length; i++) {
                int x = 0, y = arr.length - 1;
                if (i % 2 != 0) {
                    while (x < y) {
                        int temp = arr[x][i];
                        arr[x][i] = arr[y][i];
                        arr[y][i] = temp;
                        x++;
                        y--;
                    }
                }
            }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}
  