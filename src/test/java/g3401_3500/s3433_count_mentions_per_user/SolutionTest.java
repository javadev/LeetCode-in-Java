package g3401_3500.s3433_count_mentions_per_user;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMentions() {
        assertThat(
                new Solution()
                        .countMentions(
                                2,
                                new ArrayList<>(
                                        List.of(
                                                List.of("MESSAGE", "10", "id1 id0"),
                                                List.of("OFFLINE", "11", "0"),
                                                List.of("MESSAGE", "71", "HERE")))),
                equalTo(new int[] {2, 2}));
    }

    @Test
    void countMentions2() {
        assertThat(
                new Solution()
                        .countMentions(
                                2,
                                new ArrayList<>(
                                        List.of(
                                                List.of("MESSAGE", "10", "id1 id0"),
                                                List.of("OFFLINE", "11", "0"),
                                                List.of("MESSAGE", "12", "ALL")))),
                equalTo(new int[] {2, 2}));
    }

    @Test
    void countMentions3() {
        assertThat(
                new Solution()
                        .countMentions(
                                2,
                                new ArrayList<>(
                                        List.of(
                                                List.of("OFFLINE", "10", "0"),
                                                List.of("MESSAGE", "12", "HERE")))),
                equalTo(new int[] {0, 1}));
    }
}
