package g1401_1500.s1472_design_browser_history;

// #Medium #Array #Stack #Design #Linked_List #Data_Stream #Doubly_Linked_List
// #2022_03_29_Time_76_ms_(82.33%)_Space_86.4_MB_(14.42%)

public class BrowserHistory {

    static class Node {
        Node prev;
        Node next;
        String url;

        Node(String url) {
            this.url = url;
            this.prev = null;
            this.next = null;
        }
    }

    private Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = curr.next;
    }

    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
    }
}
