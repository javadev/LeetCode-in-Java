package g1301_1400.s1313_decompress_run_length_encoded_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decompressRLElist() {
        assertThat(
                new Solution().decompressRLElist(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {2, 4, 4, 4}));
    }

    @Test
    void decompressRLElist2() {
        assertThat(
                new Solution().decompressRLElist(new int[] {1, 1, 2, 3}),
                equalTo(new int[] {1, 3, 3}));
    }
}
