package Arrays_2D;

import java.util.ArrayList;

public class pascaltriangle {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<Integer>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans.get(i).add(1);
                }else {
                    int val =  ans.get(i - 1).get(j)+ans.get(i - 1).get(j - 1) ;
                    ans.get(i).add(val);
                }
            }
        }
            for(ArrayList<Integer> List: ans){
                for(int ele:List){
                    System.out.print(ele);
                }
                System.out.println();
            }
        }
    }
