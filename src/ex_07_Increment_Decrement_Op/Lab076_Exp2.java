package ex_07_Increment_Decrement_Op;

public class Lab076_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A + B
        // A -> ++a -> ExpA = 11, a = 11
        // +
        // B -> ++a -> ExpB = 12 , a = 12
        // A + B -> ExpA+ExpB - > 11 + 12 -> 23
        // a -> 12
    }
}
