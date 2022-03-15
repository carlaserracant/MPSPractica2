package org.Carlas.DequeNode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Deque;

class DequeNodeTest<T> {
    private DequeNode deque;
    private T item;
    private DequeNode<T> next;
    private DequeNode<T> previous;
    @BeforeEach
    private void setup() {
        deque = new DequeNode(item, next, previous);
    }

    @AfterEach
    private void finish() {
        deque = null;
    }

    @Test
    public void testComputeIfNodeIsTheFirstNode() {
        
    }


}