package ex_14_Strings;

public class Lab140_Interivew_P1 {
    public static void main(String[] args) {
        String s1 = "Hello"; // sCP
        String s4 = "Hello"; // SCP
        String s10 = "Hello"; // SCP

        // how many strings present in the sCP?
        // 1-> because SCP will not have duplicate value, all 3 strings points to "Hello"


        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello"); // OA
        String s5 = new String("Hello"); // OA

        // here is 3 -> because 'new' will create always new string
    }
}
