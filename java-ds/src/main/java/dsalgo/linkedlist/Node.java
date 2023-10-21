package dsalgo.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Node <T>{
    private T value;
    private Node<T> next;
}
