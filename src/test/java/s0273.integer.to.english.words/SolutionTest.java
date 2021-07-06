package s0273.integer.to.english.words;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void numberToWords() {
        assertThat(new Solution().numberToWords(123), equalTo("One Hundred Twenty Three"));
    }
}
