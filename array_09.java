public class array_09 {
    public static void main(String[] args) {
//        to find min value of a array
        int []arr={23,34,56,76,89,37};
        int min =Integer.MAX_VALUE ;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println(min);
    }
}
