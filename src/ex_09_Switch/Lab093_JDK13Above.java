package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        // in JDK > 13 - this one line switch statement is allowed
        int itemcode = 001;
        switch (itemcode) {
            case 001 -> System.out.println("001"); // no break statement required
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
