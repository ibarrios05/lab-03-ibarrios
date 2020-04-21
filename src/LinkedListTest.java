import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void normalSituationIntegers() throws LinkedList.InvalidIndexException {
       LinkedList<Integer> myTestList= new LinkedList<Integer>();
        myTestList.insert(1,0);
        myTestList.insert(2,1);
        myTestList.insert(3,2);
        String expectedString="1,2,3,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void emptyList() throws LinkedList.InvalidIndexException {
        LinkedList myTestList= new LinkedList<Integer>();
        String expectedString="empty";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void doubleList() throws LinkedList.InvalidIndexException {
        LinkedList<Double> myTestList= new LinkedList<>();
        myTestList.insert(1.6,0);
        myTestList.insert(2.4,1);
        myTestList.insert(3.7,2);
        String expectedString="1.6,2.4,3.7,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void inputNegativeIndex() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<Integer>();
        try{
            myTestList.insert(56,-12);

            fail("expected InvalidIndexException");

        } catch(LinkedList.InvalidIndexException e){
            //Do nothing if we reached here we failed when expected
        }
    }

    @org.junit.jupiter.api.Test
    void all0List() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(0,0);
        myTestList.insert(0,1);
        myTestList.insert(0,2);
        String expectedString="0,0,0,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void bigList() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(34,1);
        myTestList.insert(52,2);
        myTestList.insert(12,3);
        myTestList.insert(54,4);
        myTestList.insert(66,5);
        myTestList.insert(76,6);
        myTestList.insert(4,7);
        myTestList.insert(7,8);
        String expectedString="12,34,52,12,54,66,76,4,7,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void varyingIndexList() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(56,2);
        myTestList.insert(798,1);
        String expectedString="12,798,56,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }
    @org.junit.jupiter.api.Test
    void veryWeirdIndexList() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(56,12);
        myTestList.insert(798,998);
        myTestList.insert(12,100);
        String expectedString="56,798,12,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void insertingMiddleIndexList() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(56,0);
        myTestList.insert(798,1);
        myTestList.insert(12,1);
        String expectedString="56,12,798,";
        assertTrue(myTestList.printAllElements().equalsIgnoreCase(expectedString));
    }

    @org.junit.jupiter.api.Test
    void getNormal() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(18,1);
        myTestList.insert(20,2);
        Integer expected=18;
        assertSame(expected, myTestList.get(1));
    }

    @org.junit.jupiter.api.Test
    void getFirst() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(18,1);
        myTestList.insert(20,2);
        Integer expected=12;
        assertSame(expected, myTestList.get(0));
    }

    @org.junit.jupiter.api.Test
    void invalidIndexNegative() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(18,1);
        myTestList.insert(20,2);
        try{
            myTestList.get(-4);

            fail("expected InvalidIndexException");

        } catch(LinkedList.InvalidIndexException e){
            //Do nothing if we reached here we failed when expected
        }
    }

    @org.junit.jupiter.api.Test
    void invalidIndexGreaterThanSize() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(18,1);
        myTestList.insert(20,2);
        try{
            myTestList.get(4);

            fail("expected InvalidIndexException");

        } catch(LinkedList.InvalidIndexException e){
            //Do nothing if we reached here we failed when expected
        }
    }

    @org.junit.jupiter.api.Test
    void sizeNormal() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(18,1);
        myTestList.insert(20,2);
        Integer expected=3;
        assertEquals(expected, myTestList.size());
    }

    @org.junit.jupiter.api.Test
    void sizeEmpty() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        Integer expected=0;
        assertEquals(expected, myTestList.size());
    }

    @org.junit.jupiter.api.Test
    void sizeBig() throws LinkedList.InvalidIndexException {
        LinkedList<Integer> myTestList= new LinkedList<>();
        myTestList.insert(12,0);
        myTestList.insert(34,1);
        myTestList.insert(52,2);
        myTestList.insert(12,3);
        myTestList.insert(54,4);
        myTestList.insert(66,5);
        myTestList.insert(76,6);
        myTestList.insert(4,7);
        myTestList.insert(7,8);
        Integer expected=9;
        assertEquals(expected, myTestList.size());
    }
}


