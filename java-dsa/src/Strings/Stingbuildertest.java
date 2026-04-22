package Strings;

public class Stingbuildertest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ritik");
        System.out.println(sb);
        sb.append("kumar");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
