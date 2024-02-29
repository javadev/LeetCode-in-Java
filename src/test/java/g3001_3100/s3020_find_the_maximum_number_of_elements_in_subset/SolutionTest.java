package g3001_3100.s3020_find_the_maximum_number_of_elements_in_subset;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumLength() {
        assertThat(new Solution().maximumLength(new int[] {5, 4, 1, 2, 2}), equalTo(3));
    }

    @Test
    void maximumLength2() {
        assertThat(new Solution().maximumLength(new int[] {1, 3, 2, 4}), equalTo(1));
    }
}
