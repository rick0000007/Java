import java.sql.SQLOutput;

public class lstring {
    public static void main(String[] args) {
//        String name ="SaagNik";
//        int value=name.length();
//        System.out.println(value);
//        String a=name.toLowerCase();
//        System.out.println(a);
//        String b= name.toUpperCase();
//        System.out.println(b);
//        String c="     saagnik    ";
//        System.out.println(c);
//        System.out.println(c.trim());
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(2,5));
//        System.out.println(name.replace('a','r'));
//        System.out.println(c.replace(' ','-'));
//        System.out.println(c.toUpperCase());
        String letter="Dear <|name|>, thanks a lot!";
        letter =letter.replace("<|name>|","Rick");
        System.out.println(letter);
    }
}
