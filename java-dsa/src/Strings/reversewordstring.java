package Strings;

public class reversewordstring {

    public static void main(String[] args) {
        String s="i.like.this.program.very.much";
        StringBuilder sb= new StringBuilder(s);
        sb=sb.reverse();
        char[] c= sb.toString().toCharArray();
        int x=0,y=0,z=0;
        for(int i=0;i<c.length;i++){
            if(c[z]!='.'){
                z++;
            }else {
                y = z-1;
                while (x <= y) {
                    char temp = c[y];
                    c[y] = c[x];
                    c[x] = temp;
                    x++;
                    y--;
                }
                x=z+1;
                z++;
            }
        }
        System.out.println(c);
    }
}
