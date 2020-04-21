public class DoublyLinkedList<T extends Comparable<T>> {

    private DoublyLinkedListNode<T> head;

    public DoublyLinkedList() {
        head = null;
    }

    /**
     * Returns the size
     *
     * @return int representing the size
     */
    public synchronized int size() {
        System.out.println("I am in the size method for DoublyLinkedList");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Size interrupted");
        }

        if (head == null) {
            return 0;
        }
        int count = 0;
        DoublyLinkedListNode<T> current = head;
        count++;
        while (current.getNext() != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    /**
     * Function to insert value
     *
     * @param value
     * @param index
     */
    public synchronized void insert(T value, int index) throws InvalidIndexException {
        System.out.println("I am in the insert method for DoublyLinkedList "+value);
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to insert");
        }

        if(index<0){
            throw new InvalidIndexException();
        }
        //If there is nothing in the list or an index is 0, create a new node that will be our new node
        if (head == null || index == 0) {
            head = new DoublyLinkedListNode<>(value, head, null);
        } else{
            // Since we know at least one node is created
            // we can iterate and only stop if we get to the index or the end of the list
            //Once we break out of th eloop make the next node
            int count = 1;
        DoublyLinkedListNode<T> current = head;
        while (current.getNext() != null && count < index) {
            count++;
            current = current.getNext();
        }
        current.setNext(new DoublyLinkedListNode<T>(value, current.getNext(), current.getPrevious()));

    }

}


    /**
     * Function to return all values
     * @return a string that contains all of the values of the elements in order of the linked list
     */
    public synchronized String printAllValues(){
        if (head==null){
            return "empty";
        }
        //iteratively add each element to a return a string
        int count=0;
        DoublyLinkedListNode current=head;
        count++;
        String rtnString= current.getValue()+",";
        while(current.getNext()!=null){
            count++;
            current=current.getNext();
            rtnString+=current.getValue()+",";
        }

        return rtnString;

    }

    /**
     *
     * @param index the index of the desired element
     * @return returns the value of the element at the given index(if it exists)
     * @throws InvalidIndexException
     */
    public synchronized T get(int index) throws InvalidIndexException {
        System.out.println("I am in the get method for DoublyLinkedList");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to get");
        }

        if(index<0 || head==null || index>this.size()){
            throw new InvalidIndexException();
        }
        //Using same logic as add function but instead of adding a new node, we return the found node
        int count = 0;
        DoublyLinkedListNode<T> current = head;
        while (current.getNext() != null && count < index) {
            count++;
            current = current.getNext();
        }
        return  current.getValue();
    }


    public static class InvalidIndexException extends Exception{

    }

}






