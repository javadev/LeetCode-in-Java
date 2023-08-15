package g2501_2600.s2550_count_collisions_of_monkeys_on_a_polygon;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void monkeyMove() {
        assertThat(new Solution().monkeyMove(3), equalTo(6));
    }

    @Test
    void monkeyMove2() {
        assertThat(new Solution().monkeyMove(4), equalTo(14));
    }
}
