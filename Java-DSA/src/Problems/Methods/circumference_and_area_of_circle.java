package Problems.Methods;

import java.util.Scanner;

public class circumference_and_area_of_circle {
    public static double circumference(double radius) {
        return 2*3.14159265*radius;
    }
    public static double area(double radius) {
        return 3.14159265*(radius*radius);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();
        double val_circumference = circumference(radius);
        double val_area = area(radius);
        System.out.println("The area of a circle is " + val_area);
        System.out.println("The circumference of a circle is " + val_circumference);
    }
}
