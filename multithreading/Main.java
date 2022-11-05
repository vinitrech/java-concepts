package multithreading;

/*Implementing the Runnable interface is better than extending the Thread class
 * because the class can only extend one other class, so if you extend the Thread class, you're kind of stuck to that extension only.
 * On the other hand, with the interface approach, the class can extend whatever class needed and still implement the Runnable interface. Also,
 * the class can implement any number of interfaces needed
 */

public class Main {
    public static void main(String[] args) {
        MultithreadingExample myThread = new MultithreadingExample(0);
        MultithreadingExample myThread2 = new MultithreadingExample(1);

        myThread.start(); // run() would execute the first thread first, and then the second
        myThread2.start(); // with start() it fires the threads at the same time

        for (int i = 2; i < 7; i++) {
            MultithreadingExample myThreadLoop = new MultithreadingExample(i);
            myThreadLoop.start();
        }

        throw new RuntimeException();

        // The threads will keep running even if any of them runs into an exception,
        // including the main thread

        // **********************************************************************
        // This is how you use threads using a class that implements the Runnable
        // interface instead of extending the Thread class
        /*
         * MultithreadingExample myThread3 = new MultithreadingExample(100);
         * Thread myThreadRunnable = new Thread(myThread3);
         * myThreadRunnable.start();
         */
    }
}
