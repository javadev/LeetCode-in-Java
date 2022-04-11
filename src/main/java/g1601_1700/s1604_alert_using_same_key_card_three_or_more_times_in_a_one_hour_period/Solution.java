package g1601_1700.s1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period;

// #Medium #Array #String #Hash_Table #Sorting
// #2022_04_11_Time_77_ms_(95.79%)_Space_61.6_MB_(98.50%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            map.putIfAbsent(keyName[i], new ArrayList<>());
            map.get(keyName[i]).add(keyTime[i]);
        }
        List<String> soln = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> timeStamps = entry.getValue();
            Collections.sort(timeStamps);
            for (int i = 0; i + 2 < timeStamps.size(); i++) {
                String[] first = timeStamps.get(i).split(":");
                String[] third = timeStamps.get(i + 2).split(":");
                int hourDiff = Integer.parseInt(third[0]) - Integer.parseInt(first[0]);
                int minDiff = Integer.parseInt(third[1]) - Integer.parseInt(first[1]);
                if (hourDiff == 0 || (hourDiff == 1 && minDiff <= 0)) {
                    soln.add(entry.getKey());
                    break;
                }
            }
        }
        Collections.sort(soln);
        return soln;
    }
}
