package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length()); // length starts from 1
        //5

        System.out.println(name.charAt(3));// it starts from index zero
        //a
       // System.out.println(name.charAt(10));// StringIndexOutOfBoundsException

        System.out.println(name.concat(" Patel"));

        System.out.println(name.contains("om")); // search the words in the String
        //false

        System.out.println(name.equalsIgnoreCase("sonal"));
        // true -> ignore the case-sensitive

        System.out.println(name.indexOf('o'));// return the index value of 'o'
        //1

        String s1 = "madam";
        System.out.println(s1.indexOf('m'));// it picks first index zero
        // 0

        // replace ( , )
        System.out.println(name.replace('n', 'N'));
        //small n replace with capital N
        // soNal

        //split
        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]); // pramod
        System.out.println(split[1]); // live.com
        System.out.println(split[2]); // 123

        //Substring
        System.out.println(name.substring(1, 3));
        // on -> sonal it will take from index 1 and minus one from the end index

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.startsWith("S"));
        // true

        System.out.println(name.endsWith("a"));
        //false

        String name3 = "        Sonal Harish      ";
        System.out.println(name3.trim()); // remove the extra spaces
        // Sonal Harish will print without extra spaces

        String name5 = "Sonal";

        System.out.println(name5.compareTo("Sonal"));
        // 0 - same like equal function, but it will give integer value
        // 0 represents false
        //1 represent true

        System.out.println(name5.compareToIgnoreCase("SONAL"));
        // 1

        String anotherPalindrome = "Niagara. O roar again";
        String roar = anotherPalindrome.substring(11, 15);// roar -> 11 to 14
        System.out.println(roar);

        //concat
        String s11 = "Pramod";
        String s22 = s11.concat("Dutta");
        System.out.println(s22);


        // concatenation using (+) operator
        String s111 = "Hello";
        String s222 = "World";
        String s333 = "Ji";
        String result = s111 + s222 + s333;
        System.out.println(result);

        // last indexof
        String n = "Pramoddutta";
        System.out.println(n.indexOf('d')); // 5
        System.out.println(n.lastIndexOf('d')); // 6
        System.out.println(n.indexOf('s')); // -1
        // -1-> found nothing.  if there is no 's'



    }
}
