package Tasks;

public class Task004_CLI1 {
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);
        System.out.println("Name :" +name+ "\n" + "Age :" +age+ "\n" + "Salary :" +salary);

    }
}
