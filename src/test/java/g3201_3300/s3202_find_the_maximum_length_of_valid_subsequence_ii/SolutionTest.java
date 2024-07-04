package g3201_3300.s3202_find_the_maximum_length_of_valid_subsequence_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumLength() {
        assertThat(new Solution().maximumLength(new int[] {1, 2, 3, 4, 5}, 2), equalTo(5));
    }

    @Test
    void maximumLength2() {
        assertThat(new Solution().maximumLength(new int[] {1, 4, 2, 3, 1, 4}, 3), equalTo(4));
    }
}
