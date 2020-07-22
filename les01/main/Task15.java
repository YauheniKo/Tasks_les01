package by.htp.les01.main;

public class Task15 {
	public static void main(String[] args) {
		int a = 195;
		
		int b = 156;
		
		int d = 260;
		
		int c = Math.min(a, b);
		int min = Math.min(c, d);
		
		while (true) {
			if (a % min == 0 & b % min == 0 & d % min == 0) {
				break;
			}
			min--;

		}
		System.out.println(min);
	}
}
