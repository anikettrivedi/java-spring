package dsalgo.linkedlist;

import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    void testAddAndPrint(){
        DoublyLinkedListInterface<String> dll = new DoublyLinkedListImpl<>();

        dll.insertFirst("abc");
        dll.print();
        dll.printFromEnd();

        dll.insertFirst("efg");
        dll.print();
        dll.printFromEnd();

        dll.insertLast("xyz");
        dll.print();
        dll.printFromEnd();
    }

}
