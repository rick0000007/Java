public class array_05 {
    public static void main(String[] args) {
        int []arr={78,34,65,76,46,76,56};
        int sum=0;
        float avg=1;
        for(int x:arr){
        sum=sum+x;
        avg=sum/arr.length;
        }

        System.out.println(sum);
        System.out.println(avg);
    }

}
