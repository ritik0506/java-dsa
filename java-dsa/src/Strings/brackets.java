package Strings;

public class brackets {
    public static void main(String[] args) {
        String s = "(())))(";
        int n = s.length();
        int totalClose = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ')') {
                totalClose++;
            }
        }

        int openCount = 0, closeCount = totalClose;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else {
                closeCount--;
            }

            if (openCount == closeCount) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
