/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubly_linked_list;

public class main {
    public static void main(String[] args) {
        Doubly_Linked_List d = new Doubly_Linked_List();
        d.append(0);
        d.append(2);
        d.append(1);
        d.removeLast();
        d.display();
        System.out.println("After add Even");
        d.addIfEven(10);
        d.addIfEven(3);
        d.display();
        System.out.println("After add Prime");
        d.addIfPrime(1);
        d.addIfPrime(4);
        d.addIfPrime(2);
        d.display();
        System.out.println("After add Square");
        d.addIfSquare(1);
        d.addIfSquare(2);
        d.addIfSquare(4);
        d.addIfSquare(8);
        d.addIfSquare(9);
        d.display();
        System.out.println("head: "+ d.getHead() + "\ntail: " + d.getTail());
        System.out.println("Add insert and print reverse and remove by index");
        d.insert(2, 11);
        d.removeHead();
        d.removeByIndex(3);
        d.displayReverse();
    }
    
}
