import java.util.LinkedList;

public class Queue {

    // holds waiting patients list
    private LinkedList<QueuePatient> queue;

    // starts with empty queue
    public Queue() {
        this.queue = new LinkedList<QueuePatient>();
    }

    // adds patient to queue
    public void enqueue(QueuePatient patient) {
        queue.addLast(patient);
        System.out.println(patient.name + " added to the queue.");
    }

    // removes patient from queue
    public QueuePatient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patients waiting.");
            return null;
        }
        return queue.removeFirst();
    }

    // shows all waiting patients
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

    // checks if queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
