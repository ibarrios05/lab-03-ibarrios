import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {


    @Test
    void normalSituation() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.insert(5, 0);
        myList.insert(6, 1);
        myList.insert(7, 2);
        String expected = "5,6,7,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void weirdIndexSituation() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.insert(5, 0);
        myList.insert(6, 2);
        myList.insert(7, 1);
        String expected = "5,7,6,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void emptySituation() {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        String expected = "empty";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void negativeIndex() {
        LinkedList<Integer> myTestList = new LinkedList<Integer>();
        try {
            myTestList.insert(56, -12);

            fail("expected InvalidIndexException");

        } catch (LinkedList.InvalidIndexException e) {
            //Do nothing if we reached here we failed when expected
        }
    }

    @Test
    void doubleSituation() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Double> myList = new DoublyLinkedList<>();
        myList.insert(5.5, 0);
        myList.insert(6.7, 2);
        myList.insert(7.7, 1);
        String expected = "5.5,7.7,6.7,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void sizeNorm() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.insert(5, 0);
        myList.insert(6, 2);
        myList.insert(7, 1);
        int expected = 3;
        assertTrue(expected == myList.size());
    }

    @Test
    void sizeEmpty() {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        int expected = 0;
        assertTrue(expected == myList.size());
    }

    @Test
    void getNormal() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.insert(12, 0);
        myList.insert(18, 1);
        myList.insert(20, 2);
        Integer expected = 18;
        assertSame(expected, myList.get(1));
    }

    @Test
    void getFirst() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.insert(12, 0);
        myList.insert(18, 1);
        myList.insert(20, 2);
        Integer expected = 12;
        assertSame(expected, myList.get(0));
    }

    @Test
    void invalidIndex() throws DoublyLinkedList.InvalidIndexException {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.insert(12, 0);
        myList.insert(18, 1);
        myList.insert(20, 2);
        try {
            myList.get(-4);

            fail("expected InvalidIndexException");

        } catch (DoublyLinkedList.InvalidIndexException e) {
            //Do nothing if we reached here we failed when expected
        }
    }
}