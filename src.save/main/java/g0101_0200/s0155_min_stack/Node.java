package g0101_0200.s0155_min_stack;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Stack #Design
// #Data_Structure_II_Day_14_Stack_Queue #Programming_Skills_II_Day_18
// #2022_06_25_Time_3_ms_(100.00%)_Space_44.3_MB_(85.39%)

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
