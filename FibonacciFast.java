import java.math.BigInteger;
import java.util.Scanner;

public class Algorithm {
    private static BigInteger calc_fib(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger[] prevCalcs = new BigInteger[n + 2];

        prevCalcs[0] = BigInteger.valueOf(0);
        prevCalcs[1] = BigInteger.valueOf(1);

        for (int i = 2; i < n + 1; i++) {
            prevCalcs[i] = prevCalcs[i - 1].add(prevCalcs[i - 2]);
        }

        return prevCalcs[n];

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
