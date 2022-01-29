package g0701_0800.s0756_pyramid_transition_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pyramidTransition() {
        assertThat(
                new Solution().pyramidTransition("BCD", Arrays.asList("BCC", "CDE", "CEA", "FFF")),
                equalTo(true));
    }

    @Test
    void pyramidTransition2() {
        assertThat(
                new Solution()
                        .pyramidTransition(
                                "AAAA", Arrays.asList("AAB", "AAC", "BCD", "BBE", "DEF")),
                equalTo(false));
    }
}
