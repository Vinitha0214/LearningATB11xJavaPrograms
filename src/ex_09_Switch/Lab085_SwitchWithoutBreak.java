package ex_09_Switch;

import java.util.Scanner;

public class Lab085_SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("Thurs");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("invalid day number");
        }
    }
}
