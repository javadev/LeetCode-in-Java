package g2401_2500.s2468_split_message_based_on_limit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitMessage() {
        assertThat(
                new Solution().splitMessage("this is really a very awesome message", 9),
                equalTo(
                        new String[] {
                            "thi<1/14>",
                            "s i<2/14>",
                            "s r<3/14>",
                            "eal<4/14>",
                            "ly <5/14>",
                            "a v<6/14>",
                            "ery<7/14>",
                            " aw<8/14>",
                            "eso<9/14>",
                            "me<10/14>",
                            " m<11/14>",
                            "es<12/14>",
                            "sa<13/14>",
                            "ge<14/14>"
                        }));
    }

    @Test
    void splitMessage2() {
        assertThat(
                new Solution().splitMessage("short message", 15),
                equalTo(new String[] {"short mess<1/2>", "age<2/2>"}));
    }
}
