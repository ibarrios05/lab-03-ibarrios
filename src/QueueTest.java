import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void normalCaseInt() {
        Queue<Integer> myList = new Queue<>();
        myList.push(5);
        myList.push(6);
        myList.push(7);
        String expected = "5,6,7,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void normalCaseDouble() {
        Queue<Double> myList = new Queue<>();
        myList.push(5.5);
        myList.push(6.4);
        myList.push(7.7);
        String expected = "5.5,6.4,7.7,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void normalCaseNonNumericOrder() {
        Queue<Double> myList = new Queue<>();
        myList.push(5.5);
        myList.push(7.7);
        myList.push(6.4);
        String expected = "5.5,7.7,6.4,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void blankCase() {
        Queue<Double> myList = new Queue<>();
        String expected = "empty";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void oneElement() {
        Queue<Double> myList = new Queue<>();
        myList.push(6.4);
        String expected = "6.4,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void manyElements() {
        Queue<Integer> myList = new Queue<>();
        myList.push(6);
        myList.push(8);
        myList.push(9);
        myList.push(2);
        myList.push(12);
        myList.push(18);
        myList.push(239);
        myList.push(2023);
        myList.push(16);
        myList.push(8);
        myList.push(2329);
        myList.push(12);
        String expected = "6,8,9,2,12,18,239,2023,16,8,2329,12,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void negativeCaseInt() {
        Queue<Integer> myList = new Queue<>();
        myList.push(5);
        myList.push(-6);
        myList.push(7);
        String expected = "5,-6,7,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void zeroIncluded() {
        Queue<Integer> myList = new Queue<>();
        myList.push(5);
        myList.push(0);
        myList.push(7);
        String expected = "5,0,7,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void allZero() {
        Queue<Integer> myList = new Queue<>();
        myList.push(0);
        myList.push(0);
        myList.push(0);
        String expected = "0,0,0,";
        assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
    }

    @Test
    void popNormalInt() {
        Queue<Integer> myList = new Queue<>();
        myList.push(10);
        myList.push(20);
        myList.push(20);
        int expected = 10;
        assertEquals(expected, myList.pop());
    }

    @Test
    void popNormalDouble() {
        Queue<Double> myList = new Queue<>();
        myList.push(10.6);
        myList.push(20.4);
        myList.push(20.2);
        double expected = 10.6;
        assertEquals(expected, myList.pop());
    }

    @Test
    void popNegativeInt() {
        Queue<Integer> myList = new Queue<>();
        myList.push(-10);
        myList.push(20);
        myList.push(-20);
        int expected = -10;
        assertEquals(expected, myList.pop());
    }

    @Test
    void popEmpty() {
        Queue<Integer> myList = new Queue<>();
        Integer expected = null;
        assertEquals(expected, myList.pop());
    }

    @Test
    void popAll0() {
        Queue<Integer> myList = new Queue<>();
        myList.push(0);
        myList.push(0);
        myList.push(0);
        int expected = 0;
        assertEquals(expected, myList.pop());
    }

  //ASASA

    @Test
    void topNormalInt() {
        Queue<Integer> myList = new Queue<>();
        myList.push(10);
        myList.push(20);
        myList.push(20);
        int expected = 10;
        assertEquals(expected, myList.top());
    }

    @Test
    void topNormalDouble() {
        Queue<Double> myList = new Queue<>();
        myList.push(10.6);
        myList.push(20.4);
        myList.push(20.2);
        double expected = 10.6;
        assertEquals(expected, myList.top());
    }

    @Test
    void topNegativeInt() {
        Queue<Integer> myList = new Queue<>();
        myList.push(-10);
        myList.push(20);
        myList.push(-20);
        int expected = -10;
        assertEquals(expected, myList.top());
    }

    @Test
    void topEmpty() {
        Queue<Integer> myList = new Queue<>();
        Integer expected = null;
        assertEquals(expected, myList.top());
    }

    @Test
    void topAll0() {
        Queue<Integer> myList = new Queue<>();
        myList.push(0);
        myList.push(0);
        myList.push(0);
        int expected = 0;
        assertEquals(expected, myList.top());
    }
}