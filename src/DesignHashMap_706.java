import java.util.Arrays;

public class DesignHashMap_706 {

    public static void main(String[] args) {
        DesignHashMap_706 myMap = new DesignHashMap_706();
        myMap.put(1, 2);
        myMap.put(2, 4);
        myMap.put(3, 4);
        myMap.put(4, 4);
        myMap.put(5, 4);

        System.out.println((myMap).toString());
    }

    int[] data;

    public DesignHashMap_706() {
        data = new int[1000001];
        Arrays.fill(data, -1);

    }

    public void put(int key, int value) {
        data[key] = value;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i : this.data) {
            if (i != -1) {
                str.append(i).append(" ");
            }
        }
        return str.toString();
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */