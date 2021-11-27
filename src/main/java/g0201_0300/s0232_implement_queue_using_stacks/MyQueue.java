package g0201_0300.s0232_implement_queue_using_stacks;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> left;
    Stack<Integer> right;
    /** Initialize your data structure here. */
    public MyQueue() {
        left = new Stack<Integer>();
        right = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!right.isEmpty()) {
            left.add(right.pop());
        }
        left.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!left.isEmpty()) {
            right.add(left.pop());
        }
        return right.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (!left.isEmpty()) {
            right.add(left.pop());
        }
        return right.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return right.isEmpty() && left.isEmpty();
    }
}
