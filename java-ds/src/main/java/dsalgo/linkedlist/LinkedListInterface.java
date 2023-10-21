package dsalgo.linkedlist;

public interface LinkedListInterface<T> {

    // insertions
    void insert(T t);
    void insertFirst(T t);
    void insertLast(T t);

    // searching
    T getFirst();
    T getLast();

    // traversal
    void print();

    // other operations can be

    // -- insertion operations
    // insertAtIndex

    // -- search operations
    // getAtIndex
    // getIndexOf

    // -- deletions
    // delete
    // deleteFirst
    // deleteLast
    // deleteAtIndex

    // -- others
    // getSize
    // etc
}
