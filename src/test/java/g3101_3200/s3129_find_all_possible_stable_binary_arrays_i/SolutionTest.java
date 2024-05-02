package g3101_3200.s3129_find_all_possible_stable_binary_arrays_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfStableArrays() {
        assertThat(new Solution().numberOfStableArrays(1, 1, 2), equalTo(2));
    }

    @Test
    void numberOfStableArrays2() {
        assertThat(new Solution().numberOfStableArrays(1, 2, 1), equalTo(1));
    }

    @Test
    void numberOfStableArrays3() {
        assertThat(new Solution().numberOfStableArrays(3, 3, 2), equalTo(14));
    }
}
