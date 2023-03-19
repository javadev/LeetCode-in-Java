package g2001_2100.s2064_minimized_maximum_of_products_distributed_to_any_store;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimizedMaximum() {
        assertThat(new Solution().minimizedMaximum(6, new int[] {11, 6}), equalTo(3));
    }

    @Test
    void minimizedMaximum2() {
        assertThat(new Solution().minimizedMaximum(7, new int[] {15, 10, 10}), equalTo(5));
    }

    @Test
    void minimizedMaximum3() {
        assertThat(new Solution().minimizedMaximum(1, new int[] {100000}), equalTo(100000));
    }
}
