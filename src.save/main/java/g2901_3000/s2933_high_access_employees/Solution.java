package g2901_3000.s2933_high_access_employees;

// #Medium #Array #String #Hash_Table #Sorting #2024_01_02_Time_9_ms_(87.94%)_Space_45.6_MB_(5.79%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private boolean isPossible(int a, int b) {
        int hb = b / 100;
        int ha = a / 100;
        int mind = b % 100;
        int mina = a % 100;
        if (hb == 23 && ha == 0) {
            return false;
        }
        if (hb - ha > 1) {
            return false;
        }
        if (hb - ha == 1) {
            mind += 60;
        }
        return mind - mina < 60;
    }

    private boolean isHighAccess(List<Integer> list) {
        if (list.size() < 3) {
            return false;
        }
        int i = 0;
        int j = 1;
        int k = 2;
        while (k < list.size()) {
            int a = list.get(i++);
            int b = list.get(j++);
            int c = list.get(k++);
            if (isPossible(a, c) && isPossible(b, c) && isPossible(a, b)) {
                return true;
            }
        }
        return false;
    }

    private int stringToInt(String str) {
        int i = 1000;
        int val = 0;
        for (char ch : str.toCharArray()) {
            int n = ch - '0';
            val += i * n;
            i = i / 10;
        }
        return val;
    }

    public List<String> findHighAccessEmployees(List<List<String>> accessTimes) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        for (List<String> list : accessTimes) {
            List<Integer> temp = map.getOrDefault(list.get(0), new ArrayList<>());
            int val = stringToInt(list.get(1));
            temp.add(val);
            map.put(list.get(0), temp);
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<Integer> temp = entry.getValue();
            Collections.sort(temp);
            if (isHighAccess(temp)) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
