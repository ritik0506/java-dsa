package Strings;

public class ComparetoStringMethod {
    public static int compare(String a, String b) {

        for(int i=0;i<a.length();i++) {
            if ((int) (a.charAt(i)) == (int) (b.charAt(i))) {
                continue;
            } else {
                return (int) (a.charAt(i)) - (int) (b.charAt(i));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1="ritik";
        String s2="ramesh";
        System.out.println(s1.compareTo(s2));
        int x= compare(s1,s2);
        System.out.println(x);
    }
}
