import java.util.Scanner;

public class NumberOfChangeCoins {

    private static long numCoins(int n) {

        long numQuarters = 0;
        long numDimes = 0;
        long numNickels = 0;
        long numPennies = 0;

        while (n >= 1) {

            if (n >= 25) {
                n -= 25;
                numQuarters += 1;
            } else if (n > 10 && n <= 24) {
                n -= 10;
                numDimes += 1;
            } else if (n <= 9 && n > 4) {
                n -= 5;
                numNickels += 1;
            } else if (n <= 4) {
                n -= 1;
                numPennies += 1;
            }
        }

        return (numQuarters + numDimes + numNickels + numPennies);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(numCoins(n));
    }
}
