package g3401_3500.s3457_eat_pizzas;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxWeight() {
        assertThat(new Solution().maxWeight(new int[] {1, 2, 3, 4, 5, 6, 7, 8}), equalTo(14L));
    }

    @Test
    void maxWeight2() {
        assertThat(new Solution().maxWeight(new int[] {2, 1, 1, 1, 1, 1, 1, 1}), equalTo(3L));
    }
}
