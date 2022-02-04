package g0801_0900.s0887_super_egg_drop;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void superEggDrop() {
        assertThat(new Solution().superEggDrop(1, 2), equalTo(2));
    }

    @Test
    void superEggDrop2() {
        assertThat(new Solution().superEggDrop(2, 6), equalTo(3));
    }

    @Test
    void superEggDrop3() {
        assertThat(new Solution().superEggDrop(3, 14), equalTo(4));
    }
}
