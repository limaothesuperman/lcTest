public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "";
        String t = "axbnmc";

        System.out.println(isSubsequence(s1, t));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] tChar = t.toCharArray();
        char[] sChar = s.toCharArray();

        int pointerT = 0;
        int pointerS = 0;
        if (s.length() < 1) {
            return true;
        }
        while (pointerT < tChar.length) {

            if (sChar[pointerS] == tChar[pointerT]) {
                pointerS++;
            }
            pointerT++;
            if (pointerS == s.length()) {
                return true;
            }
        }
        return false;
    }
}
