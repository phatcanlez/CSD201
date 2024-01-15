/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_linkedlist;

/**
 *
 * @author Admin
 */
public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
    
}
