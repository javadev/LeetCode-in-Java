package g0601_0700.s0677_map_sum_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MapSumTest {
    @Test
    void mapSumTest() {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        assertThat(mapSum.sum("ap"), equalTo(3));
        mapSum.insert("app", 2);
        assertThat(mapSum.sum("ap"), equalTo(5));
    }
}
