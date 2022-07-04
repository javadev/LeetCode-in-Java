package g0201_0300.s0225_implement_stack_using_queues;

// #Easy #Stack #Design #Queue #2022_07_04_Time_0_ms_(100.00%)_Space_41.7_MB_(54.75%)

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> queueOne;
    private Queue<Integer> queueTwo;
    private int top;

    // Initialize your data structure here.
    public MyStack() {
        queueOne = new LinkedList<>();
        queueTwo = new LinkedList<>();
        top = 0;
    }

    // Push element x onto stack.
    public void push(int x) {
        queueOne.add(x);
        top = x;
    }

    // Removes the element on top of the stack and returns that element.
    public int pop() {
        while (queueOne.size() > 1) {
            int val = queueOne.remove();
            top = val;
            queueTwo.add(val);
        }
        int popValue = queueOne.remove();
        queueOne.addAll(queueTwo);
        queueTwo.clear();
        return popValue;
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Returns whether the stack is empty.
    public boolean empty() {
        return queueOne.isEmpty();
    }
}
