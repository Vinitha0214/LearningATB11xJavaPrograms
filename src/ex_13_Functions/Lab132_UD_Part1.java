package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        // User Defined Functions
        // 1. Without Parameters and without Return Type - Void
        // 2. Without Parameters but with Return Type
        // 3. With Parameters and without Return Type - 90% will use this
        // 4. With Parameters and with Return Type


        //1. Without Parameters and without Return Type - Void
        wp_wr_greet();

        //2. Without Parameters but with Return Type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3. With Parameters and without Return Type - 90% will use this
        greet_with_details("Vinitha", 50, 100);
        greet_with_details("Karthi", 52, 120);

        greet_with_full_name("Vinitha", "Shanmugavelayutham");

//        4. With Parameters and with Return Type
             int r1 = sum_of_two_numbers(3, 4);
             int r2 = sum_of_two_numbers(5, 10);
             int r3 = sum_of_two_numbers(1505, 84626);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }




   // 1. Without Parameters and without Return Type - Void
    static void wp_wr_greet() {
        System.out.println("Hi, How are you?");
    }

    //2. Without Parameters but with Return Type

    static String greet_with_hello_wp_with_RT() {
        System.out.println("Hi");
        return "Hi, How are you!";

    }
//3. With Parameters and without Return Type - 90% will use this
static void greet_with_details(String Name, int Age, double Salary) {
    System.out.println("Your name is -> " +Name + "\nYour age is -> " + Age + "\nYour Salary is -> " + Salary);

    }
    static void greet_with_full_name (String FirstName, String LastName){
        System.out.println("Your full name is " +FirstName + LastName);
    }
//4. With Parameters and with Return Type
static int sum_of_two_numbers ( int a , int b) {
        return a + b;
}
}
