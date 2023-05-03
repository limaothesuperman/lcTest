import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle_118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate1(5));

    }

    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new LinkedList<>();

        if(numRows == 0) return res;
        List<Integer> first_row = new LinkedList<>();
        first_row.add(1);
        res.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> pre_row = res.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(pre_row.get(j - 1) + pre_row.get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }





    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new LinkedList<>();

            for (int j = 0; j <= i; j++) {
                if (j > 0 && res.get(i - 1).size() - 1 >= j) {
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                } else {
                    list.add(1);
                }
            }
            res.add(list);
        }

        return res;

    }

}
