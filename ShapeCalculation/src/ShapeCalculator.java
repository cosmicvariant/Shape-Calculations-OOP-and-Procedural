import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Shape Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Select a shape (1/2/3): ");
        int choice = myScanner.nextInt();

        double area = 0.0;
        double perimeter = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Please enter the radius of the circle: ");
                double radius = myScanner.nextDouble();
                Circle circle = new Circle(radius);
                area = circle.calculateArea();
                perimeter = circle.calculatePerimeter();
                break;

            case 2:
                System.out.print("Please enter the length of the rectangle: ");
                double length = myScanner.nextDouble();
                System.out.print("Please enter the width of the rectangle: ");
                double width = myScanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                area = rectangle.calculateArea();
                perimeter = rectangle.calculatePerimeter();
                break;

            case 3:
                System.out.print("Please enter the length of side A: ");
                double sideA = myScanner.nextDouble();
                System.out.print("Please enter the length of side B: ");
                double sideB = myScanner.nextDouble();
                System.out.print("Please enter the length of side C: ");
                double sideC = myScanner.nextDouble();
                Triangle triangle = new Triangle(sideA, sideB, sideC);
                area = triangle.calculateArea();
                perimeter = triangle.calculatePerimeter();
                break;

            default:
                System.out.println("Invalid choice.");
                myScanner.close();
                System.exit(1);
        }

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        myScanner.close();
    }
}