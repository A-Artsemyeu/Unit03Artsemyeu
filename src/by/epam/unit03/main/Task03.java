package by.epam.unit03.main;

public class Task03 {
	public static void main(String[] args) {
		int summa = 0;
		int result = 1;
		
		for(int i = 1; i <= 10; i++) {
			summa = summa + i;
			result = result * summa;
		}
		System.out.println("Result is " + result);
	}
}
