
package circle_linkedlist;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle_LinkedList c = new circle_LinkedList();
        c.append(1);
        c.append(2);
        c.append(3);
        c.append(4);
        c.append(5);
        c.display();
        System.out.println("add first");
        c.addFirst(0);
        c.display();
    }
    
}
