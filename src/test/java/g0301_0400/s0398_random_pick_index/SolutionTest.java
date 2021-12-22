package g0301_0400.s0398_random_pick_index;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void pick() {
        int[] input = new int[]{1, 2, 3, 3, 3};
        Solution solution = new Solution(input);
        Map<Integer, List<Integer>> integerListHashMap= new HashMap<>();
        integerListHashMap.put(1,new ArrayList<>(Collections.singletonList(0)));
        integerListHashMap.put(2,new ArrayList<>(Collections.singletonList(1)));
        integerListHashMap.put(3,new ArrayList<>(Arrays.asList(2,3,4)));
        boolean valid = true;
        if(!integerListHashMap.get(3).contains(solution.pick(3))){
            valid= false;
        }

        if(!integerListHashMap.get(1).contains(solution.pick(1))){
            valid= false;
        }

        if(!integerListHashMap.get(3).contains(solution.pick(3))){
            valid= false;
        }

        assertThat(valid, equalTo(true));
    }
}
