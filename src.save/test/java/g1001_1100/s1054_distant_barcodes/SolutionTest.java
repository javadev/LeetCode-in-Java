package g1001_1100.s1054_distant_barcodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rearrangeBarcodes() {
        assertThat(
                new Solution().rearrangeBarcodes(new int[] {1, 1, 1, 2, 2, 2}),
                equalTo(new int[] {1, 2, 1, 2, 1, 2}));
    }

    @Test
    void rearrangeBarcodes2() {
        assertThat(
                new Solution().rearrangeBarcodes(new int[] {1, 1, 1, 1, 2, 2, 3, 3}),
                equalTo(new int[] {1, 2, 1, 2, 1, 3, 1, 3}));
    }
}
