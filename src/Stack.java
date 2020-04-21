public class Stack<T extends Comparable<T>> {

    private StackNode<T> head;


    public Stack() {
        head = null;
    }


    /**
     * Function to put a value onto the top of the stack
     * @param value value to be input
     */
    public void push(T value){
        System.out.println("I am in the push method for Stack "+value);
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to push");
        }

        if(head==null){
            head= new StackNode<T>(value,head,null);
        }else {

            //Iteratively get to the top of the stack(last item thus far)
            //then create a new node
            StackNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new StackNode<>(value, null,current));
        }

    }

    /**
     * Function to pop off the last value added to the list
     * @return the value popped
     */
    public T pop(){
        System.out.println("I am in the pop method for Stack");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to pop");
        }

        if(head==null){
            return null;
        }else{
            StackNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.getPrevious().setNext(null);
            return  current.getValue();

        }

    }


    /**
     * Function to return the top object (last object itself)
     * @return the last object added
     */
    public T top() {
        System.out.println("I am in the top method for Stack");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to top");
        }

        if (head == null) {
            return null;
        } else {
            StackNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            return  (T) current.getValue();

        }
    }



    public String printAllElements(){
        if (head==null){
            return "empty";
        }
        int count=0;
        StackNode<T> current=head;
        count++;
        String rtnString= current.getValue()+",";
        while(current.getNext()!=null){
            count++;
            current=current.getNext();
            rtnString+=current.getValue()+",";
        }

        return rtnString;



    }
    private class StackNode<T extends Comparable<T>>{
            private T value;
            private StackNode<T> next;
            private StackNode<T> previous;

            public StackNode(T value, StackNode<T> next, StackNode<T> previous){
                this.value=value;
                this.next=next;
                this.previous=previous;
            }

            public StackNode<T> getNext() {
                return next;
            }

            public StackNode<T> getPrevious() {
                return previous;
            }

            public void setNext(StackNode<T> next) {
                this.next = next;
            }

            public T getValue() {
                return value;
            }

            public void setValue(T value) {
                this.value = value;
            }

            public void setPrevious(StackNode<T> previous) {
                this.previous = previous;
            }
        }


    }
