package g3301_3400.s3320_count_the_number_of_winning_sequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countWinningSequences() {
        assertThat(new Solution().countWinningSequences("FFF"), equalTo(3));
    }

    @Test
    void countWinningSequences2() {
        assertThat(new Solution().countWinningSequences("FWEFW"), equalTo(18));
    }
}
