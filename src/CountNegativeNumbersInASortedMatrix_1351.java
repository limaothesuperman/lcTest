public class CountNegativeNumbersInASortedMatrix_1351 {


    // O(m * n)
    public int countNegatives1(int[][] grid) {
        int count = 0;
        for (int[] rows : grid) {
            for (int num : rows) {
                if (num < 0) count++;
            }
        }
        return count;

    }

    // O(m + n)
    public int countNegatives2(int[][] grid) {
        int i = grid.length - 1;
        int j = 0;
        int res = 0;

        // int row = grid.length - 1;
        int column = grid[0].length;

        while (i >= 0 && j < column) {
            if (grid[i][j] < 0) {
                res = res + column - j;
                i--;
            } else {
                j++;
            }
        }
        return res;
    }
}
