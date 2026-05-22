package Arrays_2D;

public class matrixmultiplicaation {
    public static void main(String[] args) {
        int [][] arr= {{2,3},{4,5}};
        int [][] arr1={{4,3},{6,7}};
        int [][] res= new int [2][2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr1[i].length;k++){
                    res[i][j]+=(arr[i][k]*arr1[k][j]);
                }

            }
        }
        for(int [] a: res){
            for(int ele: a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
