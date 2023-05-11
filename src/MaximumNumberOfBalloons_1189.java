public class MaximumNumberOfBalloons_1189 {
    /*
    * Given a string text, you want to use the characters of
      text to form as many instances of the word "balloon" as possible.
    * You can use each character in text at most once.
    * Return the maximum number of instances that can be formed.
    * */

    // Input: text = "loonbalxballpoon"
    //  Output: 2

    public static void main(String[] args) {
        String text = "balon";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int a = 0, b = 0, l = 0, o = 0, n = 0, res = 0;

        char[] chars = text.toCharArray();

        for (char c : chars) {
            if (c == 'a') a++;
            else if (c == 'b') b++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
            if (a >= 1 && b >= 1 && l >= 2 && o >= 2 && n >= 1) {
                res++;
                a--;
                b--;
                l = l - 2;
                n--;
                o = o - 2;
            }
        }
        return res;

    }
}
