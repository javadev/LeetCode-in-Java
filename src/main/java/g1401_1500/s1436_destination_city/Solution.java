package g1401_1500.s1436_destination_city;

// #Easy #String #Hash_Table #2022_06_21_Time_3_ms_(81.47%)_Space_43.7_MB_(53.89%)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            set.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            if (!set.contains(paths.get(i).get(1))) {
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}
