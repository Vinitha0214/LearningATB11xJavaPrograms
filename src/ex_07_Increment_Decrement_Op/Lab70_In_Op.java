package ex_07_Increment_Decrement_Op;

public class Lab70_In_Op {
    public static void main(String[] args) {
        //Pre increment -> ++operand (++a), value is incremented first and then stored
        //Value will be increased by 1

        int a = 10;
        int b = ++a;
        System.out.println(b); // 10 +1 = 11
        System.out.println(a); // a is also 11

        // Expression and Result table
        //Line No | a | Result b
        // 8 | 10 | NA
        // 9 | 11 | 11
        // 10 | 11(NA) | 11
        // 11 | 11 | 11(NA)

    }
}
