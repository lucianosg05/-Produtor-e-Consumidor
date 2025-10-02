public class Main {
    public static void main(String[] args) {
        SharedList sharedList = new SharedList();

        Thread producer = new Thread(new Producer(sharedList), "Produtor");
        Thread consumer = new Thread(new Consumer(sharedList), "Consumidor");

        producer.start();
        consumer.start();

        try {
            Thread.sleep(30000);
            producer.interrupt();
            consumer.interrupt();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}