package Tasks;

public class Task002_In_De_Operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A -> ++a -> ExpA -> 11, a =  11
        // B -> a++ -> ExpB -> 11, a = 12
        // C -> a++ -> EXPc -> 12, a = 13
        // A + B + C = 11 + 11 + 12 = 34
        // a -> 13


    }
}
