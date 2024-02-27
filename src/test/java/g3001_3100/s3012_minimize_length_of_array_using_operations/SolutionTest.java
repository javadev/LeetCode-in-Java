package g3001_3100.s3012_minimize_length_of_array_using_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumArrayLength() {
        assertThat(new Solution().minimumArrayLength(new int[] {1, 4, 3, 1}), equalTo(1));
    }

    @Test
    void minimumArrayLength2() {
        assertThat(new Solution().minimumArrayLength(new int[] {5, 5, 5, 10, 5}), equalTo(2));
    }

    @Test
    void minimumArrayLength3() {
        assertThat(new Solution().minimumArrayLength(new int[] {2, 3, 4}), equalTo(1));
    }
}
