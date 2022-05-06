import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void testCase() {
        int[][] matrix1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix2 = SpiralMatrixII.generateMatrix1(4);
        System.out.println(spiralOrder(matrix1));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int n = matrix[0].length;
        int m = matrix.length;
        int count = 0;
        int rowBegin = 0;
        int rowEnd = m - 1;
        int columnBegin = 0;
        int columnEnd = n - 1;

        while (count < n * m) {
            if (count < n * m) {
                for (int i = columnBegin; i <= columnEnd; i++) {
                    ans.add(matrix[rowBegin][i]);
                    count++;
                }
                rowBegin++;
            }
            if (count < n * m) {
                for (int i = rowBegin; i <= rowEnd; i++) {
                    ans.add(matrix[i][columnEnd]);
                    count++;
                }
                columnEnd--;
            }
            if (count < n * m) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    ans.add(matrix[rowEnd][i]);
                    count++;
                }
                rowEnd--;
            }
            if (count < n * m) {


                for (int i = rowEnd; i > columnBegin; i--) {
                    ans.add(matrix[i][columnBegin]);
                    count++;
                }
                columnBegin++;
            }

        }


        return ans;
    }


}
