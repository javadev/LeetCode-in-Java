package g1401_1500.s1496_path_crossing;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPathCrossing() {
        assertThat(new Solution().isPathCrossing("NES"), equalTo(false));
    }

    @Test
    void isPathCrossing2() {
        assertThat(new Solution().isPathCrossing("NESWW"), equalTo(true));
    }
}
