import java.util.LinkedList;

public class Queue {

    private LinkedList<QueuePatient> queue;

    public Queue() {
        this.queue = new LinkedList<QueuePatient>();
    }

    public void enqueue(QueuePatient patient) {
        queue.addLast(patient);
        System.out.println(patient.name + " added to the queue.");
    }

    public QueuePatient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patients waiting.");
            return null;
        }
        return queue.removeFirst();
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No patients currently waiting.");
            return;
        }
        System.out.println("Patients waiting in queue (front to back):");
        for (QueuePatient patient : queue) {
            System.out.println(patient);
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
