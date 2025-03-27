package Tasks;

public class Task003_In_De_Operator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        // A -> --a -> ExpA = 19 , a = 19
        // B -> a++ -> ExpB = 19, a = 20
        // C -> a-- -> ExpC = 20, a = 19
        // A + B + C = 19 + 19 + 20 = 58

    }
}
