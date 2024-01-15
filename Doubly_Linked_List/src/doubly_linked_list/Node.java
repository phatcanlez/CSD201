
package doubly_linked_list;

public class Node {
    int value;
    Node pre;
    Node next;

    public Node(int value) {
        this.value = value;
        this.pre = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
    
}
