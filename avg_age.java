public class avg_age {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        int sum=0,avg=0;
        int length=ages.length;
        for(int i:ages){
            sum=sum+i;
        }
         avg=sum/length;
        System.out.println(avg);
    }
}
