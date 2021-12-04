package g0201_0300.s0205_isomorphic_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void isIsomorphic() {
        assertThat(new Solution().isIsomorphic("egg", "add"), equalTo(true));
    }

    @Test
    public void isIsomorphic2() {
        assertThat(new Solution().isIsomorphic("foo", "bar"), equalTo(false));
    }

    @Test
    public void isIsomorphic3() {
        assertThat(new Solution().isIsomorphic("paper", "title"), equalTo(true));
    }
}
