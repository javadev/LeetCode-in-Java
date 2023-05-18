package g0301_0400.s0380_insert_delete_getrandom_o1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class RandomizedSetTest {
    @Test
    void randomizedSet() {
        List<String> result = new ArrayList<>();
        RandomizedSet randomizedSet = null;
        result.add(randomizedSet + "");
        randomizedSet = new RandomizedSet();
        result.add(randomizedSet.insert(1) + "");
        result.add(randomizedSet.remove(2) + "");
        result.add(randomizedSet.insert(2) + "");
        int random = randomizedSet.getRandom();
        result.add(random + "");
        result.add(randomizedSet.remove(1) + "");
        result.add(randomizedSet.insert(2) + "");
        result.add(randomizedSet.getRandom() + "");
        List<String> expected =
                new ArrayList<>(
                        Arrays.asList("null", "true", "false", "true", "1", "true", "false", "2"));
        List<String> expected2 =
                new ArrayList<>(
                        Arrays.asList("null", "true", "false", "true", "2", "true", "false", "2"));
        if (random == 1) {
            assertThat(result, equalTo(expected));
        } else {
            assertThat(result, equalTo(expected2));
        }
    }
}
