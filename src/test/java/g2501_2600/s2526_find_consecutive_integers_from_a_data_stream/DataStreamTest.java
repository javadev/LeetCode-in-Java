package g2501_2600.s2526_find_consecutive_integers_from_a_data_stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class DataStreamTest {
    @Test
    void dataStreamTest() {
        DataStream dataStream = new DataStream(4, 3);
        assertThat(dataStream.consec(4), equalTo(false));
        assertThat(dataStream.consec(4), equalTo(false));
        assertThat(dataStream.consec(4), equalTo(true));
        assertThat(dataStream.consec(3), equalTo(false));
    }
}
