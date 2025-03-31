package ex_09_Switch;

public class Lab095_Interview {
    public static void main(String[] args) {
        int a = 11;
        switch (-1) {
            default:
                System.out.println("Default");
                break;
            case -1: // it will print 10, because switch -1 match with case -1
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
        }
    }
}
