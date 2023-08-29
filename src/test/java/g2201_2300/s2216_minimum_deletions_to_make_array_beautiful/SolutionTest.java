package g2201_2300.s2216_minimum_deletions_to_make_array_beautiful;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletion() {
        assertThat(new Solution().minDeletion(new int[] {1, 1, 2, 3, 5}), equalTo(1));
    }

    @Test
    void minDeletion2() {
        assertThat(new Solution().minDeletion(new int[] {1, 1, 2, 2, 3, 3}), equalTo(2));
    }
}
