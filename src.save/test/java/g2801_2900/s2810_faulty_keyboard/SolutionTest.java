package g2801_2900.s2810_faulty_keyboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void finalString() {
        assertThat(new Solution().finalString("string"), equalTo("rtsng"));
    }

    @Test
    void finalString2() {
        assertThat(new Solution().finalString("poiinter"), equalTo("ponter"));
    }
}
