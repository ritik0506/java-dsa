package Strings;

public class stringreverse {
    public static void main(String[] args) {
        String s="ritik";
        StringBuilder sb= new StringBuilder(s);
        sb=sb.reverse();
        s= sb.toString();
        System.out.println(s);
    }
}
