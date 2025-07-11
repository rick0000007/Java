import java.sql.SQLOutput;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter a valid year");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%4==0){
            if(a%100!=0 || a%400==0){
                System.out.println("this is leap year");
            }
            else{
                System.out.println("this is not a leap year");
            }
        }
    }
}
