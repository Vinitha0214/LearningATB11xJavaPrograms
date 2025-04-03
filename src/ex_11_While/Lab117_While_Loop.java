package ex_11_While;

public class Lab117_While_Loop {
    public static void main(String[] args) {
        // since its entry controlled loop, nothing will print as an output
        // 0 > 0 fails
        int i = 0;
        while (i > 0) {
            System.out.println("Enter");
            System.out.println(i);
            i++;
        }
    }
}
