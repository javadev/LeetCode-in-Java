package g2001_2100.s2058_find_the_minimum_and_maximum_number_of_nodes_between_critical_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nodesBetweenCriticalPoints() {
        ListNode node = LinkedListUtils.createSinglyLinkedList(Arrays.asList(3, 1));
        assertThat(new Solution().nodesBetweenCriticalPoints(node), equalTo(new int[] {-1, -1}));
    }

    @Test
    void nodesBetweenCriticalPoints2() {
        ListNode node = LinkedListUtils.createSinglyLinkedList(Arrays.asList(5, 3, 1, 2, 5, 1, 2));
        assertThat(new Solution().nodesBetweenCriticalPoints(node), equalTo(new int[] {1, 3}));
    }

    @Test
    void nodesBetweenCriticalPoints3() {
        ListNode node =
                LinkedListUtils.createSinglyLinkedList(Arrays.asList(1, 3, 2, 2, 3, 2, 2, 2, 7));
        assertThat(new Solution().nodesBetweenCriticalPoints(node), equalTo(new int[] {3, 3}));
    }
}
