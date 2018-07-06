package com.codefights.island_of_knowledge;

public class AreEquallyStrong {

	public static void main(String[] args) {
		int yourLeft = 10, yourRight = 15, friendsLeft = 15, friendsRight = 9;
		
		areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
	}
	
	static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		return (yourLeft == friendsLeft || yourLeft == friendsRight) && (yourRight == friendsLeft || yourRight == friendsRight);
	}
	
}
