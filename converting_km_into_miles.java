import java.sql.SQLOutput;
import java.util.*;
public class converting_km_into_miles {
    public static void main(String[] args) {
        System.out.println("Enter km for converting into miles:");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        float b=a*(0.621f);
        System.out.println(a +"km is " +b +" miles");
    }
}
