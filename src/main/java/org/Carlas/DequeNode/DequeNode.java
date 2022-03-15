package org.Carlas.DequeNode;

public class DequeNode<T> {
    private T item ;
    private T next ;
    private T previous ;

    public T getItem() {
        return item;
    }

    public T getNext() {
        return next;
    }

    public T getPrevious() {
        return previous;
    }

    public DequeNode(T item, T next, T previous) {
        this.item = item ;
        this.next = next ;
        this.previous = previous ;
    }

    public boolean isFirstNode() {
        return previous == null ;
    }

    public boolean isLastNode() {
        return next == null ;
    }

    public boolean isNotATerminalNode() {
        return (!isFirstNode() && !isLastNode()) ;
    }
}
