public class MaximumNumberOfVowelsInASubstringOfGivenLength_1456 {
    public static void main(String[] args) {

        String s = "aeiotttttttaaaaa";
        int t = 5;
        System.out.println(maxVowels(s, t));

    }

    public static int maxVowels(String s, int k) {
        int temp = 0;
        int res = 0;
        for (int i = 0; i < k; i++) {
            if (checkVowels(s.charAt(i))) {
                temp++;
            }
        }
        res = temp;
        for (int i = k; i < s.length(); i++) {
            if (checkVowels(s.charAt(i - k))) {
                temp--;
            }
            if (checkVowels(s.charAt(i))) {
                temp++;
            }
            res = Math.max(res, temp);
        }
        return res;
    }

    public static boolean checkVowels(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
