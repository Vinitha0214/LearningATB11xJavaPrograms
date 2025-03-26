package ex_06_Ternary_Operator;

public class Lab068_Real_Age_classification {
    public static void main(String[] args) {
        // age = 23.  Adult -> (Age > 18), Minor -> (Age < 18), Senior (age > 65)

        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Minor" : ((age < 65) ? "Adult" : "Senior" );
        System.out.println(result);

    }
}
