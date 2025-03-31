package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = scanner.next();

        switch (browser) {
            case "chrome" : // (chrome is case-sensitive)
                System.out.println("Starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox" :
                System.out.println("Starting the firefox");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge" :
                System.out.println("Starting the edge");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no idea which browser it is");
                break;
        }

    }
}
