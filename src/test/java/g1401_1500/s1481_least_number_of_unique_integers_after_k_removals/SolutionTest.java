package g1401_1500.s1481_least_number_of_unique_integers_after_k_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLeastNumOfUniqueInts() {
        assertThat(new Solution().findLeastNumOfUniqueInts(new int[] {5, 5, 4}, 1), equalTo(1));
    }

    @Test
    void findLeastNumOfUniqueInts2() {
        assertThat(
                new Solution().findLeastNumOfUniqueInts(new int[] {4, 3, 1, 1, 3, 3, 2}, 3),
                equalTo(2));
    }
}
