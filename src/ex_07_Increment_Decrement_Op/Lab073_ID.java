package ex_07_Increment_Decrement_Op;

public class Lab073_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++; // first we are assigning so result value is 10 and then a value is increased so a is 11 here
        System.out.println(a); //11
        System.out.println(result);

        // Line no | a | Exp
        // 5  | 10 | NA
        // 6  | 11 | 10
        // 7  | 11 | NA
        // 8 | NA | 10
    }
}
