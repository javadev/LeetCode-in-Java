package g1901_2000.s1980_find_unique_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDifferentBinaryString() {
        assertThat(
                new Solution().findDifferentBinaryString(new String[] {"01", "10"}), equalTo("00"));
    }

    @Test
    void findDifferentBinaryString2() {
        assertThat(
                new Solution().findDifferentBinaryString(new String[] {"00", "01"}), equalTo("10"));
    }

    @Test
    void findDifferentBinaryString3() {
        assertThat(
                new Solution().findDifferentBinaryString(new String[] {"111", "011", "001"}),
                equalTo("000"));
    }
}
