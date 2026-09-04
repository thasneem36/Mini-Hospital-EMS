public class Main {
    public static void main(String[] args) {
        PatientBST bst = new PatientBST();

        System.out.println("--- Testing Insert ---");
        bst.insert(new Patient(
                100,
                "Thasneem",
                24,
                "0771234567",
                "Fever"));

        System.out.println("Inorder Traversal");
        System.out.println("Patients in ascending order:");
        bst.inorderTraversal();

        System.out.println();

        System.out.println("Search");
        Patient found = bst.search(105);
        if (found != null) {
            System.out.println("Patient found: " + found);
        } else {
            System.out.println("Patient with ID 107 not found.");
        }

        System.out.println();

        Patient notFound = bst.search(102);
        if (notFound != null) {
            System.out.println("Patient found: " + notFound);
        } else {
            System.out.println("Patient with ID 999 not found.");
        }

        System.out.println();

        System.out.println("Delete");
        System.out.println("Deleting patient with ID 105 (has two children)...");
        bst.delete(105);

        System.out.println();

        System.out.println("Patients in ascending order after deletion:");
        bst.inorderTraversal();

        System.out.println();

        Queue queue = new Queue();

        System.out.println("--- Testing Enqueue ---");
        queue.enqueue(new QueuePatient(201, "Nadeesha Fonseka", "Asthma"));
        queue.enqueue(new QueuePatient(202, "Ruwan Jayasuriya", "Arthritis"));
        queue.enqueue(new QueuePatient(203, "Chathurika Weerasinghe", "Migraine"));

        System.out.println();

        System.out.println("Display Queue");
        queue.displayQueue();

        System.out.println();

        System.out.println("--- Testing Dequeue ---");
        QueuePatient next = queue.dequeue();
        if (next != null) {
            System.out.println("Dequeued: " + next);
        }

        System.out.println();

        System.out.println("Display Queue");
        queue.displayQueue();

        System.out.println();

        System.out.println("--- Testing Empty Queue ---");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println();

        System.out.println("Display Queue");
        queue.displayQueue();

        System.out.println();

        TreatmentStack stack = new TreatmentStack();

        System.out.println("--- Testing Push ---");
        stack.push(new TreatmentRecord(301, "Nadeesha Fonseka", "Nebulizer treatment", "2026-09-01"));
        stack.push(new TreatmentRecord(302, "Ruwan Jayasuriya", "Joint injection", "2026-09-02"));
        stack.push(new TreatmentRecord(303, "Chathurika Weerasinghe", "Migraine medication", "2026-09-03"));

        System.out.println();

        System.out.println("Display Records");
        stack.displayRecords();

        System.out.println();

        System.out.println("--- Testing Pop ---");
        TreatmentRecord latest = stack.pop();
        if (latest != null) {
            System.out.println("Popped: " + latest);
        }

        System.out.println();

        System.out.println("Display Records");
        stack.displayRecords();

        System.out.println();

        System.out.println("--- Testing Empty Stack ---");
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println();

        System.out.println("Display Records");
        stack.displayRecords();

        System.out.println();

        VisitHistory history = new VisitHistory();

        System.out.println("--- Testing Add Visit ---");
        history.addVisit(new Visit(401, "2026-08-10", "Dr. Silva", "Fever", "Paracetamol"));
        history.addVisit(new Visit(402, "2026-08-20", "Dr. Perera", "Cough", "Cough syrup"));
        history.addVisit(new Visit(403, "2026-09-01", "Dr. Fernando", "Checkup", "None"));

        System.out.println();

        System.out.println("Display History");
        history.displayHistory();

        System.out.println();

        System.out.println("--- Testing Search Visit ---");
        Visit foundVisit = history.searchVisit(402);
        if (foundVisit != null) {
            System.out.println("Visit found: " + foundVisit);
        } else {
            System.out.println("Visit with ID 402 not found.");
        }

        Visit missingVisit = history.searchVisit(999);
        if (missingVisit != null) {
            System.out.println("Visit found: " + missingVisit);
        } else {
            System.out.println("Visit with ID 999 not found.");
        }

        System.out.println();

        System.out.println("--- Testing Remove Visit ---");
        System.out.println("Removing head visit (ID 401)...");
        history.removeVisit(401);

        System.out.println("Removing middle visit (ID 403)...");
        history.removeVisit(403);

        System.out.println("Removing visit that doesn't exist (ID 999)...");
        history.removeVisit(999);

        System.out.println();

        System.out.println("Display History");
        history.displayHistory();
    }
}
