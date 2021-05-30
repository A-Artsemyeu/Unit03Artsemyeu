package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter one of a romans number:");
		String symbol = scanner.nextLine();
		
		switch (symbol) {
        case  ("I"):
        	symbol = "1";
            break;
		case ("II"):
			symbol = "2";
			break;
		case ("III"):
			symbol = "3";
			break;
		case ("IV"):
			symbol = "4";
			break;
		case ("V"):
			symbol = "5";
			break;
		case ("VI"):
			symbol = "6";
			break;
		case ("VII"):
			symbol = "7";
			break;
		case ("VIII"):
			symbol = "8";
			break;
		case ("IX"):
			symbol = "9";
			break;
		case ("X"):
			symbol = "10";
			break;
		case ("XI"):
			symbol = "11";
			break;
		case ("XL"):
			symbol = "40";
			break;
		case ("L"):
			symbol = "50";
			break;
		case ("C"):
			symbol = "100";
			break;
		case ("D"):
			symbol = "500";
			break;
		case ("M"):
			symbol = "1000";
			break;
		
		default:
			System.out.println("Please, enter a valid romans number.");
		}
		System.out.println("" + symbol);
	}
}
