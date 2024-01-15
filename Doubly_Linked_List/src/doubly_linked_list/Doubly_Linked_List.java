package doubly_linked_list;

public class Doubly_Linked_List {

    private Node head;
    private Node tail;

    public Doubly_Linked_List() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void append(int value) {
        Node new_Node = new Node(value);
        if (head == null) {
            head = tail = new_Node;
            return;
        }
        tail.next = new_Node;
        new_Node.pre = tail;
        tail = new_Node;
    }

    public void addFirst(int value) {
        Node new_Node = new Node(value);
        if (head == null) {
            head = tail = new_Node;
            return;
        }
        head.pre = new_Node;
        new_Node.next = head;
        head = new_Node;
    }
    
    public void insert(int index, int value){
        Node cur = head;
        Node tmp = head.next;
        int count = 0;
        Node new_Node = new Node(value);
        if(head == null){
            return;
        }
        while (count != index - 1) {            
            cur = cur.next;
            tmp = tmp.next;
            count++;
        }
        cur.next = new_Node;
        new_Node.pre = cur;
        tmp.pre = new_Node;
        new_Node.next = tmp;
    }
    
    public void removeHead(){
        if (head == null) {
            return;
        } else {
            head = head.next;
            head.pre = null;
        }
    }
    
    public void removeLast() {
        if (head == null) {
            return;
        } else {
            tail = tail.pre;
            tail.next = null;
        }
    }
    
    public void removeByIndex(int index){
        Node cur = head;
        Node tmp = head.next;
        int count = 0;
        if(head == null){
            return;
        }
        while (count != index - 1 ) {            
            cur = cur.next;
            tmp = tmp.next;
            count++;
        }
        cur.next = cur.next.next;
        tmp.next.pre = cur;
    }
    
    public void addIfEven(int value) {
        if (value % 2 == 0) {
            append(value);
        }
    }

    public boolean checkPrime(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return value >= 2;
    }

    public void addIfPrime(int value) {
        if (checkPrime(value)) {
            append(value);
        }
    }

    public void addIfSquare(int value) {
        if (Math.sqrt(value) % 1 == 0){
            append(value);
        }
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }
    
    public void displayReverse(){
        Node cur = tail;
        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.pre;
        }
    }
}
