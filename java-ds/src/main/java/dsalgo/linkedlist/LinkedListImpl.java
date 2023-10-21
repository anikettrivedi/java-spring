package dsalgo.linkedlist;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LinkedListImpl<T> implements LinkedListInterface<T>{

    Node<T> head = null;

    @Override
    public void insert(T t) {
        insertFirst(t);
    }

    @Override
    public void insertFirst(T t) {
        Node<T> node = new Node<>();
        node.setValue(t);
        node.setNext(head);
        head = node;
    }

    @Override
    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node<T> node = new Node<>();
        node.setValue(t);
        node.setNext(null);

        Node<T> tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(node);
    }

    @Override
    public T getFirst() {
        return head.getValue();
    }

    @Override
    public T getLast() {
        Node<T> tail = head;
        while (tail.getNext()!=null){
            tail = tail.getNext();
        }
        return tail.getValue();
    }

    @Override
    public void print() {
        Node<T> pointer = head;
        while (pointer.getNext() != null){
            System.out.printf("%s -> ", pointer.getValue());
            pointer = pointer.getNext();
        }
        System.out.printf("%s -> end%n", pointer.getValue());
    }
}
