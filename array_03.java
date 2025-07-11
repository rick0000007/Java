public class array_03 {
    public static void main(String[] args) {
        float[] arr = {34.5f, 98.78f, 39.65f, 95.99f, 34.5f};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

        }
        System.out.println(sum);
//    using for each loop
//        for (float x : arr) {
//            sum=sum+x;
//
//        }
//        System.out.println(sum);
//
    }
}

