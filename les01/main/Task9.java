package by.htp.les01.main;

public class Task9 {
	public static void main(String[] args) {

		double function;
		double x = 4;

		if (x <= 3) {
			function = Math.pow(x, 2) - 3 * x + 9;
		} else {
			function = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println(function);

	}

}
