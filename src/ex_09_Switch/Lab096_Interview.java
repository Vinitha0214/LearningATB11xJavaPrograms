package ex_09_Switch;

public class Lab096_Interview {
    public static void main(String[] args) {
        char code = 'C';
        switch (code) {
            default: // it will print hello as it not match with 'C'
                System.out.println("Helloooo");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }

    }
}
