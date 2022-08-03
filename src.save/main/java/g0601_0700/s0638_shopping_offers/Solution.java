package g0601_0700.s0638_shopping_offers;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask #Memoization
// #2022_03_21_Time_6_ms_(71.06%)_Space_42.6_MB_(71.63%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int shoppingOffers(
            List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        shoppingOffersUtil(price, special, needs, map);
        return map.get(needs);
    }

    private int shoppingOffersUtil(
            List<Integer> price,
            List<List<Integer>> special,
            List<Integer> needs,
            Map<List<Integer>, Integer> map) {
        if (map.containsKey(needs)) {
            return map.get(needs);
        }
        Integer ans = computePrice(price, needs);
        for (int i = 0; i < special.size(); i++) {
            if (verify(special.get(i), needs)) {
                ans =
                        Math.min(
                                special.get(i).get(needs.size())
                                        + shoppingOffersUtil(
                                                price,
                                                special,
                                                updatedNeeds(needs, special.get(i)),
                                                map),
                                ans);
            }
        }
        map.put(needs, ans);
        return map.get(needs);
    }

    private List<Integer> updatedNeeds(List<Integer> needs, List<Integer> special) {
        List<Integer> updatedNeeds = new ArrayList<>(needs);
        for (int i = 0; i < needs.size(); i++) {
            updatedNeeds.set(i, updatedNeeds.get(i) - special.get(i));
        }
        return updatedNeeds;
    }

    private boolean verify(List<Integer> special, List<Integer> needs) {
        for (int i = 0; i < needs.size(); i++) {
            if (special.get(i) > needs.get(i)) {
                return false;
            }
        }
        return true;
    }

    private Integer computePrice(List<Integer> price, List<Integer> needs) {
        int ans = 0;
        for (int i = 0; i < needs.size(); i++) {
            ans += (needs.get(i) * price.get(i));
        }
        return ans;
    }
}
