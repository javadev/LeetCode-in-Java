package g0101_0200.s0155_min_stack_easy_top_100_liked_questions_top_interview_questions_stack_design;

public class MinStack {
    private Node currentNode;

    // initialize your data structure here.
    public MinStack() {
        // no initialization needed.
    }

    public void push(int val) {
        if (currentNode == null) {
            currentNode = new Node(val, val, null, null);
        } else {
            currentNode.nextNode = new Node(Math.min(currentNode.min, val), val, currentNode, null);
            currentNode = currentNode.nextNode;
        }
    }

    public void pop() {
        currentNode = currentNode.previousNode;
    }

    public int top() {
        return currentNode.data;
    }

    public int getMin() {
        return currentNode.min;
    }
}

/*
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
