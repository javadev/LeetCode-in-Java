package g1401_1500.s1452_people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list;

// #Medium #Array #String #Hash_Table #2022_03_28_Time_117_ms_(78.71%)_Space_83.9_MB_(33.17%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("java:S1119")
public class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        int n = favoriteCompanies.size();
        List<Integer> res = new ArrayList<>();
        List<Set<String>> in = new ArrayList<>();
        for (List<String> list : favoriteCompanies) {
            in.add(new HashSet<>(list));
        }
        outer:
        for (int i = 0; i < n; i++) {
            for (int j : res) {
                if (isSubset(in.get(i), in.get(j))) {
                    continue outer;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (isSubset(in.get(i), in.get(j))) {
                    continue outer;
                }
            }
            res.add(i);
        }
        return res;
    }

    private boolean isSubset(Set<String> subset, Set<String> set) {
        if (subset.size() >= set.size()) {
            return false;
        }
        return set.containsAll(subset);
    }
}
