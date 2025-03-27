package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else {
    public static void main(String[] args) {
        // how to take user input
        // 1. CLI option
        // int age = Integer.parseInt(args[0])

        // 2. Scanner class
        // Scanner scanner = new Scanner(System.in)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
       // System.out.println(age);
        if (age > 18) {
            System.out.println("you are allowed to vote");
        }else {
            System.out.println("you are not allowed to vote");
        }
    }
}
