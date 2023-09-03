package g1601_1700.s1604_alert_using_same_key_card_three_or_more_times_in_a_one_hour_period;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void alertNames() {
        assertThat(
                new Solution()
                        .alertNames(
                                new String[] {
                                    "daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"
                                },
                                new String[] {
                                    "10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"
                                }),
                equalTo(Collections.singletonList("daniel")));
    }

    @Test
    void alertNames2() {
        assertThat(
                new Solution()
                        .alertNames(
                                new String[] {
                                    "alice", "alice", "alice", "bob", "bob", "bob", "bob"
                                },
                                new String[] {
                                    "12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00"
                                }),
                equalTo(Collections.singletonList("bob")));
    }
}
