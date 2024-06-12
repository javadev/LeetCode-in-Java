package g3101_3200.s3176_find_the_maximum_length_of_a_good_subsequence_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumLength() {
        assertThat(new Solution().maximumLength(new int[] {1, 2, 1, 1, 3}, 2), equalTo(4));
    }

    @Test
    void maximumLength2() {
        assertThat(new Solution().maximumLength(new int[] {1, 2, 3, 4, 5, 1}, 0), equalTo(2));
    }
}
