package Recursion;

public class araisetopowerb {
    public static void main(String[] args) {
      int x=  pow(2,3);
        System.out.println(x);
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int ans= a*pow(a,b-1 );
        return ans;
    }
}
