package g1601_1700.s1614_maximum_nesting_depth_of_the_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDepth() {
        assertThat(new Solution().maxDepth("(1+(2*3)+((8)/4))+1"), equalTo(3));
    }

    @Test
    void maxDepth2() {
        assertThat(new Solution().maxDepth("(1)+((2))+(((3)))"), equalTo(3));
    }
}
