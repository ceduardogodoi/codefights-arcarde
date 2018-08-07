package com.codefights.island_of_knowledge;

public class IsIPv4Address {

	public static void main(String[] args) {
		String inputString = "1.255.260.1";

		System.out.println(isIPv4Address(inputString));
	}

	static boolean isIPv4Address(String inputString) {
		String[] a = inputString.split("\\.");

		if (a.length != 4)
			return false;

		for (String s : a) {
			if (!s.matches("\\d{1,3}"))
				return false;

			int v = Integer.valueOf(s);
			if (v < 0 || v > 255)
				return false;
		}

		return true;
	}

}
