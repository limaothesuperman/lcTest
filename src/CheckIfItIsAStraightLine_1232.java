public class CheckIfItIsAStraightLine_1232 {
    public static void main(String[] args) {
        int[][] coordinates = {{1, 1}, {2, 2}};
        System.out.println(checkStraightLine(coordinates));

    }

    public static boolean checkStraightLine(int[][] coordinates) {

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int xTemp = coordinates[i][0];
            int yTemp = coordinates[i][1];

            if ((yTemp - y1) * (xTemp - x2) != (yTemp - y2) * (xTemp - x1)) return false;
        }
        return true;

    }
}
