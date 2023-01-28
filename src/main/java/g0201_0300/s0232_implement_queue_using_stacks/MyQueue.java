package g0201_0300.s0232_implement_queue_using_stacks;

// #Easy #Stack #Design #Queue #Data_Structure_I_Day_9_Stack_Queue
// #Programming_Skills_I_Day_11_Containers_and_Libraries #Level_2_Day_16_Design
// #2022_07_04_Time_1_ms_(67.21%)_Space_41.8_MB_(58.63%)

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

/*
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
