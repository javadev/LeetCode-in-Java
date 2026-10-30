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

    @Test
    void solutionTest2() {
        List<Integer> result = new ArrayList<>();
        ListNode listNode = new ListNode(7);
        Solution solution = new Solution(listNode);
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        result.add(solution.getRandom());
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 7, 7, 7, 7));
        assertThat(result, equalTo(expected));
    }

    @Test
    void solutionTest3() {
        List<Integer> result = new ArrayList<>();
        ListNode listNode4 = new ListNode(0);
        ListNode listNode3 = new ListNode(-5, listNode4);
        ListNode listNode2 = new ListNode(10, listNode3);
        ListNode listNode = new ListNode(-1, listNode2);
        Solution solution = new Solution(listNode);
        for (int i = 0; i < 1000; i++) {
            result.add(solution.getRandom());
        }
        boolean contain = true;
        List<Integer> expected = new ArrayList<>(Arrays.asList(-1, 10, -5, 0));
        for (Integer i : result) {
            if (!expected.contains(i)) {
                contain = false;
                break;
            }
        }
        boolean allReturned = true;
        for (Integer value : expected) {
            if (!result.contains(value)) {
                allReturned = false;
                break;
            }
        }
        assertThat(contain, equalTo(true));
        assertThat(allReturned, equalTo(true));
    }
}
