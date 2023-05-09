import java.util.Objects;
import java.util.Stack;

public class BaseballGame_682 {
    /*
    Input: ops = ["5","2","C","D","+"]
    Output: 30
    Explanation:
    "5" - Add 5 to the record, record is now [5].
    "2" - Add 2 to the record, record is now [5, 2].
    "C" - Invalidate and remove the previous score, record is now [5].
    "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
    "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
    The total sum is 5 + 10 + 15 = 30.
    */
    // ["5","2","C","D","+"]
    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations));

        /*
        Input: ops = ["5","-2","4","C","D","9","+","+"]
        Output: 27
        Explanation:
        "5" - Add 5 to the record, record is now [5].
        "-2" - Add -2 to the record, record is now [5, -2].
        "4" - Add 4 to the record, record is now [5, -2, 4].
        "C" - Invalidate and remove the previous score, record is now [5, -2].
        "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
        "9" - Add 9 to the record, record is now [5, -2, -4, 9].
        "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
        "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
        The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
        */

        String[] operations1 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(calPoints(operations1));

        String[] operations2 = {"1", "C"};
        System.out.println(calPoints(operations2));


    }

    public static int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (String str : operations) {
            if (isNumeric(str)) stack.add(Integer.parseInt(str));
            else if (Objects.equals(str, "C")) stack.pop();
            else if (Objects.equals(str, "D")) {
                int temp = stack.pop();
                int temp1 = temp * 2;
                stack.add(temp);
                stack.add(temp1);
            } else if (Objects.equals(str, "+")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                int temp3 = temp1 + temp2;
                stack.add(temp2);
                stack.add(temp1);
                stack.add(temp3);
            } else {
                continue;
            }
        }
        for (int num : stack) {
            res += num;
        }
        return res;
    }

    public static boolean isNumeric(String s) {
        if (s == null) return false;
        try {
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
