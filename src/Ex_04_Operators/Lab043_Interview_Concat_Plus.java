package Ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Vinitha";
        String last_name = "Shanmugavelayutham";

        int a =10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        //VinithaShanmugavelayutham1010 - first operator is string, so it consider remining as a string, no addition will happen)
        System.out.println(a + b + first_name + last_name);
        //20VinithaShanmugavelayutham - first consider this as a arithmetic operation and, string don't have any arithmetic operations, so it will concat the words
        System.out.println(first_name + last_name + (a + b));
        //VinithaShanmugavelayutham20 - for arithmetic operations, use bracket
        // BODMAS - Bracket of Div, Mul, Add, Sub
    }
}
