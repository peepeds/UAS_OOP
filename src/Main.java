import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> isColor = new ArrayList<>();
        ArrayList<Double> notColor = new ArrayList<>();
        int menu, inputMenu, colored;

        do {
            placeholder();
            menu = getIntInput(input);

            if (menu == 1) {
                inputMenu();
                inputMenu = getIntInput(input);

                do {
                    if (inputMenu >= 1 && inputMenu <= 4) {
                        double width, height;

                        do {
                            coloring();
                            colored = getIntInput(input);
                        } while (colored != 1 && colored != 2);

                        switch (inputMenu) {
                            case 1:
                                System.out.print("Input The Radius of Circle : ");
                                double radius = getDoubleInput(input);
                                Circle circle = new Circle(radius, colored);
                                (colored == 1 ? isColor : notColor).add(circle.area);
                                break;
                            case 2:
                                System.out.print("Input The Width of Triangle : ");
                                width = getDoubleInput(input);
                                System.out.print("Input The Height of Triangle : ");
                                height = getDoubleInput(input);
                                Triangle triangle = new Triangle(height, width, colored);
                                (colored == 1 ? isColor : notColor).add(triangle.area);
                                break;
                            case 3:
                                System.out.print("Input The Upper Width of Trapezoid : ");
                                double upperWidth = getDoubleInput(input);
                                System.out.print("Input The Lower Width of Trapezoid : ");
                                double lowerWidth = getDoubleInput(input);
                                System.out.print("Input The Height of Trapezoid : ");
                                double trapHeight = getDoubleInput(input);
                                Trapezoid trapezoid = new Trapezoid(upperWidth, lowerWidth, trapHeight, colored);
                                (colored == 1 ? isColor : notColor).add(trapezoid.area);
                                break;
                            case 4:
                                System.out.print("Input The Width of Square : ");
                                width = getDoubleInput(input);
                                System.out.print("Input The Height of Square : ");
                                height = getDoubleInput(input);
                                Square square = new Square(width, height, colored);
                                (colored == 1 ? isColor : notColor).add(square.area);
                                break;
                        }
                    } else {
                        System.out.println("Invalid input. Try Again!");
                    }
                    inputMenu = 0 ;
                } while (inputMenu != 0);

            } else if (menu == 2) {
                Geometry.calculateTotalArea(isColor, notColor);
            } else if (menu == 3) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid input. Try Again!");
            }

        } while (true);
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

    private static int getIntInput(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input from the buffer
            }
        }
        return input;
    }

    private static double getDoubleInput(Scanner scanner) {
        double input;
        while (true) {
            try {
                input = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input from the buffer
            }
        }
        return input;
    }
}
