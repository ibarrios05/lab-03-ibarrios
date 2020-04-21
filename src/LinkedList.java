import java.nio.charset.IllegalCharsetNameException;

public class LinkedList<T extends Comparable<T>>{

    private LinkedListNode<T> head;

    public LinkedList(){
        this.head=null;
    }

    /**Function to return the size of the List
     *
     * @return int representning the size
     */
    public synchronized int size(){
        System.out.println("I am in the size method for LinkedList");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Size interrupted");
        }
        if (head==null){
            return 0;
        }
        //Iteratively count each element in the structure
        int count=0;
        LinkedListNode<T> current=head;
        count++;
        while(current.getNext()!=null){
            count++;
            current=current.getNext();
        }

        return count;
    }

    /**
     * Add a value into our linked list
     * @param value
     * @param index
     * @return index where added, null if not added
     */
    public synchronized void insert(T value, int index) throws InvalidIndexException {
        System.out.println("I am in the insert method for LinkedList "+value);
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to insert");
        }

        if(index<0){
            throw new InvalidIndexException();
        }
        //Base case
        if (head == null || index == 0) {
            this.head = new LinkedListNode<T>(value, head);
        } else {
            //Iteratively go through and check each node to make sure that the next isn't at the end of the list
            int count = 1;
            LinkedListNode current = head;
            while (current.getNext() != null && count < index) {
                count++;
                current = current.getNext();
            }
            current.setNext(new LinkedListNode<>(value, current.getNext()));


        }
    }


    /**
     *Function
     * @param index the index of the desired element
     * @return returns the value of the element at the given index(if it exists)
     * @throws InvalidIndexException
     */
    public synchronized T get(int index) throws InvalidIndexException {
        System.out.println("I am in the get method for LinkedList");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to get");
        }

        if(index<0 || head==null || index>this.size()){
            throw new InvalidIndexException();
        }
        int count = 0;
        LinkedListNode<T> current = head;
        while (current.getNext() != null && count < index) {
            count++;
            current = current.getNext();
        }
        return  current.getValue();
    }

    /**
     * Function to return a list of all of the elements in order
     * @return a string of all elements
     */
    public synchronized String printAllElements(){
//        System.out.println("I am in the printAllElements method");
//        try{
//            Thread.sleep(1000);
//        } catch (Exception e){
//            System.out.println("Failed to print all elements");
//        }

        if (head==null){
            return "empty";
        }
        LinkedListNode current=head;
        String rtnString= current.getValue()+",";
        while(current.getNext()!=null){
            current=current.getNext();
            rtnString+=current.getValue()+",";
        }

        return rtnString;



    }

    public static class InvalidIndexException extends Exception{

    }
}

