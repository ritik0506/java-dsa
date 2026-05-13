package Arrays_2D;

import java.util.ArrayList;

public class arraylist2d {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(4);
        ArrayList<Integer>b= new ArrayList<>();
        b.add(5);
        b.add(8);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
//        System.out.println(arr);
//        for(int i=0;i< arr.size();i++){
//            for(int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j));
//            }
//        }
        for(ArrayList<Integer> list:arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
