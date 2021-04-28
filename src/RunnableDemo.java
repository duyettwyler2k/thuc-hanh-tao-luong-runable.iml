public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

  RunnableDemo(String name){
      threadName=name;
      System.out.println("Creating"+threadName);
  }

    @Override
    public void run() {
        System.out.println("Creating"+threadName);
        for (int i = 4; i <0 ; i--) {
            System.out.println("Thread"+threadName+","+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Thread"+threadName+"interrupted");
            }
            System.out.println("Thread"+threadName+"exicting");
        }

    }
    public void start(){
        System.out.println("Starting"+threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
