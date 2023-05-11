import java.util.*;

public class WordPattern_290 {
    /*
      Example 1:
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true
      Example 2:
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false
    */
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";

        System.out.println(wordPattern(pattern, s));


    }

    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] chars = pattern.toCharArray();
        Set<String> tempSet = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        if (str.length != chars.length) return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                sb.append(map.get(chars[i]));
            } else {
                map.put(chars[i], str[i]);
                tempSet.add(str[i]);
                sb.append(str[i]);
            }
        }
        if (tempSet.size() < map.entrySet().size()) return false;

        return sb.toString().equals(s.replace(" ", ""));
    }
}