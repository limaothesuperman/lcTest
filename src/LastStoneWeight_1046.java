import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight_1046 {

    public static void main(String[] args) {
        int[] stones = {1, 2, 3, 4, 5};
        System.out.println(new LastStoneWeight_1046().lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> temp = new PriorityQueue();
        for (int stone : stones) temp.add(-stone);
        while (temp.size() > 1) {
            int stone1 = temp.remove();
            int stone2 = temp.remove();
            if (stone1 != stone2) temp.add(stone1 - stone2);
        }
        if (temp.size() == 0) return 0;
        else return -temp.remove();

    }
}
