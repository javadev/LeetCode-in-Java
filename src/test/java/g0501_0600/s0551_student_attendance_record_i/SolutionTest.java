package g0501_0600.s0551_student_attendance_record_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkRecord() {
        assertThat(new Solution().checkRecord("PPALLP"), equalTo(true));
    }

    @Test
    void checkRecord2() {
        assertThat(new Solution().checkRecord("PPALLL"), equalTo(false));
    }

    @Test
    void checkRecord3() {
        assertThat(new Solution().checkRecord("ALLAPPL"), equalTo(false));
    }
}
