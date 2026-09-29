package g3901_4000.s3940_limit_occurrences_in_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void limitOccurrences() {
        assertThat(
                new Solution().limitOccurrences(new int[] {1, 1, 1, 2, 2, 3}, 2),
                equalTo(new int[] {1, 1, 2, 2, 3}));
    }

    @Test
    void limitOccurrences2() {
        assertThat(
                new Solution().limitOccurrences(new int[] {1, 2, 3}, 1),
                equalTo(new int[] {1, 2, 3}));
    }

    @Test
    void limitOccurrences3() {
        assertThat(new Solution().limitOccurrences(new int[] {5, 5, 5}, 1), equalTo(new int[] {5}));
    }

    @Test
    void limitOccurrences4() {
        assertThat(new Solution().limitOccurrences(new int[] {100}, 1), equalTo(new int[] {100}));
    }

    @Test
    void limitOccurrences5() {
        assertThat(
                new Solution().limitOccurrences(new int[] {1, 1, 2, 2}, 4),
                equalTo(new int[] {1, 1, 2, 2}));
    }
}
