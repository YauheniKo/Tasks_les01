package by.htp.les01.main;

public class Task8 {
	public static void main(String[] args) {
		double a = 5;
		double b = 7;
		double x = 10;
		double y = 31;
		double z = 22;

		while (true) {
			if (a < x && b < y | b < z) {
				System.out.print("Кирпич проходит");
				break;
			} else if (a < y && b < x | b < z) {
				System.out.print("Кирпич проходит");
				break;
			} else if (a < z && b < x | b < y) {
				System.out.print("Кирпич проходит");
				break;
			} else
				System.out.print("Кирпич не проходит");
			break;
		}
	}
}
