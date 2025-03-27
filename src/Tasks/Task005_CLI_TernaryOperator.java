package Tasks;

public class Task005_CLI_TernaryOperator {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println(num1 > num2 ? "num1 is maximum" +num1 : "numb2 is maximum" +num2);

        // num 1 = 10
        // num 2 = 20


    }
}
