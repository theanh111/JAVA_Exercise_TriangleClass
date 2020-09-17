import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Triangle's first side: ");
        double side1 = input.nextDouble();
        System.out.println("Input Triangle's second side: ");
        double side2 = input.nextDouble();
        System.out.println("Input Triangle's third side: ");
        double side3 = input.nextDouble();

        System.out.println("Input Triangle's color: ");
        input.nextLine();
        String color = input.nextLine();

        Shape shape = new Shape();
        shape.setColor(color);

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}
