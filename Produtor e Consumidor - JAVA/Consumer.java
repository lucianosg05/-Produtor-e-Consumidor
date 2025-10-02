public class Consumer implements Runnable {
    private final SharedList sharedList;

    public Consumer(SharedList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                sharedList.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumidor finalizado");
        }
    }
}