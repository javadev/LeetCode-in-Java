package g0501_0600.s0599_minimum_index_sum_of_two_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRestaurant() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {
            "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"
        };
        assertThat(new Solution().findRestaurant(list1, list2), equalTo(new String[] {"Shogun"}));
    }

    @Test
    void findRestaurant2() {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        assertThat(new Solution().findRestaurant(list1, list2), equalTo(new String[] {"Shogun"}));
    }
}
