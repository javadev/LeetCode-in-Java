package g3501_3600.s3597_partition_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import java.util.List;

class SolutionTest {
    @Test
    void partitionString() {
        assertThat(
                new Solution().partitionString("abbccccd"),
                equalTo(List.of("a", "b", "bc", "c", "cc", "d")));
    }

    @Test
    void partitionString2() {
        assertThat(new Solution().partitionString("aaaa"), equalTo(List.of("a", "aa")));
    }
}
