package ex_09_Switch;

import java.util.Scanner;

public class Lab086_SwitchWithoutDefault {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
                //without default, code executed without output, it will come out of the loop
            // it will not throw any error
        }
    }
}
