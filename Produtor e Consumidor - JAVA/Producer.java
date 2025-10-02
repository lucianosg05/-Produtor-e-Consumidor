public class Producer implements Runnable {
    private final SharedList sharedList;
    private int counter = 0;

    public Producer(SharedList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                sharedList.produce(counter++);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Produtor finalizado");
        }
    }
}