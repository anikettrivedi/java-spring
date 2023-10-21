package dsalgo.linkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class DoubleEndedNode<T>{
    private T value;
    private DoubleEndedNode<T> next;
    private DoubleEndedNode<T> prev;
}
