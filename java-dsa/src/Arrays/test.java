package Arrays;

public class test {
    public static void main(String[] args) {
        int [] arr={2,3,5,6};
        int k=4;
        int n=arr.length-1 +k;
        int []arr1= new int [n];
        int x=0,y=0;
        for(int i=1;i<arr1.length;i++){
            if(arr[x]!=i){
                arr1[y]=i;
                y++;
                System.out.println(i);
            }else{
                x++;
            }
        }
        for(int ele: arr1){
            System.out.println(ele);
        }
    }
}
