package g0101_0200.s0187_repeated_dna_sequences_medium_string_hash_table_bit_manipulation_sliding_window_hash_function_rolling_hash;

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
