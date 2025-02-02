package g3401_3500.s3441_minimum_cost_good_caption;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCostGoodCaption() {
        assertThat(new Solution().minCostGoodCaption("cdcd"), equalTo("cccc"));
    }

    @Test
    void minCostGoodCaption2() {
        assertThat(new Solution().minCostGoodCaption("aca"), equalTo("aaa"));
    }

    @Test
    void minCostGoodCaption3() {
        assertThat(new Solution().minCostGoodCaption("bc"), equalTo(""));
    }
}
