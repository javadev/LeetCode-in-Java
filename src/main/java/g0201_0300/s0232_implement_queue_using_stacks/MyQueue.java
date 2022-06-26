package g0201_0300.s0232_implement_queue_using_stacks;

// #Easy #Stack #Design #Queue #Data_Structure_I_Day_9_Stack_Queue
// #Programming_Skills_I_Day_11_Containers_and_Libraries
// #2022_03_14_Time_1_ms_(56.63%)_Space_41.9_MB_(36.65%)

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    private Deque<Integer> left;
    private Deque<Integer> right;
    // Initialize your data structure here.
    public MyQueue() {
        left = new ArrayDeque<>();
        right = new ArrayDeque<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        while (!right.isEmpty()) {
            left.add(right.pop());
        }
        left.add(x);
    }

    // Removes the element from in front of queue and returns that element.
    public int pop() {
        while (!left.isEmpty()) {
            right.add(left.pop());
        }
        return right.pop();
    }

    // Get the front element.
    public int peek() {
        while (!left.isEmpty()) {
            right.add(left.pop());
        }
        return right.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return right.isEmpty() && left.isEmpty();
    }
}
