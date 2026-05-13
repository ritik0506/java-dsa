package Arrays_2D;

public class rotatematrix {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
            int x = 0, n = arr.length - 1;
            while (x < n) {
                for (int i = 0; i < arr.length; i++) {
                    int temp= arr[x][i];
                    arr[x][i]=arr[n][i];
                    arr[n][i]=temp;
            }
                x++;
                n--;
        }
            //transpose
            for(int i=0;i< arr.length;i++){
                for(int j=i+1;j<arr[i].length;j++){
                    int temp= arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            //print column wise
//           for(int i=0;i< arr.length;i++){
//               for(int j=0;j< arr[i].length;j++){
//                   System.out.print(arr[j][i]);
//               }
//               System.out.println();
//           }
        for(int [] a:arr){
            for(int ele: a){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
