package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double x, y, z;
		char operationOfSign;
		
		while (true) {

		System.out.print("������� ������� X: ");
		while(!scanner.hasNextDouble()){
			scanner.next();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ������� X: ");
			}
		x = scanner.nextDouble();
		
		System.out.print("������� ������� Y: ");
		while(!scanner.hasNextDouble()){
			scanner.next();
			System.out.println("�� ����� �� �����.");
			System.out.print("������� ������� Y: ");
			}
		y = scanner.nextDouble();
		
		System.out.print("������� ���� �������� (+, �, /, *): ");

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
				System.out.println("������� �� ���� �����������. ��������� ����.");
				break;
			} else {
			z = x / y;
			System.out.println("z = "+ z);
			}
			break;
		default:
            System.out.println("�� ����� �� (+, �, /, *). ��������� ����.");
            continue;            
		}	
		System.out.print("������� # ��� ������ �� ��������� ���� Enter ��� �����������: ");	
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