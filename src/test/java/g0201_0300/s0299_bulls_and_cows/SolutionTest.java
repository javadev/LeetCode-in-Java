package g0201_0300.s0299_bulls_and_cows;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void getHint() {
        assertThat(new Solution().getHint("1807", "7810"), equalTo("1A3B"));
    }

    @Test
    public void getHint2() {
        assertThat(new Solution().getHint("1123", "0111"), equalTo("1A1B"));
    }

    @Test
    public void getHint3() {
        assertThat(new Solution().getHint("1", "0"), equalTo("0A0B"));
    }

    @Test
    public void getHint4() {
        assertThat(new Solution().getHint("1", "1"), equalTo("1A0B"));
    }
}
