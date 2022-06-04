package g2101_2200.s2132_stamping_the_grid;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void possibleToStamp() {
        assertThat(new Solution().possibleToStamp(new int[][]{{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0}},4,3), equalTo(true));
    }

    @Test
    void possibleToStamp2() {
        assertThat(new Solution().possibleToStamp(new int[][]{{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}},2,2), equalTo(false));
    }
}
