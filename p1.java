import java.util.*;
public class p1 {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the marks you get in mathematics");
                int a=sc.nextInt();
                System.out.println("Enter the marks you get in physics");
                int b=sc.nextInt();
                System.out.println("Enter the marks you get in chemistry");
                int c=sc.nextInt();
                float avg=(a+b+c)/3.0f;
                if (avg<=40 && a<=33 && a<=33 &&a<=33) {
                    System.out.println("pass");

                }else {
                    System.out.println("fail");
                }
        }
    }

