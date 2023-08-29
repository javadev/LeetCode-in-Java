package g0801_0900.s0858_mirror_reflection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mirrorReflection() {
        assertThat(new Solution().mirrorReflection(2, 1), equalTo(2));
    }

    @Test
    void mirrorReflection2() {
        assertThat(new Solution().mirrorReflection(3, 1), equalTo(1));
    }
}
