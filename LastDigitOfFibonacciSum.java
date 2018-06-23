import java.math.BigInteger;
import java.util.Scanner;

public class LastDigitOfFibonacciSum {
    private static int calc_fib(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n).intValue();
        n = n+2;
        BigInteger[] prevCalcs = new BigInteger[n + 2];
        prevCalcs[0] = BigInteger.valueOf(0);
        prevCalcs[1] = BigInteger.valueOf(1);
        BigInteger result = BigInteger.valueOf(0);
        for (int i = 2; i < n + 1; i++) {
            prevCalcs[i] = prevCalcs[i - 1].add(prevCalcs[i - 2]);
            result = prevCalcs[i];
        }

        return result.mod(BigInteger.valueOf(10)).intValue() -1;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
