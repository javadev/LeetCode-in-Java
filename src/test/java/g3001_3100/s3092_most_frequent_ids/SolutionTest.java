package g3001_3100.s3092_most_frequent_ids;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostFrequentIDs() {
        assertThat(
                new Solution().mostFrequentIDs(new int[] {2, 3, 2, 1}, new int[] {3, 2, -3, 1}),
                equalTo(new long[] {3, 3, 2, 2}));
    }

    @Test
    void mostFrequentIDs2() {
        assertThat(
                new Solution().mostFrequentIDs(new int[] {5, 5, 3}, new int[] {2, -2, 1}),
                equalTo(new long[] {2, 0, 1}));
    }
}
