import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

        @Test
        void normalCaseInt() {
            Stack<Integer> myList = new Stack<>();
            myList.push(5);
            myList.push(6);
            myList.push(7);
            String expected = "5,6,7,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void normalCaseDouble() {
            Stack<Double> myList = new Stack<>();
            myList.push(5.5);
            myList.push(6.4);
            myList.push(7.7);
            String expected = "5.5,6.4,7.7,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void normalCaseNonNumericOrder() {
            Stack<Double> myList = new Stack<>();
            myList.push(5.5);
            myList.push(7.7);
            myList.push(6.4);
            String expected = "5.5,7.7,6.4,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void blankCase() {
            Stack<Double> myList = new Stack<>();
            String expected = "empty";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void oneElement() {
            Stack<Double> myList = new Stack<>();
            myList.push(6.4);
            String expected = "6.4,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void manyElements() {
            Stack<Integer> myList = new Stack<>();
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
            Stack<Integer> myList = new Stack<>();
            myList.push(5);
            myList.push(-6);
            myList.push(7);
            String expected = "5,-6,7,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void zeroIncluded() {
            Stack<Integer> myList = new Stack<>();
            myList.push(5);
            myList.push(0);
            myList.push(7);
            String expected = "5,0,7,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void allZero() {
            Stack<Integer> myList = new Stack<>();
            myList.push(0);
            myList.push(0);
            myList.push(0);
            String expected = "0,0,0,";
            assertTrue(expected.equalsIgnoreCase(myList.printAllElements()));
        }

        @Test
        void popNormalInt() {
            Stack<Integer> myList = new Stack<>();
            myList.push(10);
            myList.push(20);
            myList.push(20);
            int expected = 20;
            assertEquals(expected, myList.pop());
        }

        @Test
        void popNormalDouble() {
            Stack<Double> myList = new Stack<>();
            myList.push(10.6);
            myList.push(20.4);
            myList.push(20.2);
            double expected = 20.2;
            assertEquals(expected, myList.pop());
        }

        @Test
        void popNegativeInt() {
            Stack<Integer> myList = new Stack<>();
            myList.push(-10);
            myList.push(20);
            myList.push(-20);
            int expected = -20;
            assertEquals(expected, myList.pop());
        }

        @Test
        void popEmpty() {
            Stack<Integer> myList = new Stack<>();
            Integer expected = null;
            assertEquals(expected, myList.pop());
        }

        @Test
        void popAll0() {
            Stack<Integer> myList = new Stack<>();
            myList.push(0);
            myList.push(0);
            myList.push(0);
            int expected = 0;
            assertEquals(expected, myList.pop());
        }

        //ASASA

        @Test
        void topNormalInt() {
            Stack<Integer> myList = new Stack<>();
            myList.push(10);
            myList.push(20);
            myList.push(20);
            int expected = 20;
            assertEquals(expected, myList.top());
        }

        @Test
        void topNormalDouble() {
            Stack<Double> myList = new Stack<>();
            myList.push(10.6);
            myList.push(20.4);
            myList.push(20.2);
            double expected = 20.2;
            assertEquals(expected, myList.top());
        }

        @Test
        void topNegativeInt() {
            Stack<Integer> myList = new Stack<>();
            myList.push(-10);
            myList.push(20);
            myList.push(-20);
            int expected = -20;
            assertEquals(expected, myList.top());
        }

        @Test
        void topEmpty() {
            Stack<Integer> myList = new Stack<>();
            Integer expected = null;
            assertEquals(expected, myList.top());
        }

        @Test
        void topAll0() {
            Stack<Integer> myList = new Stack<>();
            myList.push(0);
            myList.push(0);
            myList.push(0);
            int expected = 0;
            assertEquals(expected, myList.top());
        }
    }

