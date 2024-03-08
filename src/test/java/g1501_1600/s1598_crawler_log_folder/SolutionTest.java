package g1501_1600.s1598_crawler_log_folder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new String[] {"d1/", "d2/", "../", "d21/", "./"}),
                equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution()
                        .minOperations(new String[] {"d1/", "d2/", "./", "d3/", "../", "d31/"}),
                equalTo(3));
    }

    @Test
    void minOperations3() {
        assertThat(
                new Solution().minOperations(new String[] {"d1/", "../", "../", "../"}),
                equalTo(0));
    }
}
