import java.util.*;

public class GroupAnagram_49 {
    public static void main(String[] args) {
        System.out.println(new GroupAnagram_49().groupAnagrams((new String[] {"ate","eat","a","bac","abc"})));
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list);

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<String>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
