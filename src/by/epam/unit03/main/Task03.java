package by.epam.unit03.main;

public class Task03 {
	public static void main(String[] args) {
		int number = 0;
		double result = 1;
		int j = 10;
		
		for(int i = 1; i <= j; i++) {
			number = number + i;
			result = result * number;
		}
		System.out.println("Result is: " + result);
	}
}
