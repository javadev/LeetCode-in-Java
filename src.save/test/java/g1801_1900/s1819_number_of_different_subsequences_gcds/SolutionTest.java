package g1801_1900.s1819_number_of_different_subsequences_gcds;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDifferentSubsequenceGCDs() {
        assertThat(new Solution().countDifferentSubsequenceGCDs(new int[] {6, 10, 3}), equalTo(5));
    }

    @Test
    void countDifferentSubsequenceGCDs2() {
        assertThat(
                new Solution().countDifferentSubsequenceGCDs(new int[] {5, 15, 40, 5, 6}),
                equalTo(7));
    }
}
