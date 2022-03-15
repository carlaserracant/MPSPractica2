package org.Carlas.DequeNode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class DequeNodeTest<T> {
    private DequeNode deque;
    private T item;
    private T next;
    private T previous;
    @BeforeEach
    private void setup() {
        deque = new DequeNode(item, next, previous);
    }

    @AfterEach
    private void finish() {
        deque = null;
    }  


}