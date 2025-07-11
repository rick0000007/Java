import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the first subject");
        int a=sc.nextInt();
        System.out.println("Enter the value of the second subject");
        int b=sc.nextInt();
        System.out.println("Enter the value of the third subject");
        int c=sc.nextInt();
        System.out.println("Enter the value of the forth subject");
        int d=sc.nextInt();
        System.out.println("Enter the value of the fifth subject");
        int e=sc.nextInt();
        float percentage=(a+b+c+d+e)/5.0f;
        System.out.println("the percentage of the student is "+ percentage);

    }

}
