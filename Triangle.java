import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

            if ((a + b > c) && (a + c > b) && (b + c > a)) {
            
            
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println("It is also a Right-Angled triangle.");
            }
        } else {
            System.out.println("The sides entered do not form a valid triangle.");
        }

        scanner.close();
    }
}
