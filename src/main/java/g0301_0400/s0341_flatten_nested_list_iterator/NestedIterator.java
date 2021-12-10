package g0301_0400.s0341_flatten_nested_list_iterator;

// #Medium #Top_Interview_Questions #Depth_First_Search #Tree #Stack #Design #Queue #Iterator

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

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
public class NestedIterator implements Iterator<Integer> {

    private Stack<ListIterator<NestedInteger>> stack;
    private ListIterator<NestedInteger> it;
    private NestedInteger next;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        it = nestedList.listIterator();
    }

    @Override
    public Integer next() {
        return next.getInteger();
    }

    @Override
    public boolean hasNext() {
        while (it.hasNext() || !stack.isEmpty()) {
            if (!it.hasNext()) { // end of list
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
