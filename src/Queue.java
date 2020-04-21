public class Queue<T extends Comparable<T>> {

    private QueueNode<T> head;

    public Queue() {
        head = null;
    }

    /**
     * Function to push a value onto the back of the queue
     * @param value value to be added
     * @return
     */
    public synchronized int push(T value, String name){
        System.out.println("I am in the push method for Queue "+value);
        other(name);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Failed to push");
        }

        if(head==null){
            head= new QueueNode<>(value, null);
        }else {
            //iteratively get to the end of the list and make a new value to put it at the end of the line
            QueueNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new QueueNode<T>(value, null));
        }
        return (int) value;
    }
    public static synchronized void other(String name){
        System.out.println("I'm in the OTHER method "+name);
    }

    /**Function to pop the first item in the list off of the queue
     *
     * @return Returns the value popped off
     */
    public T pop(){
        System.out.println("I am in the pop method for Queue");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to pop");
        }
        if(head==null){
            return null;
        }else{
            QueueNode<T> poppedElement= head;
            head=head.getNext();
            return  poppedElement.getValue();

        }

    }

    /**
     * Function to return the first element in the queue
     * @return the first element in the queue
     */
    public T top(){
        System.out.println("I am in the top method for Queue");
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Failed to top");
        }

            if(head==null){
                return null;
            }else{
                return head.getValue();
            }
    }

    public String printAllElements(){
        if (head==null){
            return "empty";
        }
        int count=0;
        QueueNode current=head;
        count++;
        String rtnString= current.getValue()+",";
        while(current.getNext()!=null){
            count++;
            current=current.getNext();
            rtnString+=current.getValue()+",";
        }

        return rtnString;



    }


    private static class QueueNode<T>{

        private T value;
        private QueueNode<T> next;

        public QueueNode(T value, QueueNode<T> next){
            this.value=value;
            this.next=next;
        }

        public QueueNode<T> getNext() {
            return next;
        }

        public void setNext(QueueNode<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

    }
}
