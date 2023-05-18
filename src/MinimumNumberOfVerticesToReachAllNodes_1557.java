import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes_1557 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(0, 1);
        List<Integer> list2 = Arrays.asList(0, 2);
        List<Integer> list3 = Arrays.asList(2, 5);
        List<Integer> list4 = Arrays.asList(3, 4);
        List<Integer> list5 = Arrays.asList(4, 2);


        List<List<Integer>> edges = Arrays.asList(list1, list2, list3, list4, list5);
        System.out.println(findSmallestSetOfVertices(6, edges));
    }

    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> des = new HashSet<>();

        for (List<Integer> list : edges) {
            des.add(list.get(1));
        }

        for (int i = 0; i < n; i++) {
            if (!des.contains(i)) res.add(i);
        }
        return res;
    }
}
