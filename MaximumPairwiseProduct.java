//Given an array of positive integers, return the product of the two highest value entries.

import java.util.Scanner;

public class MaximumPairwiseProduct {

    static int getHighestValuesProduct(int[] valuesArray) {

        int largestValue = -1;
        int secondLargestValue = -1;
        int valuesArrayLength = valuesArray.length;

        for (int i = 0; i < valuesArrayLength; i++) {
            if (valuesArray[i] > largestValue) {
                largestValue = valuesArray[i];
            }
        }
        System.out.println(largestValue);


        for (int j = 0; j < valuesArrayLength; j++) {
            if (valuesArray[j] != largestValue && valuesArray[j] > secondLargestValue) {
                secondLargestValue = valuesArray[j];
            }
        }
        System.out.println(secondLargestValue);


        return largestValue * secondLargestValue;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Nice try there wiseguy.");

        }
        int[] valuesArray = new int[n];
        for (int i = 0; i < valuesArray.length; i++) {
            valuesArray[i] = scanner.nextInt();
        }

        System.out.println(getHighestValuesProduct(valuesArray));

    }
}
