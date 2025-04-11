package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth_EdgeCases {
    public static void main(String[] args) {
        // create a Function of Sum, Sub, Mul and Div
        // with parameter a, b (take the parameter from the user)


        // Logic building
        // Step 1 -> Inputs and Outputs
        // a , b - int -> Scanner
        // int -> Variable result


        // Step 2 -> Rough logic -> create functions
        // Function -> type 4 -> with return and with arguments / parameters

        // Step 3 : Write the code and Find and Fix -> Edge cases



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter the int only!");
            System.exit(0); // it will exit the program
        }


        System.out.println("Enter the num2");
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter the int only!");
            System.exit(0); // it will exit the program
        }



int result_sum = sum(a,b);
int result_sub = sub(a,b);
int result_div = div(a,b);
int result_mul = mul(a,b);
int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_div);
        System.out.println(result_mul);
        System.out.println(result_mod);


    }

    static int sum(int a , int b) {
        return a + b;
    }

    static int sub(int a , int b) {
        return a - b;
    }

    static int div(int a , int b) {
        if (b == 0) {
            System.out.println("Div by zero is not allowed");
            System.exit(0);
        }
        return a / b;
    }

    static int mul(int a , int b) {
        return a * b;
    }

    static int mod(int a , int b) {
        return a % b;
    }
}
// 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