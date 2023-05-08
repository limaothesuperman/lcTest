public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(diagonalSum(mat));

    }


    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            res += mat[i][i];
            res += mat[i][n - i - 1];
        }
        if (n % 2 != 0) {
            return res - mat[n / 2][n / 2];
        }
        return res;

    }
}

