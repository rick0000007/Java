public class array_01 {
    public static void main(String[] args) {
        int []marks={23,34,54,65,76};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println( );
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("using for each loop:");
        for(int x:marks){
            System.out.println(x);
        }
    }

}
