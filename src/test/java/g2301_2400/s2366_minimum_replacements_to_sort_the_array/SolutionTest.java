package g2301_2400.s2366_minimum_replacements_to_sort_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumReplacement() {
        assertThat(new Solution().minimumReplacement(new int[] {3, 9, 3}), equalTo(2L));
    }

    @Test
    void minimumReplacement2() {
        assertThat(new Solution().minimumReplacement(new int[] {1, 2, 3, 4, 5}), equalTo(0L));
    }
}
