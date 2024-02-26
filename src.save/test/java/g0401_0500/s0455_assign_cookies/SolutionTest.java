package g0401_0500.s0455_assign_cookies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findContentChildren() {
        assertThat(
                new Solution().findContentChildren(new int[] {1, 2, 3}, new int[] {1, 1}),
                equalTo(1));
    }

    @Test
    void findContentChildren2() {
        assertThat(
                new Solution()
                        .findContentChildren(
                                new int[] {
                                    1, 2,
                                },
                                new int[] {1, 2, 3}),
                equalTo(2));
    }
}
