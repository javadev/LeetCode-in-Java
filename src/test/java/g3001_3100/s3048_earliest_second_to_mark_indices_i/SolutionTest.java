package g3001_3100.s3048_earliest_second_to_mark_indices_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void earliestSecondToMarkIndices() {
        assertThat(
                new Solution()
                        .earliestSecondToMarkIndices(
                                new int[] {2, 2, 0}, new int[] {2, 2, 2, 2, 3, 2, 2, 1}),
                equalTo(8));
    }

    @Test
    void earliestSecondToMarkIndices2() {
        assertThat(
                new Solution()
                        .earliestSecondToMarkIndices(
                                new int[] {1, 3}, new int[] {1, 1, 1, 2, 1, 1, 1}),
                equalTo(6));
    }

    @Test
    void earliestSecondToMarkIndices3() {
        assertThat(
                new Solution().earliestSecondToMarkIndices(new int[] {0, 1}, new int[] {2, 2, 2}),
                equalTo(-1));
    }
}
