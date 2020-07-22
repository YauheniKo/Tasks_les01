package by.htp.les01.main;

import java.math.BigInteger;
import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		BigInteger fact = BigInteger.ONE;
		
		for (int i = 1; i <= a; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.print(fact);
		
		sc.close();
	}

}
