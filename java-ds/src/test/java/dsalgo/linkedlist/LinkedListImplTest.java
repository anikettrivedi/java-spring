package dsalgo.linkedlist;

import org.junit.jupiter.api.Test;

public class LinkedListImplTest {

    @Test
    void testAddAndPrint() {
        LinkedListInterface<Integer> ll = new LinkedListImpl<>();

        ll.insertFirst(10);
        ll.print();

        ll.insertFirst(11);
        ll.print();

        ll.insertLast(12);
        ll.print();

        ll.insertFirst(112);
        ll.print();

        ll.insertLast(100);
        ll.print();
    }

}
