package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testInsertHead() {
        LinkedList list = new LinkedList();
        list.insertHead(1);
        assertEquals(1, list.getHead());
        list.insertHead(2);
        assertEquals(2, list.getHead());
	}

	@Test
	void testGetTail() {
        LinkedList list = new LinkedList();
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        LinkedList tail = list.getTail();
        assertNotNull(tail);
        assertEquals(2, tail.getHead());
        tail = tail.getTail();
        assertNotNull(tail);
        assertEquals(1, tail.getHead());
        tail = tail.getTail();
        assertTrue(tail.isEmpty());
    }

	@Test
	void testIsEmpty() {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
        list.insertHead(1);
        assertFalse(list.isEmpty());
    }

	@Test
	void testIterator() {
        LinkedList list = new LinkedList();
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        LinkedList.Iterator iterator = list.Iterator();
        assertNotNull(iterator);
        int[] expectedValues = {3, 2, 1};
        int index = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedValues[index], iterator.next());
            index++;
        }
    }

}
