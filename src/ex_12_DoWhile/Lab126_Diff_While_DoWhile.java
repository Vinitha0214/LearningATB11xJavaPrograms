package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;
//        while (a < 0) { // when the condition is true, then only it enters into the block
//            System.out.println(a);
//            a++;
//        }
        do {
            System.out.println(a);// first print the block of code once
            // and then check condition
            a++;
        } while (a < 0);
    }
}
