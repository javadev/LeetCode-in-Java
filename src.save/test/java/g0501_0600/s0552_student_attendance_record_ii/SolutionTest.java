package g0501_0600.s0552_student_attendance_record_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkRecord() {
        assertThat(new Solution().checkRecord(2), equalTo(8));
    }

    @Test
    void checkRecord2() {
        assertThat(new Solution().checkRecord(1), equalTo(3));
    }

    @Test
    void checkRecord3() {
        assertThat(new Solution().checkRecord(10101), equalTo(183236316));
    }
}
