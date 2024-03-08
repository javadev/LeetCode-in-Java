package g0301_0400.s0341_flatten_nested_list_iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.NestedInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class NestedIteratorTest {
    @Test
    void nestedIterator() {
        NestedIterator iterator =
                new NestedIterator(
                        Arrays.asList(
                                new NestedInteger(
                                        Arrays.asList(new NestedInteger(1), new NestedInteger(1))),
                                new NestedInteger(2),
                                new NestedInteger(
                                        Arrays.asList(
                                                new NestedInteger(1), new NestedInteger(1)))));
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        assertThat(result, equalTo(Arrays.asList(1, 1, 2, 1, 1)));
    }

    @Test
    void nestedIterator2() {
        NestedInteger integer1 = new NestedInteger(1);
        NestedInteger integer2 = new NestedInteger(2);
        NestedInteger integer3 = new NestedInteger(3);
        List<NestedInteger> list = new ArrayList<>();
        list.add(integer1);
        list.add(integer2);
        list.add(integer3);
        NestedInteger nestedIntegerList = new NestedInteger(list);
        List<NestedInteger> input = new ArrayList<>();
        input.add(integer1);
        input.add(integer2);
        input.add(nestedIntegerList);
        input.add(integer3);
        NestedIterator iterator = new NestedIterator(input);
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        assertThat(result, equalTo(Arrays.asList(1, 2, 1, 2, 3, 3)));
    }
}
