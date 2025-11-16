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

    @Test
    void mirrorReflection3() {
        assertThat(new Solution().mirrorReflection(4, 2), equalTo(2));
    }

    @Test
    void mirrorReflection4() {
        assertThat(new Solution().mirrorReflection(6, 3), equalTo(2));
    }

    @Test
    void mirrorReflection5() {
        assertThat(new Solution().mirrorReflection(5, 2), equalTo(0));
    }

    @Test
    void mirrorReflection6() {
        assertThat(new Solution().mirrorReflection(7, 3), equalTo(1));
    }

    @Test
    void mirrorReflection7() {
        assertThat(new Solution().mirrorReflection(1000, 250), equalTo(2));
    }

    @Test
    void mirrorReflection8() {
        assertThat(new Solution().mirrorReflection(4, 4), equalTo(1));
    }

    @Test
    void mirrorReflection9() {
        assertThat(new Solution().mirrorReflection(1, 1), equalTo(1));
    }
}
