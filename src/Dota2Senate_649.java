import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate_649 {
    public static void main(String[] args) {
        String senate = "RDDDRRRRDDRDRDRDRD";
        String res = new Dota2Senate_649().predictPartyVictory(senate);
        System.out.println(res);
    }


    public String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue<Integer> que_r = new LinkedList<>();
        Queue<Integer> que_d = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                que_r.add(i);
            } else {
                que_d.add(i);
            }
        }

        while (!que_r.isEmpty() && !que_d.isEmpty()) {
            int rTemp = que_r.poll();
            int dTemp = que_d.poll();

            if (rTemp < dTemp) {
                que_r.add(rTemp + n);
            } else {
                que_d.add(dTemp + n);
            }
        }
        if (que_r.isEmpty()) return "Dire";
        else return "Radiant";

    }

}
