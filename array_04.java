import java.util.Scanner;
public class array_04 {
    public static void main(String[] args) {
        int[] arr = {0, 34, 23, 45, 56};
        System.out.println("enter a int value ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found=false;
        for(int i:arr) {
            if (i == n) {
                found = true;
                break;
            }
        }
        if(found){
                System.out.println("value found in the array");
        }else{
                System.out.println("value not found in the array");
            }


    }
}

