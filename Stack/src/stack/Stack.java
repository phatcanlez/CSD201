package stack;

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node new_Node = new Node(data);
        if (top == null) {
            top = new_Node;
            return;
        }
        new_Node.next = top;
        top = new_Node;
    }

    public T pop() {
        if(isEmpty()){
            return null;
        }
        Node tmp = top;
        top = top.next;
        return (T) tmp.data;
    }

    public T peek() {
        if(isEmpty()){
            return null;
        }
        return (T) top.data;
    }
}
    

