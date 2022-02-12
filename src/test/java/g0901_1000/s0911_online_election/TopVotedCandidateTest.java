package g0901_1000.s0911_online_election;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class TopVotedCandidateTest {
    @Test
    void topVotedCandidateTest() {
        TopVotedCandidate topVotedCandidate =
                new TopVotedCandidate(
                        new int[] {0, 1, 1, 0, 0, 1, 0}, new int[] {0, 5, 10, 15, 20, 25, 30});
        assertThat(
                topVotedCandidate.q(3),
                equalTo(0)); // return 0, At time 3, the votes are [0], and 0 is leading.
        assertThat(
                topVotedCandidate.q(12),
                equalTo(1)); // return 1, At time 12, the votes are [0,1,1], and 1 is leading.
        assertThat(
                topVotedCandidate.q(25),
                equalTo(1)); // return 1, At time 25, the votes are [0,1,1,0,0,1], and 1 is leading
        // (as ties go to the most recent vote.)
        assertThat(topVotedCandidate.q(15), equalTo(0)); // return 0
        assertThat(topVotedCandidate.q(24), equalTo(0)); // return 0
        assertThat(topVotedCandidate.q(8), equalTo(1)); // return 1
    }
}
