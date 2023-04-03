public class ValidPalindromeII_680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abcaa"));
    }
    //solution 1
    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        int count = 0;
        char[] chars = s.toCharArray();

        while (start < end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
                continue;
            } else if (chars[start] != chars[end]) {
                int newStart = start + 1;
                int newEnd = end - 1;
                if (checkPalindrome(chars, newStart, end) || checkPalindrome(chars, start, newEnd)) {
                    return true;
                } else return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(char[] cs, int start, int end) {
        while (start < end) {
            if (cs[start] == cs[end]) {
                start++;
                end--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
