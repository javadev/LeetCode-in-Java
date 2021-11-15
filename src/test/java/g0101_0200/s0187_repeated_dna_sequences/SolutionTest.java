package g0101_0200.s0187_repeated_dna_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findRepeatedDnaSequences() {
        assertThat(
                new Solution().findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"),
                equalTo(Arrays.asList("AAAAACCCCC", "CCCCCAAAAA")));
    }
}
