package ex_10_For_Loop;

public class Lab108_ForLoop_3 {
    public static void main(String[] args) {
        for (int i = 0; i > 10 ; i++){
            System.out.println(i);
            // it will not print anything, condition is failed
            // for loop condition should pass, if not it will come out the loop
        }
        for (int j = -1; j < -10; j++) {
            System.out.println(j); // -1 < -10 is failed
        }
    }
}
