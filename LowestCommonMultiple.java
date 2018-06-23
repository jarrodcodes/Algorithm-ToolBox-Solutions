import java.math.BigInteger;
import java.util.Scanner;

public class LowestCommonMultiple {
    public static long gcd(long a, long b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    private static long calc_fib(long n, long m) {

        BigInteger gcd = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m));

        long lcm = (n * m) / gcd.longValue();
        return lcm;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        System.out.println(calc_fib(n, m));
    }
}
