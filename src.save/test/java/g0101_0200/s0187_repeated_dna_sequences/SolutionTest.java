package g0101_0200.s0187_repeated_dna_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRepeatedDnaSequences() {
        assertThat(
                new Solution().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"),
                equalTo(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA")));
    }

    @Test
    void findRepeatedDnaSequences2() {
        assertThat(
                new Solution().findRepeatedDnaSequences("AAAAAAAAAAAAA"),
                equalTo(Collections.singletonList("AAAAAAAAAA")));
    }
}
