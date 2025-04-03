package ex_10_For_Loop;

public class Lab112_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue; // skip the below code and move to top
            }// it will skip 5 and print all numbers
            System.out.println(i);
        }
    }
}
