package g1101_1200.s1144_decrease_elements_to_make_array_zigzag;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void movesToMakeZigzag() {
        assertThat(new Solution().movesToMakeZigzag(new int[] {1, 2, 3}), equalTo(2));
    }

    @Test
    void movesToMakeZigzag2() {
        assertThat(new Solution().movesToMakeZigzag(new int[] {9, 6, 1, 6, 2}), equalTo(4));
    }
}
