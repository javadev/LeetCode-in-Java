package g3701_3800.s3747_count_distinct_integers_after_removing_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countDistinct() {
        assertThat(new Solution().countDistinct(9L), equalTo(9L));
    }

    @Test
    void countDistinct2() {
        assertThat(new Solution().countDistinct(20L), equalTo(18L));
    }

    @Test
    void countDistinct3() {
        assertThat(new Solution().countDistinct(99L), equalTo(90L));
    }
}
