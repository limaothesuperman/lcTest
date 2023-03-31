public class ValidPalindrome_125 {

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome_125().isPalindrome("ASDSS"));
        System.out.println(new ValidPalindrome_125().isPalindrome("asa"));
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);
            if (!Character.isLetterOrDigit(currStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(currEnd)) {
                end--;
            } else {
                if (currStart != currEnd) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;


    }

}
