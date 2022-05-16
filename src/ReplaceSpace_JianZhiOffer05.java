public class ReplaceSpace_JianZhiOffer05 {

    public static void testCase() {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(StringBuffer s) {
//        Input：s = "We are happy."
//        Output："We%20are%20happy."
        if (s == null || s.length() == 0)
            return null;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                s.append("%20");
            else
                temp.append(s.charAt(i));
        }
        return temp.toString();

    }

    public static String replaceSpace(String s) {
        if (s == null || s.length() == 0)
            return s;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                temp.append("  ");
        }
        if (temp.length() == 0)
            return s;
        int left = s.length() - 1;
        s += temp.toString();
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            } else {
                chars[right] = chars[left];
            }
            left--;
            right--;

        }
        return new String(chars);

    }
}
