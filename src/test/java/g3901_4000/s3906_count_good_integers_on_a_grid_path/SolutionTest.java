package g3901_4000.s3906_count_good_integers_on_a_grid_path;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodIntegersOnPath() {
        assertThat(new Solution().countGoodIntegersOnPath(8L, 10L, "DDDRRR"), equalTo(2L));
    }

    @Test
    void countGoodIntegersOnPath2() {
        assertThat(
                new Solution().countGoodIntegersOnPath(123456789L, 123456790L, "DDRRDR"),
                equalTo(1L));
    }

    @Test
    void countGoodIntegersOnPath3() {
        assertThat(
                new Solution()
                        .countGoodIntegersOnPath(1288561398769758L, 1288561398769758L, "RRRDDD"),
                equalTo(0L));
    }

    @Test
    void countGoodIntegersOnPath4() {
        assertThat(
                new Solution()
                        .countGoodIntegersOnPath(1111111111111111L, 1111111111111111L, "RDRDRD"),
                equalTo(1L));
    }

    @Test
    void countGoodIntegersOnPath5() {
        assertThat(new Solution().countGoodIntegersOnPath(1L, 9L, "DRDRDR"), equalTo(9L));
    }

    @Test
    void countGoodIntegersOnPath6() {
        assertThat(new Solution().countGoodIntegersOnPath(1L, 99L, "RRRDDD"), equalTo(99L));
    }

    @Test
    void countGoodIntegersOnPath7() {
        assertThat(new Solution().countGoodIntegersOnPath(1L, 99L, "DDDRRR"), equalTo(54L));
    }

    @Test
    void countGoodIntegersOnPath8() {
        assertThat(
                new Solution()
                        .countGoodIntegersOnPath(9000000000000000L, 9000000000000000L, "RRRDDD"),
                equalTo(0L));
    }
}
