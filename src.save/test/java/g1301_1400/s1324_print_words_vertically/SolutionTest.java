package g1301_1400.s1324_print_words_vertically;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void printVertically() {
        assertThat(
                new Solution().printVertically("HOW ARE YOU"),
                equalTo(Arrays.asList("HAY", "ORO", "WEU")));
    }

    @Test
    void printVertically2() {
        assertThat(
                new Solution().printVertically("TO BE OR NOT TO BE"),
                equalTo(Arrays.asList("TBONTB", "OEROOE", "   T")));
    }

    @Test
    void printVertically3() {
        assertThat(
                new Solution().printVertically("CONTEST IS COMING"),
                equalTo(Arrays.asList("CIC", "OSO", "N M", "T I", "E N", "S G", "T")));
    }
}
