package g0301_0400.s0381_insert_delete_getrandom_o1_duplicates_allowed;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class RandomizedCollectionTest {
    @Test
    void randomizedCollectionTest() {
        List<String> result = new ArrayList<>();
        RandomizedCollection randomizedCollection = null;
        result.add(randomizedCollection + "");
        randomizedCollection = new RandomizedCollection();
        result.add(randomizedCollection.insert(1) + "");
        result.add(randomizedCollection.insert(1) + "");
        result.add(randomizedCollection.insert(2) + "");
        int random = randomizedCollection.getRandom();
        result.add(random + "");

        result.add(randomizedCollection.remove(1) + "");
        int random2 = randomizedCollection.getRandom();
        result.add(random2 + "");

        List<String> expected =
                new ArrayList<>(
                        Arrays.asList(
                                "null",
                                "true",
                                "false",
                                "true",
                                random + "",
                                "true",
                                random2 + ""));
        assertThat(result, equalTo(expected));
    }
}
