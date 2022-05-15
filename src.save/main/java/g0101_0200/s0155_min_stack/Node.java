package g0101_0200.s0155_min_stack;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Stack #Design #Acceptance_50.3%
// #Data_Structure_II_Day_14_Stack_Queue #Programming_Skills_II_Day_18
// #2022_02_23_Time_5_ms_(81.77%)_Space_48.5_MB_(20.01%)

public class Node {
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
