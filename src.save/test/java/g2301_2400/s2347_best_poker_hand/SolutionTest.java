package g2301_2400.s2347_best_poker_hand;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bestHand() {
        assertThat(
                new Solution()
                        .bestHand(new int[] {13, 2, 3, 1, 9}, new char[] {'a', 'a', 'a', 'a', 'a'}),
                equalTo("Flush"));
    }

    @Test
    void bestHand2() {
        assertThat(
                new Solution()
                        .bestHand(new int[] {4, 4, 2, 4, 4}, new char[] {'d', 'a', 'a', 'b', 'c'}),
                equalTo("Three of a Kind"));
    }

    @Test
    void bestHand3() {
        assertThat(
                new Solution()
                        .bestHand(
                                new int[] {10, 10, 2, 12, 9}, new char[] {'a', 'b', 'c', 'a', 'd'}),
                equalTo("Pair"));
    }

    @Test
    void bestHand4() {
        assertThat(
                new Solution()
                        .bestHand(
                                new int[] {13, 12, 3, 4, 7}, new char[] {'a', 'd', 'c', 'b', 'c'}),
                equalTo("High Card"));
    }
}
