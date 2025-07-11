import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
//        System.out.print("enter a value:");
//        Scanner sc=new Scanner (System.in);
//        int n= sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d=%d\n",n,i,n*i);
//        }
        System.out.print("enter a value:");
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.printf("%d X %d=%d\n",n,i,n*i);
        }

    }
}
