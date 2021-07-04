package s0002.add.two.numbers;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString() {
        String result = String.valueOf(val);
        ListNode nextNode = next;
        while (nextNode != null) {
            result += ", " + String.valueOf(nextNode.val);
            nextNode = nextNode.next;
        }
        return result;
    }
}
