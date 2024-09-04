package g3201_3300.s3273_minimum_amount_of_damage_dealt_to_bob;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDamage() {
        assertThat(
                new Solution().minDamage(4, new int[] {1, 2, 3, 4}, new int[] {4, 5, 6, 8}),
                equalTo(39L));
    }

    @Test
    void minDamage2() {
        assertThat(
                new Solution().minDamage(1, new int[] {1, 1, 1, 1}, new int[] {1, 2, 3, 4}),
                equalTo(20L));
    }

    @Test
    void minDamage3() {
        assertThat(new Solution().minDamage(8, new int[] {40}, new int[] {59}), equalTo(320L));
    }
}
