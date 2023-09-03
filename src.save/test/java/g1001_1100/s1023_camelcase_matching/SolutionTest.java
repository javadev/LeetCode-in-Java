package g1001_1100.s1023_camelcase_matching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void camelMatch() {
        assertThat(
                new Solution()
                        .camelMatch(
                                new String[] {
                                    "FooBar",
                                    "FooBarTest",
                                    "FootBall",
                                    "FrameBuffer",
                                    "ForceFeedBack"
                                },
                                "FB"),
                equalTo(Arrays.asList(true, false, true, true, false)));
    }

    @Test
    void camelMatch2() {
        assertThat(
                new Solution()
                        .camelMatch(
                                new String[] {
                                    "FooBar",
                                    "FooBarTest",
                                    "FootBall",
                                    "FrameBuffer",
                                    "ForceFeedBack"
                                },
                                "FoBa"),
                equalTo(Arrays.asList(true, false, true, false, false)));
    }

    @Test
    void camelMatch3() {
        assertThat(
                new Solution()
                        .camelMatch(
                                new String[] {
                                    "FooBar",
                                    "FooBarTest",
                                    "FootBall",
                                    "FrameBuffer",
                                    "ForceFeedBack"
                                },
                                "FoBaT"),
                equalTo(Arrays.asList(false, true, false, false, false)));
    }
}
