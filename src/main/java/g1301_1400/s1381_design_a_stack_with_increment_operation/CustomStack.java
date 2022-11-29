package g1301_1400.s1381_design_a_stack_with_increment_operation;

// #Medium #Array #Stack #Design #2022_03_22_Time_8_ms_(62.23%)_Space_50.1_MB_(60.11%)

public class CustomStack {
    private int top;
    private int maxSize;
    private int[] stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    public void push(int x) {
        if (top == maxSize) {
            return;
        }
        stack[top] = x;
        top++;
    }

    public int pop() {
        if (top == 0) {
            return -1;
        }
        int popValue = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        return popValue;
    }

    public void increment(int k, int val) {
        if (top == 0 || k == 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            if (i == top) {
                break;
            }
            stack[i] += val;
        }
    }
}

/*
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
