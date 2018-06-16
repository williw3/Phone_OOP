package com.codingdojo.phone;

public class PhoneTester {

	public static void main(String[] args) {
		IPhone iphone10 = new IPhone("8", 69, "AT&T", "Calypso!!!");
		iphone10.displayInfo();
		iphone10.ring();
		iphone10.unlock();
		
		Galaxy g7 = new Galaxy("s9", 77, "Verizon", "Holla, Holla!!");
		g7.displayInfo();
		g7.ring();
		g7.unlock();

	}

}
