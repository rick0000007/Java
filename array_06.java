public class array_06 {
    public static void main(String[] args) {
        int[][] arr1 = {{4, 5, 6},
                {8, 9, 10}};
        int[][] arr2 = {{11, 12, 13},
                {14, 115, 16}};
        int[][] result = new int[2][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    System.out.print(result[i][j] + " ");

                }
                System.out.println("");
            }
        }


    }

