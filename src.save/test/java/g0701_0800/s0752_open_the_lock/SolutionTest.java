package g0701_0800.s0752_open_the_lock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void openLock() {
        assertThat(
                new Solution()
                        .openLock(new String[] {"0201", "0101", "0102", "1212", "2002"}, "0202"),
                equalTo(6));
    }

    @Test
    void openLock2() {
        assertThat(new Solution().openLock(new String[] {"8888"}, "0009"), equalTo(1));
    }

    @Test
    void openLock3() {
        assertThat(
                new Solution()
                        .openLock(
                                new String[] {
                                    "8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"
                                },
                                "8888"),
                equalTo(-1));
    }
}
