public class VisitHistory {

    VisitNode head;

    public VisitHistory() {
        this.head = null;
    }

    public void addVisit(Visit visit) {
        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            head = newNode;
            return;
        }

        VisitNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        if (head.data.visitId == visitId) {
            head = head.next;
            System.out.println("Visit with ID " + visitId + " removed.");
            return;
        }

        VisitNode current = head;
        while (current.next != null && current.next.data.visitId != visitId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Visit with ID " + visitId + " not found.");
            return;
        }

        current.next = current.next.next;
        System.out.println("Visit with ID " + visitId + " removed.");
    }

    public Visit searchVisit(int visitId) {
        VisitNode current = head;
        while (current != null) {
            if (current.data.visitId == visitId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void displayHistory() {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        System.out.println("Visit history:");
        VisitNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
