package by.epam.unit03.main;

public class Task02 {
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;

		while (a < 100) {
			if (a % 2 == 1) {
				sum = sum + a;
			}
			a++;
		}
		System.out.println ("Summa is " + sum);
	}
}
