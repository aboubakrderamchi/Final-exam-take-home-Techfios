package finalExamTechfios;

import java.util.Arrays;
import java.util.Random;

public class Random500Numbers {

	public static void main(String[] args) {
		generateRandomNumbersAndPrintSmallest(500);
	}

	public static void generateRandomNumbersAndPrintSmallest(int numberThreshold) {
		System.out.println("This program will generate 500 random Numbers and print the smallest generated number");
		Random rnd = new Random();
		int[] numberArrays = new int[numberThreshold];
		numberArrays[0] = rnd.nextInt(1500);
		int smallestNth = numberArrays[0];
		for (int i = 1; i < numberArrays.length; i++) {
			numberArrays[i] = rnd.nextInt(1000) + 1;
			if (numberArrays[i] < smallestNth) {
				smallestNth = numberArrays[i];
			}
		}
		System.out.println("500 random numbers: " + Arrays.toString(numberArrays));

		System.out.println("The smallest nth number is " + smallestNth);
	}
}
