package g1401_1500.s1436_destination_city;

// #Easy #String #Hash_Table #2022_06_21_Time_3_ms_(81.47%)_Space_43.7_MB_(53.89%)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> strings : paths) {
            set.add(strings.get(0));
        }
        for (List<String> path : paths) {
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
