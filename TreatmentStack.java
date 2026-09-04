import java.util.Stack;

public class TreatmentStack {

    private Stack<TreatmentRecord> stack;

    public TreatmentStack() {
        this.stack = new Stack<TreatmentRecord>();
    }

    public void push(TreatmentRecord record) {
        stack.push(record);
        System.out.println("Treatment record added for " + record.patientName + ".");
    }

    public TreatmentRecord pop() {
        if (isEmpty()) {
            System.out.println("No treatment records to remove.");
            return null;
        }
        return stack.pop();
    }

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

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
