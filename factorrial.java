
import java.util.Scanner;
public class factorrial {
    public static void main(String[] args) {
        System.out.print("enter a number :");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
         int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
