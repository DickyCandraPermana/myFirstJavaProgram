package malas;

import java.util.Scanner;

public class LuasSegitiga {

  public static double calculateTriangleArea(double base, double height) {
    return 0.5 * base * height;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Triangle Area Calculator");
    System.out.println("------------------------");

    System.out.print("Enter the base of the triangle: ");
    double base = scanner.nextDouble();

    System.out.print("Enter the height of the triangle: ");
    double height = scanner.nextDouble();

    double area = calculateTriangleArea(base, height);

    System.out.printf("\nThe area of the triangle is: %.2f square units%n", area);

    scanner.close();
  }
}
