package Tasks;

import java.util.Scanner;

public class Task007_Triangle_class_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side of triangle");
        int t1 = scanner.nextInt();
        System.out.println("Enter second side of triangle");
        int t2 = scanner.nextInt();
        System.out.println("Enter third side of triangle");
        int t3 = scanner.nextInt();

        if (t1 == t2 && t2 == t3) {
            System.out.println("This is an equilateral triangle as all the sides are equal!");
        }else if (t1 == t2 || t2 == t3 || t3 == t1)
        {
            System.out.println("This is an isosceles triangle, exactly two sides are equal");
        }else {
            System.out.println("This is an scalene triangle, no sides are equal");
        }

    }
}
