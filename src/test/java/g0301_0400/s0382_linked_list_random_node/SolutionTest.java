package g0301_0400.s0382_linked_list_random_node;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ListNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        List<Integer> result = new ArrayList<>();
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode = new ListNode(1, listNode2);
        Solution solution = new Solution(listNode);
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        boolean contain = true;
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer i : result) {
            if (!expected.contains(i)) {
                contain = false;
                break;
            }
        }
        assertThat(contain, equalTo(true));
    }
}
