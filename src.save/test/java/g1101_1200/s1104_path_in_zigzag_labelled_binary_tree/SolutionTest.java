package g1101_1200.s1104_path_in_zigzag_labelled_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

@SuppressWarnings("java:S2925")
class SolutionTest {
    @Test
    void pathInZigZagTree() {
        assertThat(new Solution().pathInZigZagTree(14), equalTo(Arrays.asList(1, 3, 4, 14)));
    }

    @Test
    void pathInZigZagTree2() {
        assertThat(new Solution().pathInZigZagTree(26), equalTo(Arrays.asList(1, 2, 6, 10, 26)));
    }
}
