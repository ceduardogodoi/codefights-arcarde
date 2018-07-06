package com.codefights.island_of_knowledge;

public class ArrayMaximalAdjacentDifference {

	public static void main(String[] args) {
		int[] inputArray = { 2, 4, 1, 0 };

		arrayMaximalAdjacentDifference(inputArray);
	}

	static int arrayMaximalAdjacentDifference(int[] inputArray) {
		int max = 0;

		for (int i = 0; i < inputArray.length && i + 1 < inputArray.length; i++) {
			int tmp = inputArray[i] - inputArray[i + 1];
			if (Math.abs(tmp) > Math.abs(max))
				max = tmp;
		}

		return Math.abs(max);
	}

}
