import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedListTest {

    @Test
    void normalSituationInteger() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(5);
        myList.add(9);
        myList.add(12);
        String expected="5,9,12,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void outOfOrderSituationInteger() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(2);
        myList.add(23);
        myList.add(12);
        String expected="2,12,23,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void invertedOrderSituationInteger() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(43);
        myList.add(23);
        myList.add(2);
        String expected="2,23,43,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void normalSituationDouble() {
        SortedLinkedList<Double> myList=new SortedLinkedList<>();
        myList.add(5.2);
        myList.add(9.7);
        myList.add(12.12);
        String expected="5.2,9.7,12.12,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void outOfOrderSituationDouble() {
        SortedLinkedList<Double> myList=new SortedLinkedList<>();
        myList.add(2.5);
        myList.add(23.2);
        myList.add(12.45);
        String expected="2.5,12.45,23.2,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void invertedOrderSituationDouble() {
        SortedLinkedList<Double> myList=new SortedLinkedList<>();
        myList.add(43.5);
        myList.add(23.2);
        myList.add(2.8);
        String expected="2.8,23.2,43.5,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void emptySituation() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        String expected="empty";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void negativeValue() {
        SortedLinkedList<Double> myList=new SortedLinkedList<>();
        myList.add(43.5);
        myList.add(-23.2);
        myList.add(2.8);
        String expected="-23.2,2.8,43.5,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void negativeMultipleValue() {
        SortedLinkedList<Double> myList=new SortedLinkedList<>();
        myList.add(43.5);
        myList.add(-23.2);
        myList.add(-2.8);
        String expected="-23.2,-2.8,43.5,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void negativeAllValue() {
        SortedLinkedList<Double> myList=new SortedLinkedList<>();
        myList.add(-43.5);
        myList.add(-23.2);
        myList.add(-2.8);
        String expected="-43.5,-23.2,-2.8,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void all0Situation() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(0);
        myList.add(0);
        myList.add(0);
        String expected="0,0,0,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }

    @Test
    void duplicatesSituation() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(10);
        myList.add(12);
        myList.add(10);
        String expected="10,10,12,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllValues()));
    }


    @Test
    void searchNormTrue() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(10);
        myList.add(12);
        myList.add(10);
        boolean expected=true;
        assertTrue(expected==myList.Search(12));
    }

    @Test
    void searchNormFalse() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(10);
        myList.add(12);
        myList.add(10);
        boolean expected=false;
        assertTrue(expected==myList.Search(7));
    }

    @Test
    void searchEmpty() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        boolean expected=false;
        assertTrue(expected==myList.Search(7));
    }

    @Test
    void searchNegative() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(-10);
        myList.add(12);
        myList.add(-40);
        boolean expected=true;
        assertTrue(expected==myList.Search(-40));
    }

    @Test
    void searchAdditiveInverse() {
        SortedLinkedList<Integer> myList=new SortedLinkedList<>();
        myList.add(-10);
        myList.add(12);
        myList.add(-40);
        boolean expected=false;
        assertTrue(expected==myList.Search(40));
    }
}
