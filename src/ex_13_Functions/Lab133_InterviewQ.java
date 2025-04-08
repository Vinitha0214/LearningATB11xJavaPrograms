package ex_13_Functions;

public class Lab133_InterviewQ {
    public static void main(String[] args) {
        // multiple main method is possible
        // only main will run, either parameter or data type should be diff


        System.out.println(main(100));
        System.out.println(main(false));
        System.out.println(main(100));
        main("vini");

    }

    public static void main(String args) {
      // remove args
    }

    public static int main(int args) {
        return 10;
    }
    public static float main(float args) {
        return 10;
    }
    public static boolean main(boolean args) {
        return true;
    }
}
