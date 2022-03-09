package g1101_1200.s1130_minimum_cost_tree_from_leaf_values;

// #Medium #Dynamic_Programming #Greedy #Stack #Monotonic_Stack

import java.util.Stack;

public class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE);
        for (int num : arr) {
            // do until the present num is bigger than nums in stack (we need to maintain the
            // increasing order in stack (bottom to up))
            while (st.peek() <= num) {
                // find two smallest leafs (integer on top of stack is smallest and at bottom is
                // largest UPTIL NOW)
                int smallestLeaf = st.pop();
                int smallerLeaf =
                        Math.min(
                                st.peek(),
                                num); // the next smaller leaf could either be present num or the
                // num on top of stack after above pop()
                res += smallestLeaf * smallerLeaf; // multiply minimum leafs to reduce the SUM
            }

            st.push(num);
        }
        // if the size is 2 or less we do not to worry because we have already used it in above step
        // since 1st num we added was Integer.MAX, and we do not need to use that, so just do this
        // step if the size > 2(basically there are atleast 2 elements from the array)
        while (st.size() > 2) {
            int smallestLeaf = st.pop();
            int smallerLeaf = st.peek();
            res += smallestLeaf * smallerLeaf;
        }
        return res;
    }
}
