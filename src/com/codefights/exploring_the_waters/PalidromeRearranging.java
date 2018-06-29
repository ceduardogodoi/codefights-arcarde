package com.codefights.exploring_the_waters;

import java.util.HashMap;

public class PalidromeRearranging {

	public static void main(String[] args) {
		String inputString = "aabb";

		palindromeRearranging(inputString);
	}

	static boolean palindromeRearranging(String s) {
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0, c = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				c = 0;
			}
			map.put(arr[i], ++c);
		}
		
		return false;
	}

}
