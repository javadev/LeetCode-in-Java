package g1601_1700.s1673_find_the_most_competitive_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostCompetitive() {
        assertThat(
                new Solution().mostCompetitive(new int[] {3, 5, 2, 6}, 2),
                equalTo(new int[] {2, 6}));
    }

    @Test
    void mostCompetitive2() {
        assertThat(
                new Solution().mostCompetitive(new int[] {2, 4, 3, 3, 5, 4, 9, 6}, 4),
                equalTo(new int[] {2, 3, 3, 4}));
    }
}
