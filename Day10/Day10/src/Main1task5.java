class Counter1 {
    private int count = 0;
    public  synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

class ThreadDemo1 extends Thread {
    Counter counter;
    ThreadDemo1(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Main1task5 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadDemo t1 = new ThreadDemo(counter);
        ThreadDemo t2 = new ThreadDemo(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}



