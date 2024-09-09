package g3201_3300.s3280_convert_date_to_binary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void convertDateToBinary() {
        assertThat(
                new Solution().convertDateToBinary("2080-02-29"), equalTo("100000100000-10-11101"));
    }

    @Test
    void convertDateToBinary2() {
        assertThat(new Solution().convertDateToBinary("1900-01-01"), equalTo("11101101100-1-1"));
    }
}
