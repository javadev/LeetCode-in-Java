package g3101_3200.s3114_latest_time_you_can_obtain_after_replacing_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLatestTime() {
        assertThat(new Solution().findLatestTime("1?:?4"), equalTo("11:54"));
    }

    @Test
    void findLatestTime2() {
        assertThat(new Solution().findLatestTime("0?:5?"), equalTo("09:59"));
    }

    @Test
    void findLatestTime3() {
        assertThat(new Solution().findLatestTime("?1:?6"), equalTo("11:56"));
    }

    @Test
    void findLatestTime4() {
        assertThat(new Solution().findLatestTime("08:33"), equalTo("08:33"));
    }
}
