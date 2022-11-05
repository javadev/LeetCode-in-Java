package g0401_0500.s0432_all_oone_data_structure;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class AllOneTest {
    @Test
    void allOne() {
        AllOne allOne = new AllOne();
        allOne.inc("hello");
        allOne.inc("hello");
        // return "hello"
        assertThat(allOne.getMaxKey(), equalTo("hello"));
        // return "hello"
        assertThat(allOne.getMinKey(), equalTo("hello"));
        allOne.inc("leet");
        // return "hello"
        assertThat(allOne.getMaxKey(), equalTo("hello"));
        // return "leet"
        assertThat(allOne.getMinKey(), equalTo("leet"));
        allOne.dec("leet");
    }
}
