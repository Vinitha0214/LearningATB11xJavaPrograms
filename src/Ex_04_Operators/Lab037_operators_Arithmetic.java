package Ex_04_Operators;

public class Lab037_operators_Arithmetic {
    public static void main(String[] args) {
        // Arithmetic operators
        //  + (Addition)
        //  - (Subtraction)
        //  * (Multiplication)
        //  / (Division)
        //  % (Modulus) - Reminder

        int a = 20;
        int b = 3;
        float c = 3f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // int gives only 6
        System.out.println(a%b);
        System.out.println(a/c); // float only gives 6.6666665
    }
}
