package g0101_0200.s0155_min_stack;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Stack #Design
// #Data_Structure_II_Day_14_Stack_Queue #Programming_Skills_II_Day_18 #Level_2_Day_16_Design
// #Udemy_Design #Big_O_Time_O(1)_Space_O(N) #2022_06_25_Time_3_ms_(100.00%)_Space_44.3_MB_(85.39%)

public class MinStack {
    private static class Node {
        int min;
        int data;
        Node nextNode;
        Node previousNode;

        public Node(int min, int data, Node previousNode, Node nextNode) {
            this.min = min;
            this.data = data;
            this.previousNode = previousNode;
            this.nextNode = nextNode;
        }
    }

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
