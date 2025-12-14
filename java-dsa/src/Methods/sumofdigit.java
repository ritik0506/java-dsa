package Methods;

public class sumofdigit {
    public static void sum(int n){
        int add=0;
        int rem;
        while(n>0){
            rem=n%10;
            add+=rem;
            n/=10;
        }
        System.out.println(add);
    }
    public static void main(String[] args) {
        sum(234);
    }
}