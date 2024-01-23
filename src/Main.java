import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> isColor = new ArrayList<>();
        ArrayList<Double> notColor = new ArrayList<>();
        int menu, inputMenu, colored;

        do {
            placeholder();
            menu = input.nextInt();

            if (menu == 1) {
                inputMenu();
                inputMenu = input.nextInt();

                do {
                    if (inputMenu == 1) {
                        double radius;
                        do {
                            coloring();
                            colored = input.nextInt();
                        } while (colored != 1 && colored != 2);

                        System.out.print("Input The Radius of Circle : ");
                        radius = input.nextDouble();
                        Circle circle = new Circle(radius, colored);
                        (colored == 1 ? isColor : notColor).add(circle.area);

                    } else if (inputMenu == 2) {
                        double width, height;
                        do {
                            coloring();
                            colored = input.nextInt();
                        } while (colored != 1 && colored != 2);

                        System.out.print("Input The Width of Triangle : ");
                        width = input.nextDouble();
                        System.out.print("Input The Height of Triangle : ");
                        height = input.nextDouble();
                        Triangle triangle = new Triangle(height, width, colored);

                        (colored == 1 ? isColor : notColor).add(triangle.area);
                    } else if (inputMenu == 3) {
                        double upperWidth, lowerWidth, height;
                        do {
                            coloring();
                            colored = input.nextInt();
                        } while (colored != 1 && colored != 2);

                        System.out.print("Input The Upper Width of Trapezoid : ");
                        upperWidth = input.nextDouble();
                        System.out.print("Input The Lower Width of Trapezoid : ");
                        lowerWidth = input.nextDouble();
                        System.out.print("Input The Height of Trapezoid : ");
                        height = input.nextDouble();
                        Trapezoid trapezoid = new Trapezoid(upperWidth, lowerWidth, height, colored);

                        (colored == 1 ? isColor : notColor).add(trapezoid.area);
                    } else if (inputMenu == 4) {
                        double width, height;
                        do {
                            coloring();
                            colored = input.nextInt();
                        } while (colored != 1 && colored != 2);

                        System.out.print("Input The Width of Square : ");
                        width = input.nextDouble();
                        System.out.print("Input The Height of Square : ");
                        height = input.nextDouble();
                        Square square = new Square(width , height , colored);

                        (colored == 1 ? isColor : notColor).add(square.area);
                    } else {
                        System.out.println("Invalid input. Try Again!");
                    }

                    System.out.print("Enter 0  number to continue:");
                    inputMenu = input.nextInt();
                } while (inputMenu != 0);

            } else if (menu == 2) {
                Geometry.calculateTotalArea(isColor, notColor);
            } else if (menu == 3) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid input. Try Again!");
            }

        } while (menu >= 1 && menu <= 3);
    }
    private static void placeholder() {
        System.out.println("AREA CALCULATOR");
        System.out.println("1. Input ");
        System.out.println("2. Show  Total Area");
        System.out.println("3. Exit");
        System.out.print(">> ");
    }
    private static void inputMenu() {
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Trapezoid");
        System.out.println("4. Square");
        System.out.print(">> ");
    }
    private static void coloring() {
        System.out.println("Is it the colored Area ? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print(">> ");
    }
}
