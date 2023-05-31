import java.util.Arrays;

public class ShortestDistanceToACharacter_821 {

    public static void main(String[] args) {
//        Input: s = "loveleetcode", c = "e"
//        Output: [3,2,1,0,1,0,0,1,2,2,1,0]

        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));

//        Input: s = "aaab", c = "b"
//        Output: [3,2,1,0]

        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));


    }

    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int temp = Integer.MIN_VALUE / 2;

        for (int i = 0; i < res.length; i++) {
            if (s.charAt(i) == c) temp = i;
            res[i] = i - temp;
        }

        for (int i = res.length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) temp = i;
            res[i] = Math.min(res[i], Math.abs(i - temp));
        }

        return res;

    }
}
