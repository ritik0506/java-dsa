package Arrays;

import java.util.ArrayList;

public class arraylistcheck {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(50);
        arr.add(20);
        arr.add(29);
        System.out.println(arr);//directly printing

        System.out.println(arr.get(2));
        arr.set(2,50);//index and value
        for(int i=0;i< arr.size();i++){//instead of arr.length
            System.out.println(arr.get(i));
        }
    }
}
