import java.sql.SQLOutput;
import java.util.Scanner;
public class checking_website {
    public static void main(String[] args) {
        System.out.println("Enter a name of website in full from");
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if (website.endsWith(".org")){
            System.out.println("It is a organisation website");
        } else if (website.endsWith(".com")) {
            System.out.println("It is a commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("It is a indian website");
        }
    }
}
