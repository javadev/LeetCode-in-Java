package g2901_3000.s2951_find_the_peaks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPeaks() {
        assertThat(new Solution().findPeaks(new int[] {2, 4, 4}), equalTo(List.of()));
    }

    @Test
    void findPeaks2() {
        assertThat(new Solution().findPeaks(new int[] {1, 4, 3, 8, 5}), equalTo(List.of(1, 3)));
    }
}
