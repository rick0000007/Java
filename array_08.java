public class array_08 {
    public static void main(String[] args) {
//        to find the maximum value of an array
        int []arr={23,34,56,76,89,37};
        int max =0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}
