package ex_09_Switch;

public class Lab094_JDK13Above {
    public static void main(String[] args) {
        // JDK > 13
        int itemcode = 002;
        switch (itemcode) {
            case 001, 002, 005: // multiple case under one statement is allowed
                System.out.println("All of them are electronic gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
