package g1301_1400.s1333_filter_restaurants_by_vegan_friendly_price_and_distance;

// #Medium #Array #Sorting #2022_03_19_Time_10_ms_(55.43%)_Space_58_MB_(52.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> filterRestaurants(
            int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> list = new ArrayList<>();
        for (int[] restaurant : restaurants) {
            if (((veganFriendly == 1 && restaurant[2] == 1) || veganFriendly == 0)
                    && restaurant[3] <= maxPrice
                    && restaurant[4] <= maxDistance) {
                list.add(restaurant);
            }
        }
        list.sort((a, b) -> b[1] - a[1] == 0 ? b[0] - a[0] : b[1] - a[1]);
        return list.stream().map(restaurant -> restaurant[0]).toList();
    }
}
