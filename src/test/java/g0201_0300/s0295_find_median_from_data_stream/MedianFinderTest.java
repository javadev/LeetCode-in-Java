package g0201_0300.s0295_find_median_from_data_stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class MedianFinderTest {
    @Test
    public void medianFinder() {
        MedianFinder medianFinder = new MedianFinder();
        // arr = [1]
        medianFinder.addNum(1);
        // arr = [1, 2]
        medianFinder.addNum(2);
        // return 1.5 (i.e., (1 + 2) / 2)
        assertThat(medianFinder.findMedian(), equalTo(1.5));
        // arr[1, 2, 3]
        medianFinder.addNum(3);
        // return 2.0
        assertThat(medianFinder.findMedian(), equalTo(2.0));
    }
}
