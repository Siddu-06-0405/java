class NewThread3 implements Runnable {
    Thread t;

    NewThread3(String name) {
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(t.getName() + " interrupted.");
        }
        System.out.println(t.getName() + " exiting.");
    }
}