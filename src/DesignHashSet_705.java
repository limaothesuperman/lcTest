import java.util.ArrayList;
import java.util.List;

public class DesignHashSet_705 {
}

class MyHashSet {

    List<Integer> list;

    public MyHashSet() {
        this.list = new ArrayList<>();
    }

    public void add(int key) {
        if (!list.contains(key)) list.add(key);
    }

    public void remove(int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                list.remove(i);
            }
        }
    }

    public boolean contains(int key) {
        return list.contains(key);

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */