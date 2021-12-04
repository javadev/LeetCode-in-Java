package g0201_0300.s0242_valid_anagram;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isAnagram() {
        assertThat(new Solution().isAnagram("anagram", "nagaram"), equalTo(true));
    }

    @Test
    public void isAnagram2() {
        assertThat(new Solution().isAnagram("rat", "car"), equalTo(false));
    }
}
