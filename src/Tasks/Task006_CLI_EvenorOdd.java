package Tasks;

public class Task006_CLI_EvenorOdd {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(number%2==0 ? "number is Even" : "Number is odd");

    }
}
