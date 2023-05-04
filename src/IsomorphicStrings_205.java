import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        String s = "leet";
        String t = "code";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        boolean flag1 = true;
        boolean flag2 = true;


        for (int i = 0; i < s.length(); i++) {
            if (mapST.containsKey(s.charAt(i))) {
                if (mapST.get(s.charAt(i)) != t.charAt(i)) {
                    flag1 = false;
                }
            } else {
                mapST.put(s.charAt(i), t.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (mapTS.containsKey(t.charAt(i))) {
                if (mapTS.get(t.charAt(i)) != s.charAt(i)) {
                    flag2 = false;
                }
            } else {
                mapTS.put(t.charAt(i), s.charAt(i));
            }
        }

        return flag1 && flag2;

    }


}
