package g0101_0200.s0198_house_robber;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rob() {
        assertThat(new Solution().rob(new int[] {1, 2, 3, 1}), equalTo(4));
    }

    @Test
    void rob2() {
        assertThat(new Solution().rob(new int[] {2, 7, 9, 3, 1}), equalTo(12));
    }

    @Test
    void rob3() {
        assertThat(new Solution().rob(new int[] {5}), equalTo(5));
    }

    @Test
    void rob4() {
        assertThat(new Solution().rob(new int[] {5, 10}), equalTo(10));
    }

    @Test
    void rob5() {
        assertThat(new Solution().rob(new int[] {2, 1, 1, 2}), equalTo(4));
    }

    @Test
    void rob6() {
        assertThat(new Solution().rob(new int[] {3, 3, 3, 3, 3}), equalTo(9));
    }

    @Test
    void rob7() {
        assertThat(new Solution().rob(new int[] {100, 1, 100, 1, 100}), equalTo(300));
    }

    @Test
    void rob8() {
        assertThat(new Solution().rob(new int[] {}), equalTo(0));
    }
}
