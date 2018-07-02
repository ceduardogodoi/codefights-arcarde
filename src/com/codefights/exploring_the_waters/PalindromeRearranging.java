package com.codefights.exploring_the_waters;

public class PalindromeRearranging {

	public static void main(String[] args) {
		String inputString = "aabb";

		palindromeRearranging(inputString);
	}

	static boolean palindromeRearranging(String s) {
		if (s.length() == 1) return true;
		
		StringBuffer sb = new StringBuffer(s);

		for (int i = 0, j = 1; i < sb.length() && j < sb.length(); i++, j++) {
			if (sb.charAt(i) == sb.charAt(j)) {
				sb.insert(0, sb.charAt(i));
				sb.insert(sb.length(), sb.charAt(j));
				sb.deleteCharAt(i + 1);
				sb.deleteCharAt(j);
			}
			
			String reversed = new StringBuffer(sb).reverse().toString();
			
			if (reversed.equals(sb.toString())) return true;
		}

		return false;
	}

}
