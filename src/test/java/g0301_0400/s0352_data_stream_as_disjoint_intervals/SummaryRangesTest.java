package g0301_0400.s0352_data_stream_as_disjoint_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SummaryRangesTest {
    @Test
    void getIntervals() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        assertThat(summaryRanges.getIntervals(), equalTo(new int[][] {{1, 1}}));
    }

    @Test
    void getIntervals2() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        summaryRanges.addNum(3);
        assertThat(summaryRanges.getIntervals(), equalTo(new int[][] {{1, 1}, {3, 3}}));
    }

    @Test
    void getIntervals3() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        summaryRanges.addNum(3);
        summaryRanges.addNum(7);
        assertThat(summaryRanges.getIntervals(), equalTo(new int[][] {{1, 1}, {3, 3}, {7, 7}}));
    }

    @Test
    void getIntervals4() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        summaryRanges.addNum(2);
        summaryRanges.addNum(3);
        summaryRanges.addNum(7);
        assertThat(summaryRanges.getIntervals(), equalTo(new int[][] {{1, 3}, {7, 7}}));
    }

    @Test
    void getIntervals5() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        summaryRanges.addNum(2);
        summaryRanges.addNum(3);
        summaryRanges.addNum(6);
        summaryRanges.addNum(7);
        assertThat(summaryRanges.getIntervals(), equalTo(new int[][] {{1, 3}, {6, 7}}));
    }
}
