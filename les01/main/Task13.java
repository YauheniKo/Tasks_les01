package by.htp.les01.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int a;

		while (true) {
			a = Integer.parseInt(reader.readLine());
			if (a > 0) {
				sum = sum + a;
			}
			System.out.println(sum);

		}

	}
}
