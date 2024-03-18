package g0301_0400.s0341_flatten_nested_list_iterator;

// #Medium #Depth_First_Search #Tree #Stack #Design #Queue #Iterator #Programming_Skills_II_Day_18
// #2022_07_10_Time_2_ms_(99.95%)_Space_43.2_MB_(94.14%)

import com_github_leetcode.NestedInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
@SuppressWarnings("java:S2272")
public class NestedIterator implements Iterator<Integer> {
    private Deque<ListIterator<NestedInteger>> stack;
    private ListIterator<NestedInteger> it;
    private NestedInteger next;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new ArrayDeque<>();
        it = nestedList.listIterator();
    }

    @Override
    public Integer next() {
        return next.getInteger();
    }

    @Override
    public boolean hasNext() {
        while (it.hasNext() || !stack.isEmpty()) {
            // end of list
            if (!it.hasNext()) {
                it = stack.pop();
                continue;
            }
            NestedInteger ni = it.next();
            if (ni.isInteger()) {
                next = ni;
                return true;
            } else {
                stack.push(it);
                it = ni.getList().listIterator();
            }
        }
        return false;
    }
}

/*
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
