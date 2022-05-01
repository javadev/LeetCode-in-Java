package g1601_1700.s1656_design_an_ordered_stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class OrderedStreamTest {
    @Test
    void orderedStream() {
        OrderedStream os = new OrderedStream(5);
        // Inserts (3, "ccccc"), returns [].
        assertThat(os.insert(3, "ccccc"), equalTo(Collections.emptyList()));
        // Inserts (1, "aaaaa"), returns ["aaaaa"].
        assertThat(os.insert(1, "aaaaa"), equalTo(Arrays.asList("aaaaa")));
        // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        assertThat(os.insert(2, "bbbbb"), equalTo(Arrays.asList("bbbbb", "ccccc")));
        // Inserts (5, "eeeee"), returns [].
        assertThat(os.insert(5, "eeeee"), equalTo(Collections.emptyList()));
        // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
        assertThat(os.insert(4, "ddddd"), equalTo(Arrays.asList("ddddd", "eeeee")));
    }
}
