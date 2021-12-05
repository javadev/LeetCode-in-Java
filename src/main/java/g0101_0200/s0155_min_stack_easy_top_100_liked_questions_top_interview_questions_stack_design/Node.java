package g0101_0200.s0155_min_stack_easy_top_100_liked_questions_top_interview_questions_stack_design;

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
