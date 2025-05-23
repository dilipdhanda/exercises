package b;

public class MultidimensionalArray {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        System.out.println(a.length);
        System.out.println(a[1].length);
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
    }
}
