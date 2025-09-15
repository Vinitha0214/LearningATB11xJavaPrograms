package ex_14_Strings;

public class Lab148_SBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        // number starts from 1, it delete after Java everything
        sb.delete(5, 16); // delete the substring
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);// it replace java with C++
    }
}
