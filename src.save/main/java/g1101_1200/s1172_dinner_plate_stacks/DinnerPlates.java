package g1101_1200.s1172_dinner_plate_stacks;

// #Hard #Hash_Table #Stack #Design #Heap_Priority_Queue
// #2022_03_05_Time_63_ms_(96.74%)_Space_121.6_MB_(92.39%)

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class DinnerPlates {
    private final List<Stack<Integer>> stacks;
    private int stackCap;
    private TreeSet<Integer> leftIndex;

    public DinnerPlates(int capacity) {
        stacks = new ArrayList<>();
        stackCap = capacity;
        leftIndex = new TreeSet<>();
    }

    public void push(int val) {
        if (!leftIndex.isEmpty()) {
            int i = leftIndex.first();
            stacks.get(i).push(val);
            if (stacks.get(i).size() == stackCap) {
                leftIndex.remove(i);
            }
            return;
        }
        if (stacks.isEmpty() || stacks.get(stacks.size() - 1).size() == stackCap) {
            Stack<Integer> newStack = new Stack<>();
            stacks.add(newStack);
        }
        stacks.get(stacks.size() - 1).push(val);
    }

    public int pop() {
        if (stacks.isEmpty()) {
            return -1;
        }
        while (stacks.get(stacks.size() - 1).isEmpty()) {
            leftIndex.remove(stacks.size() - 1);
            stacks.remove(stacks.size() - 1);
        }
        int val = stacks.get(stacks.size() - 1).pop();
        if (stacks.get(stacks.size() - 1).isEmpty()) {
            leftIndex.remove(stacks.size() - 1);
            stacks.remove(stacks.size() - 1);
        }
        return val;
    }

    public int popAtStack(int index) {
        if (stacks.size() - 1 >= index) {
            int val = -1;
            if (!stacks.get(index).isEmpty()) {
                val = stacks.get(index).pop();
            }
            if (stacks.get(index).isEmpty() && index == stacks.size() - 1) {
                leftIndex.remove(stacks.size() - 1);
                stacks.remove(index);
                return val;
            }
            leftIndex.add(index);
            return val;
        }
        return -1;
    }
}
