import java.util.LinkedList;
import java.util.Queue;

public class SharedList {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int MAX_SIZE = 10;

    // Região crítica: inserção
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == MAX_SIZE) {
            wait();
        }
        queue.add(value);
        System.out.println("PRODUZIU: " + value + " (itens na fila: " + queue.size() + ")");
        notifyAll();
    }

    // Região crítica: remoção
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        System.out.println("CONSUMIU: " + value + " (itens na fila: " + queue.size() + ")");
        notifyAll();
        return value;
    }
}