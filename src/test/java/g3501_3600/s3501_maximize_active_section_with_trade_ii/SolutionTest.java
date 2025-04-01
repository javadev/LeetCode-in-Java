package g3501_3600.s3501_maximize_active_section_with_trade_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxActiveSectionsAfterTrade() {
        assertThat(
                new Solution().maxActiveSectionsAfterTrade("01", new int[][] {{0, 1}}),
                equalTo(List.of(1)));
    }

    @Test
    void maxActiveSectionsAfterTrade2() {
        assertThat(
                new Solution()
                        .maxActiveSectionsAfterTrade(
                                "0100", new int[][] {{0, 3}, {0, 2}, {1, 3}, {2, 3}}),
                equalTo(List.of(4, 3, 1, 1)));
    }

    @Test
    void maxActiveSectionsAfterTrade3() {
        assertThat(
                new Solution()
                        .maxActiveSectionsAfterTrade(
                                "1000100", new int[][] {{1, 5}, {0, 6}, {0, 4}}),
                equalTo(List.of(6, 7, 2)));
    }

    @Test
    void maxActiveSectionsAfterTrade4() {
        assertThat(
                new Solution()
                        .maxActiveSectionsAfterTrade("01010", new int[][] {{0, 3}, {1, 4}, {1, 3}}),
                equalTo(List.of(4, 4, 2)));
    }

    @Test
    void maxActiveSectionsAfterTrade5() {
        assertThat(
                new Solution()
                        .maxActiveSectionsAfterTrade(
                                "10110111", new int[][] {{3, 7}, {4, 6}, {0, 6}}),
                equalTo(List.of(6, 6, 8)));
    }
}
