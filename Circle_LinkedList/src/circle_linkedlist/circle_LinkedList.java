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
public class circle_LinkedList {
    Node head = null;

    public circle_LinkedList() {
    }
    
    public void append(int value){
        Node cur = head;
        Node new_Node = new Node(value);
        if(head == null){
            head = new_Node;
            new_Node.next = head;
            return;
        }
        while (cur.next != head) {            
            cur = cur.next;
        }
        cur.next = new_Node;
        new_Node.next = head;
    }
    
    public void addFirst(int value){
        Node cur = head;
        Node new_Node = new Node(value);
        if(head == null){
            head = new_Node;
            new_Node.next = head;
            return;
        }
        while (cur.next != head) {            
            cur = cur.next;
        }
        new_Node.next = head;
        cur.next = new_Node;
        head = new_Node;
    }
    
    public void display(){
        Node cur = head;
        if(head == null){
            return;
        }
        System.out.println(cur);
        while (cur.next != head) { 
            System.out.println(cur.next);
            cur = cur.next;
        }
    }
}
