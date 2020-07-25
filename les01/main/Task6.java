package by.htp.les01.main;



public class Task6 {
	public static void main (String [] args) {
		int angle1 = 20;
		int angle2=70;
		
		
		if((angle1+angle2)<180&&(angle1+angle2)!=90) {
			System.out.println("Треугольник существует");
		}
		else if((angle1+angle2)==90) {
			System.out.println("Треугольник прямоугольный");
			
		}
		else {
			System.out.println("Треугольник не существует");
		}
	}

}
