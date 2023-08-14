import java.util.Scanner;

public class Main {
    public static double calculateCircleArea(int r) {
        return 3.14 * r * r;
    }

    public static double calculateCircleLength(int r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        int r = input.nextInt();
        System.out.println("Его площадь: " + calculateCircleArea(r));
        System.out.println("Длина его окружности: " + calculateCircleLength(r));
    }

}
