package g2201_2300.s2226_maximum_candies_allocated_to_k_children;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumCandies() {
        assertThat(new Solution().maximumCandies(new int[] {5, 8, 6}, 3), equalTo(5));
    }

    @Test
    void maximumCandies2() {
        assertThat(new Solution().maximumCandies(new int[] {2, 5}, 11), equalTo(0));
    }

    @Test
    void maximumCandies3() {
        assertThat(new Solution().maximumCandies(new int[] {1, 2, 3, 4, 10}, 5), equalTo(3));
    }
}
