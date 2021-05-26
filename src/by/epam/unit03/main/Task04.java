package by.epam.unit03.main;

public class Task04 {
    public static void main(String[] args) {
        double y;

        System.out.println("---------------------------------");
        System.out.printf("|\t%3s\t|\t%3s\t|\n", "x", "y");
        System.out.println("---------------------------------");
        for (double x = -5; x <= 5; x += 0.5) {
            y = 5 - Math.pow(x, 2) / 2;
            System.out.printf("|\t%2.1f\t|\t%4.3f\t|\n", x, y);
        }
        System.out.println("---------------------------------");
    }
}