public class SynchronizedQueue implements Runnable {
    static int count = 0;

    private int value;
    private String name;
    private Queue queue;

    public SynchronizedQueue(int value,String name, Queue queue){
        this.value = value;
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("I am in the run loop");
            if(value<15){
                System.out.println("I am in the push method "+name);
                int localCount = queue.push(value, name);
                System.out.println(value+" "+localCount);
            } else {
                System.out.println("I am going to run the other "+name);
                queue.other(name);
            }
        }
    }

    public static synchronized void other(String name){
        System.out.println("I'm in the OTHER method "+name);
    }
}
