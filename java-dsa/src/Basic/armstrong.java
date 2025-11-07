package Basic;

import java.util.Scanner;

public class armstrong {
    //armstrong number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int n = sc.nextInt();

        //finding digit
        int count = 0;
        int x = n;

        //len
        while (x > 0) {
            x /= 10;
            count++;
        }
        System.out.println("length of n will be " + count);

        //armstrong
        int y = n;
        int sum = 0; // corrected from digit to sum
        while (y > 0) {
            int digit = y % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit; // corrected logic: digit^count
            }
            sum += power; // corrected: accumulate powered digits
            y /= 10;
        }

        System.out.println("Armstrong sum is: " + sum);
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}