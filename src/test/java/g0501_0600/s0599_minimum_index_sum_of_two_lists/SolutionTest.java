package g0501_0600.s0599_minimum_index_sum_of_two_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRestaurant() {
        assertThat(
                new Solution()
                        .findRestaurant(
                                new String[] {"Shogun", "Tapioca Express", "Burger King", "KFC"},
                                new String[] {
                                    "Piatti",
                                    "The Grill at Torrey Pines",
                                    "Hungry Hunter Steakhouse",
                                    "Shogun"
                                }),
                equalTo(new String[] {"Shogun"}));
    }
}
