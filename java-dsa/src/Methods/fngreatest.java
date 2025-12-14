package Methods;

public class fngreatest {
    public static void greatest(int a, int b, int c){
        if (a>b||b<c){
            if(a<c){
                System.out.println("c is gratest");
            }else {
                System.out.println("a is greatest");
            }
        }else{
            System.out.println("b is greatest ");
        }
    }
    public static void main(String[] args) {

        greatest(45,50,40);
    }
}
