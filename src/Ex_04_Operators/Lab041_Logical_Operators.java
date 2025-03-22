package Ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); // reverse of a which is true
        boolean b = true;
        System.out.println(!!a); // true -> false -> true

        boolean c = true || false;
        System.out.println(c);
        // And gate is only true, when both the condition are true
        // Or gate only false, when both of them are false
        // || - this condition is true
        // 0 - corresponds to false, 1 corresponds to True
    }
}
