public class Starter {

    public static void main(String args[]) throws LinkedList.InvalidIndexException, DoublyLinkedList.InvalidIndexException {

        System.out.println("LinkedList");

        LinkedList<Double> myLinkedList= new LinkedList<Double>();
        myLinkedList.insert(3.3,0);
        System.out.println(myLinkedList.printAllElements());
        myLinkedList.insert(4.2,3);
        System.out.println(myLinkedList.printAllElements());
        myLinkedList.insert(15.5,4);
        System.out.println(myLinkedList.printAllElements());
        myLinkedList.insert(333.3,100);
        System.out.println(myLinkedList.printAllElements());

        System.out.println("Size");
        System.out.println(myLinkedList.size());

        System.out.println("Getter");
        System.out.println(myLinkedList.get(4));

//        System.out.println(myLinkedList.printAllElements());


        System.out.println("DoublyLinkedList");

        DoublyLinkedList myDoublyLinkedList=new DoublyLinkedList();
        myDoublyLinkedList.insert(3,0);
        System.out.println(myDoublyLinkedList.printAllValues());
        myDoublyLinkedList.insert(6,0);
        System.out.println(myDoublyLinkedList.printAllValues());
        myDoublyLinkedList.insert(20,2);
        System.out.println(myDoublyLinkedList.printAllValues());
        myDoublyLinkedList.insert(10,3);
        System.out.println(myDoublyLinkedList.printAllValues());
        myDoublyLinkedList.insert(33,4);
        System.out.println(myDoublyLinkedList.printAllValues());
        myDoublyLinkedList.insert(-5,5);
        System.out.println(myDoublyLinkedList.printAllValues());

        System.out.println("Size");
        System.out.println(myDoublyLinkedList.size());

        System.out.println("Getter");
        System.out.println(myDoublyLinkedList.get(5));


//        myDoublyLinkedList.remove(0);
//        System.out.println(myDoublyLinkedList.printAllValues());
//        myDoublyLinkedList.remove(2);
//        System.out.println(myDoublyLinkedList.printAllValues());
//        myDoublyLinkedList.remove(3);
//        System.out.println(myDoublyLinkedList.printAllValues());



        System.out.println("SortedLinkedList");

        SortedLinkedList sortedLinkedList=new SortedLinkedList();
        sortedLinkedList.add(5);
        System.out.println(sortedLinkedList.printAllValues());
        sortedLinkedList.add(10);
        System.out.println(sortedLinkedList.printAllValues());
        sortedLinkedList.add(2);
        System.out.println(sortedLinkedList.printAllValues());
        sortedLinkedList.add(3);
        System.out.println(sortedLinkedList.printAllValues());
        sortedLinkedList.add(5);
        System.out.println(sortedLinkedList.printAllValues());
        sortedLinkedList.add(1);
        System.out.println(sortedLinkedList.printAllValues());
        sortedLinkedList.add(5);
        System.out.println(sortedLinkedList.printAllValues());


        System.out.println("SortedLinked Search");

        System.out.println(sortedLinkedList.Search(5));
        System.out.println(sortedLinkedList.Search(3));
        System.out.println(sortedLinkedList.Search(1));




        Queue queue=new Queue();
        queue.push(5);
        System.out.println(queue.printAllElements());
        queue.push(6);
        System.out.println(queue.printAllElements());
        queue.push(7);
        System.out.println(queue.printAllElements());
        queue.pop();
        System.out.println(queue.printAllElements());
         System.out.println(queue.top());
         System.out.println(queue.printAllElements());

         System.out.println("Synchronized Queue");

         Queue q1 = new Queue();
         Queue q2 = new Queue();
         Thread t = new Thread(new SynchronizedQueue(10, "T1", q1));
         Thread t2 = new Thread(new SynchronizedQueue(100, "T2", q2));
         t.start();
         t2.start();
         while(true){
             try{
                 Thread.sleep(50000);
             } catch (Exception e){
                 System.exit(-1);
             }
         }




        Stack stack=new Stack();
        stack.push(5);
        System.out.println(stack.printAllElements());
        stack.push(6);
        System.out.println(stack.printAllElements());
        stack.push(7);
        System.out.println(stack.printAllElements());
        stack.push(8);
        System.out.println(stack.printAllElements());

        System.out.println(stack.pop());
        System.out.println(stack.printAllElements());
        System.out.println(stack.top());
        System.out.println(stack.printAllElements());


    }
}
