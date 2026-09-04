import java.util.Stack;

public class TreatmentStack {

    // holds completed treatment records
    private Stack<TreatmentRecord> stack;

    // starts with empty stack
    public TreatmentStack() {
        this.stack = new Stack<TreatmentRecord>();
    }

    // adds record to stack
    public void push(TreatmentRecord record) {
        stack.push(record);
        System.out.println("Treatment record added for " + record.patientName + ".");
    }

    // removes latest treatment record
    public TreatmentRecord pop() {
        if (isEmpty()) {
            System.out.println("No treatment records to remove.");
            return null;
        }
        return stack.pop();
    }

    // shows records top first
    public void displayRecords() {
        if (isEmpty()) {
            System.out.println("No treatment records available.");
            return;
        }
        System.out.println("Treatment records (top to bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    // checks if stack empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
