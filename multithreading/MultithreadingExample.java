package multithreading;

//public class MultithreadingExample implements Runnable <- one other way to crate a multithreading class, but this way includes one more step in the main class
public class MultithreadingExample extends Thread {
    private int threadNumber;

    public MultithreadingExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() { // It is necessary to override this method to implement multithreading
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - Thead number: " + threadNumber);

            if (threadNumber == 3) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
