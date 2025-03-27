package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A + B
        // A -> a++ -> ExpA = 10, a = 11
        // +
        // B -> ++a -> ExpB = 12 , a = 12
        // A + B -> ExpA+ExpB - > 22
        // a -> 12

    }
}
