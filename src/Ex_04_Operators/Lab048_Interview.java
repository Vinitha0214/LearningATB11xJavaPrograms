package Ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int karthi_Salary = 12;
        boolean b = !(karthi_Salary > 10 || karthi_Salary < 5);
        System.out.println(b);

        // A -> karthi_Salary > 10 - true
        // B -> karthi_Salary < 5 - false
        // true || false -> true
        // !b -> reverse of true is false
    }
}
