package g3101_3200.s3186_maximum_total_damage_with_spell_casting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTotalDamage() {
        assertThat(new Solution().maximumTotalDamage(new int[] {1, 1, 3, 4}), equalTo(6L));
    }

    @Test
    void maximumTotalDamage2() {
        assertThat(new Solution().maximumTotalDamage(new int[] {7, 1, 6, 6}), equalTo(13L));
    }

    @Test
    void maximumTotalDamage3() {
        assertThat(
                new Solution().maximumTotalDamage(new int[] {1_000_001, 1, 6, 6}),
                equalTo(1000014L));
    }
}
