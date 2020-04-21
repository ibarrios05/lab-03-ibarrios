public class DoublyLinkedListNode<T extends Comparable<T>> {


    private T value;
    private DoublyLinkedListNode<T> next;
    private DoublyLinkedListNode<T>previous;

    public DoublyLinkedListNode(T value, DoublyLinkedListNode<T> next, DoublyLinkedListNode<T> previous){
        this.value=value;
        this.next=next;
        this.previous=previous;
    }

    public DoublyLinkedListNode<T> getNext() {
        return next;
    }

    public DoublyLinkedListNode<T> getPrevious() {
        return previous;
    }

    public void setNext(DoublyLinkedListNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setPrevious(DoublyLinkedListNode<T> previous) {
        this.previous = previous;
    }
}
