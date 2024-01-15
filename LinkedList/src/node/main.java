
package node;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkestList s = new singleLinkestList();
        s.append(0);
        s.append(1);
        s.append(2);
        s.append(5);
        s.append(3);
        s.display();
        System.out.println("after add first");
        s.addFirst(4);
        s.display();
        System.out.println("after delete last");
        s.deleteLast();
        s.display();
        System.out.println("after delete first");
        s.deleteFirst();
        s.display();
        System.out.println("size: "+s.size());
        s.display();
        System.out.println("after get index");
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        if(s.getIndex(index) == -1){
            System.out.println("Can't find");
        }else{
            System.out.println(index + " is " + s.getIndex(index));
        }
        s.display();
        System.out.println("after insert");
        System.out.println("Enter index");
        index = sc.nextInt();
        System.out.println("Enter value");
        int value = sc.nextInt();
        System.out.println("");
        s.insertIndex(index, value);
        s.display();
    }
}
