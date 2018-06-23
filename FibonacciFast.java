import java.util.Scanner;

public class FibonacciFast {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        int[] prevCalcs = new int[n + 2];

        prevCalcs[0] = 0;
        prevCalcs[1] = 1;

        for (int i = 2; i < n + 2; i++) {
           prevCalcs[i] = prevCalcs[i-1] + prevCalcs[i-2];
        }

        return prevCalcs[n];

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
