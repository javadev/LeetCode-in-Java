package g3201_3300.s3201_find_the_maximum_length_of_valid_subsequence_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumLength() {
        assertThat(new Solution().maximumLength(new int[] {1, 2, 3, 4}), equalTo(4));
    }

    @Test
    void maximumLength2() {
        assertThat(new Solution().maximumLength(new int[] {1, 2, 1, 1, 2, 1, 2}), equalTo(6));
    }
}
