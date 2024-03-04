package g3001_3100.s3049_earliest_second_to_mark_indices_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void earliestSecondToMarkIndices() {
        assertThat(
                new Solution()
                        .earliestSecondToMarkIndices(
                                new int[] {3, 2, 3}, new int[] {1, 3, 2, 2, 2, 2, 3}),
                equalTo(6));
    }

    @Test
    void earliestSecondToMarkIndices2() {
        assertThat(
                new Solution()
                        .earliestSecondToMarkIndices(
                                new int[] {0, 0, 1, 2}, new int[] {1, 2, 1, 2, 1, 2, 1, 2}),
                equalTo(7));
    }

    @Test
    void earliestSecondToMarkIndices3() {
        assertThat(
                new Solution()
                        .earliestSecondToMarkIndices(new int[] {1, 2, 3}, new int[] {1, 2, 3}),
                equalTo(-1));
    }
}
