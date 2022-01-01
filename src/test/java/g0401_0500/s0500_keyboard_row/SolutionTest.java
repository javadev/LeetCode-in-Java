package g0401_0500.s0500_keyboard_row;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findWords() {
        assertThat(
                new Solution().findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"}),
                equalTo(new String[] {"Alaska", "Dad"}));
    }

    @Test
    void findWords2() {
        assertThat(new Solution().findWords(new String[] {"omk"}), equalTo(new String[] {}));
    }

    @Test
    void findWords3() {
        assertThat(
                new Solution().findWords(new String[] {"adsdf", "sfd"}),
                equalTo(new String[] {"adsdf", "sfd"}));
    }
}
