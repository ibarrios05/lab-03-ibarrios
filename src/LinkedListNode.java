public class LinkedListNode<T extends Comparable<T>> {

    private T value;
    private LinkedListNode<T> next;

    public LinkedListNode(T value,LinkedListNode next){
        this.value=value;
        this.next=next;
    }

    public T getValue() {
        return value;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
