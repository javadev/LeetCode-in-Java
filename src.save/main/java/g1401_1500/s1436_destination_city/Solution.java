package g1401_1500.s1436_destination_city;

// #Easy #String #Hash_Table #Acceptance_77.7% #2022_03_28_Time_7_ms_(11.79%)_Space_44.2_MB_(27.60%)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> sourceSet = new HashSet<>();
        Set<String> destSet = new HashSet<>();
        for (List<String> path : paths) {
            String source = path.get(0);
            String dest = path.get(1);
            sourceSet.add(source);
            destSet.add(dest);
        }
        for (String dest : destSet) {
            if (!sourceSet.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}
