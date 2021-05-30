package by.epam.unit03.main;

public class Task06 {
	public static void main(String[] args) {

		int numberFirst, numberSecond, number;

		int a = 1657093;
		int b = 2835891;

		for (int i = a; i > 0; i = i / 10) {
			numberFirst = i % 10;
			for (int j = b; j > 0; j = j / 10) {
				numberSecond = j % 10;
				if (numberFirst == numberSecond) {
					number = numberFirst;
					System.out.println("Some numbers are: " + number);
				}
			}
		}
	}
}
