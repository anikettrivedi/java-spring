package dsalgo.linkedlist;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DoublyLinkedListImpl<T> implements DoublyLinkedListInterface<T> {

    DoubleEndedNode<T> head = null;
    DoubleEndedNode<T> tail = null;

    @Override
    public void insert(T t) {
        insertFirst(t);
    }

    @Override
    public void insertFirst(T t) {
        DoubleEndedNode<T> node = new DoubleEndedNode<>();
        node.setValue(t);
        if (head == null && tail == null) {
            // in case of empty DLL
            node.setNext(null);
            node.setPrev(null);
            head = node;
            tail = node;
        } else {
            head.setPrev(node);
            node.setNext(head);
            node.setPrev(null);
            head = node;
        }
    }

    @Override
    public void insertLast(T t) {
        DoubleEndedNode<T> node = new DoubleEndedNode<>();
        node.setValue(t);
        if (head == null && tail == null) {
            // in case of empty DLL
            node.setNext(null);
            node.setPrev(null);
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            node.setNext(null);
            tail = node;
        }
    }

    @Override
    public T getFirst() {
        return head.getValue();
    }

    @Override
    public T getLast() {
        return tail.getValue();
    }

    @Override
    public void print() {
        DoubleEndedNode<T> pointer = head;
        while (pointer.getNext() != null){
            System.out.printf("%s -> ", pointer.getValue());
            pointer = pointer.getNext();
        }
        System.out.printf("%s -> end%n", pointer.getValue());
    }

    @Override
    public void printFromEnd() {
        DoubleEndedNode<T> pointer = tail;
        while (pointer.getPrev() != null) {
            System.out.printf("%s -> ", pointer.getValue());
            pointer = pointer.getPrev();
        }
        System.out.printf("%s -> end%n", pointer.getValue());
    }
}
