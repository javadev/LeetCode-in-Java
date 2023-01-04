package g0901_1000.s0990_satisfiability_of_equality_equations;

// #Medium #Array #String #Graph #Union_Find #2022_03_31_Time_5_ms_(24.79%)_Space_43.5_MB_(18.67%)

import java.util.HashMap;

public class Solution {
    private int[] par;

    public boolean equationsPossible(String[] equations) {
        int counter = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (String str : equations) {
            char ch = str.charAt(0);
            if (!map.containsKey(ch)) {
                map.put(ch, counter);
                counter++;
            }
            ch = str.charAt(3);
            if (!map.containsKey(ch)) {
                map.put(ch, counter);
                counter++;
            }
        }
        par = new int[counter];
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
        for (String str : equations) {
            String oper = str.substring(1, 3);
            if (oper.equals("==")) {
                int px = find(map.get(str.charAt(0)));
                int py = find(map.get(str.charAt(3)));
                if (px != py) {
                    par[px] = py;
                }
            }
        }
        for (String str : equations) {
            String oper = str.substring(1, 3);
            if (oper.equals("!=")) {
                int px = find(map.get(str.charAt(0)));
                int py = find(map.get(str.charAt(3)));
                if (px == py) {
                    return false;
                }
            }
        }
        return true;
    }

    private int find(int x) {
        if (par[x] == x) {
            return x;
        }
        par[x] = find(par[x]);
        return par[x];
    }
}
