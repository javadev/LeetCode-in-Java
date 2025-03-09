package g3401_3500.s3479_fruits_into_baskets_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfUnplacedFruits() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {4, 2, 5}, new int[] {3, 5, 4}),
                equalTo(1));
    }

    @Test
    void numOfUnplacedFruits2() {
        assertThat(
                new Solution().numOfUnplacedFruits(new int[] {3, 6, 1}, new int[] {6, 4, 7}),
                equalTo(0));
    }
}
