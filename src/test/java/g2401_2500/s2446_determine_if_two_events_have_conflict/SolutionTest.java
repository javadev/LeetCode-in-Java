package g2401_2500.s2446_determine_if_two_events_have_conflict;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void haveConflict() {
        assertThat(
                new Solution()
                        .haveConflict(
                                new String[] {"01:15", "02:00"}, new String[] {"02:00", "03:00"}),
                equalTo(true));
    }

    @Test
    void haveConflict2() {
        assertThat(
                new Solution()
                        .haveConflict(
                                new String[] {"01:00", "02:00"}, new String[] {"01:20", "03:00"}),
                equalTo(true));
    }

    @Test
    void haveConflict3() {
        assertThat(
                new Solution()
                        .haveConflict(
                                new String[] {"10:00", "11:00"}, new String[] {"14:00", "15:00"}),
                equalTo(false));
    }
}
