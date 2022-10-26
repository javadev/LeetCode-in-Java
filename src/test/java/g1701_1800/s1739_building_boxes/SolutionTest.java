package g1701_1800.s1739_building_boxes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumBoxes() {
        assertThat(new Solution().minimumBoxes(3), equalTo(3));
    }

    @Test
    void minimumBoxes2() {
        assertThat(new Solution().minimumBoxes(4), equalTo(3));
    }

    @Test
    void minimumBoxes3() {
        assertThat(new Solution().minimumBoxes(10), equalTo(6));
    }
}
