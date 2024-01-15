package node;

public class singleLinkestList {

    private Node head;

    public singleLinkestList() {
        this.head = null;
    }

    public void append(int new_data) {
        Node new_Node = new Node(new_data);
        if (head == null) {
            head = new_Node;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new_Node;
        return;
    }

    public void addFirst(int new_data) {
        Node new_Node = new Node(new_data);
        if (head == null) {
            head = new_Node;
            return;
        } else {
            new_Node.next = head;
            head = new_Node;
        }
    }

    public void deleteLast() {
        Node cur = head;
        if (this.head.next == null) {
            return;
        } else {
            while (cur.next.next != null) {
                cur = cur.next;
            }
            cur.next = null;
        }
    }

    public void deleteFirst() {
        if (this.head.next == null) {
            return;
        } else {
            head = head.next;
        }
    }
    
    public int size() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public int getIndex(int index){
        Node tmp = head;
        if (index > size() || index < 0) {
            return -1;
        }
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                return tmp.data;
            }
            tmp = tmp.next;
        }
        return -1;
    }
    
    public void insertIndex(int index, int value){
        Node cur = head;
        Node new_Node = new Node(value);
        if (index > size() || index < 0) {
            return;
        }
        for (int i = 0; i < size(); i++) {
            if (i == index - 1) {
                new_Node.next = cur.next;
                cur.next = new_Node;
                return;
            }
            cur = cur.next;
        }
    }
    
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}
