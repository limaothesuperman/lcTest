public class SpiralMatrixII {
    public static void testCase() {
        int[][] matrix = generateMatrix1(3);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix1(int n) {
        int[][] result = new int[n][n];
        int cnt = 1;
        for (int layer = 0; layer < (n + 1) / 2; layer++) {
            // direction 1 - traverse from left to right
            for (int ptr = layer; ptr < n - layer; ptr++) {
                result[layer][ptr] = cnt++;
            }
            // direction 2 - traverse from top to bottom
            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
                result[ptr][n - layer - 1] = cnt++;
            }
            // direction 3 - traverse from right to left
            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
                result[n - layer - 1][n - ptr - 1] = cnt++;
            }
            // direction 4 - traverse from bottom to top
            for (int ptr = layer + 1; ptr < n - layer - 1; ptr++) {
                result[n - ptr - 1][layer] = cnt++;
            }
        }
        return result;
    }

    public int[][] generateMatrix2(int n) {
        int[][] result = new int[n][n];

        int loop = n / 2;

        int offset = 1;
        int number = 1;
        int mid = n / 2;

        int x = 0;
        int y = 0;
        while (loop > 0) {
            int i = x;
            int j = y;
            for (; i < x + n - offset; i++) {
                result[x][i] = number++;
            }
            for (; j < y + n - offset; j++) {
                result[j][i] = number++;
            }
            for (; i > x; i--) {
                result[j][i] = number++;
            }
            for (; j > y; j--) {
                result[j][i] = number++;
            }

            loop = loop - 1;
            x++;
            y++;
            offset += 2;


        }
        if (n % 2 == 1)
            result[mid][mid] = number++;

        return result;
    }

}
