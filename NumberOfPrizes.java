import java.util.*;

public class numPrizes {

    private static List<Integer> positiveIntegers(int n) {

        List<Integer> positiveIntegers = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {

            n -= i;

            if (n <= i) {

                positiveIntegers.add(n + i);

            } else {

                positiveIntegers.add(i);
            }
        }

        return positiveIntegers;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> positiveIntegers = positiveIntegers(n);
        System.out.println(positiveIntegers.size());
        for (Integer i : positiveIntegers) {
            System.out.print(i + " ");

        }
    }
}
