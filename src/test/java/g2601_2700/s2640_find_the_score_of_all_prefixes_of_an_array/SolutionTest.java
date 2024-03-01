package g2601_2700.s2640_find_the_score_of_all_prefixes_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPrefixScore() {
        assertThat(
                new Solution().findPrefixScore(new int[] {2, 3, 7, 5, 10}),
                equalTo(new long[] {4, 10, 24, 36, 56}));
    }

    @Test
    void findPrefixScore2() {
        assertThat(
                new Solution().findPrefixScore(new int[] {1, 1, 2, 4, 8, 16}),
                equalTo(new long[] {2, 4, 8, 16, 32, 64}));
    }
}
