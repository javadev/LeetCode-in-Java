package g3101_3200.s3178_find_the_child_who_has_the_ball_after_k_seconds;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfChild() {
        assertThat(new Solution().numberOfChild(3, 5), equalTo(1));
    }

    @Test
    void numberOfChild2() {
        assertThat(new Solution().numberOfChild(5, 6), equalTo(2));
    }

    @Test
    void numberOfChild3() {
        assertThat(new Solution().numberOfChild(4, 2), equalTo(2));
    }
}
