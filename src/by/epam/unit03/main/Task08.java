package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double x, y, z;
		char operationOfSign;
		
		while (true) {

		System.out.print("Пожалуйста введите операнд X: ");
		while(!scanner.hasNextDouble()){
			scanner.next();
			System.out.println("Вы ввели не число.");
			System.out.print("Пожалуйста введите операнд X: ");
			}
		x = scanner.nextDouble();
		
		System.out.print("Пожалуйста введите операнд Y: ");
		while(!scanner.hasNextDouble()){
			scanner.next();
			System.out.println("Вы ввели не число.");
			System.out.print("Пожалуйста введите операнд Y: ");
			}
		y = scanner.nextDouble();
		
		System.out.print("Введите знак операции (+, –, /, *): ");

		operationOfSign = scanner.next().charAt(0);
		
		switch (operationOfSign){
		
		case '+':
			z = x + y;
			System.out.println("z = "+ z);
			break;
		case '-':   
			z = x - y;
			System.out.println("z = "+ z);
			break;
		case '*':
			z = x * y;
			System.out.println("z = "+ z);
			break;
		case '/':
			if (y == 0) {
				System.out.println("Деление на ноль недопустимо. Повторите ввод.");
				break;
			} else {
			z = x / y;
			System.out.println("z = "+ z);
			}
			break;
		default:
            System.out.println("Вы ввели не (+, –, /, *). Повторите ввод.");
            continue;            
		}	
		System.out.print("Введите # для выхода из программы либо Enter для продолжения: ");	
		if (scanner.hasNextLine()) {
			scanner.nextLine();
			if (scanner.nextLine().equals("#")) {
				break;
				}
		}else if (scanner.nextLine().equals ("")) {
			continue;
			}
		}
		scanner.close();
	} 
}