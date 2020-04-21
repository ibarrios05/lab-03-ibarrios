public class SortedLinkedList<T extends Comparable<T>> {

    private SortedLinkedListNode<T> head;

    public SortedLinkedList() {
        head = null;
    }

    public synchronized void add(T value){
        System.out.println("I am in the add method for Sorted "+value);
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to add");
        }

        if(head == null || value.compareTo(head.getValue())<0){
            head = new SortedLinkedListNode<>(value, head, null);
        }else {
            SortedLinkedListNode<T> current = head;
            while (current.getNext() != null && (value.compareTo((current.getNext().getValue())) > 0)) {
                current = current.getNext();
            }
            current.setNext(new SortedLinkedListNode<T>(value, current.getNext(), current.getPrevious()));
        }


    }


    public synchronized String printAllValues(){
        if (head==null){
            return "empty";
        }
        int count=0;
        SortedLinkedListNode<T> current=head;
        count++;
        String rtnString= current.getValue()+",";
        while(current.getNext()!=null){
            count++;
            current=current.getNext();
            rtnString+=current.getValue()+",";
        }

        return rtnString;

    }

    public synchronized boolean Search(T value){
        System.out.println("I am in the Search method for Sorted "+value);
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to get");
        }

        if (head==null){
            return false;
        }
        int count=1;
        SortedLinkedListNode<T> current=head;
        while(current.getNext()!=null && !current.getValue().equals(value)){
            count++;
            current=current.getNext();
        }
        if(current.getValue().equals(value)){
            return true;
        }else{
            return false;
        }

    }



    private static class SortedLinkedListNode<T>{
        private T value;
        private SortedLinkedListNode<T> next;
        private SortedLinkedListNode<T> previous;

        public SortedLinkedListNode(T value, SortedLinkedListNode<T> next, SortedLinkedListNode<T> previous){
            this.value=value;
            this.next=next;
            this.previous=previous;
        }

        public SortedLinkedListNode<T> getNext() {
            return next;
        }

        public SortedLinkedListNode<T> getPrevious() {
            return previous;
        }

        public void setNext(SortedLinkedListNode<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setPrevious(SortedLinkedListNode<T> previous) {
            this.previous = previous;
        }
    }




}

