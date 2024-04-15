package g2101_2200.s2115_find_all_possible_recipes_from_given_supplies;

// #Medium #Array #String #Hash_Table #Graph #Topological_Sort
// #2022_06_01_Time_43_ms_(85.86%)_Space_78.1_MB_(40.51%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public List<String> findAllRecipes(
            String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> indegree = new HashMap<>();
        Set<String> supplySet = new HashSet<>();
        Map<String, Set<String>> adj = new HashMap<>();
        Collections.addAll(supplySet, supplies);
        for (String recipe : recipes) {
            indegree.put(recipe, 0);
        }

        for (int i = 0; i < recipes.length; ++i) {
            String recipe = recipes[i];
            int numberOfDependencies = 0;
            for (String ingredient : ingredients.get(i)) {
                if (!supplySet.contains(ingredient)) {
                    adj.computeIfAbsent(ingredient, x -> new HashSet<>()).add(recipe);
                    numberOfDependencies++;
                }
            }
            indegree.put(recipe, numberOfDependencies);
        }
        Queue<String> q = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : indegree.entrySet()) {
            if (entry.getValue() == 0) {
                q.add(entry.getKey());
            }
        }
        List<String> res = new ArrayList<>();
        while (!q.isEmpty()) {
            String recipe = q.remove();
            res.add(recipe);
            if (adj.containsKey(recipe)) {
                for (String dep : adj.get(recipe)) {
                    indegree.put(dep, indegree.get(dep) - 1);
                    if (indegree.get(dep) == 0) {
                        q.add(dep);
                    }
                }
            }
        }
        return res;
    }
}
