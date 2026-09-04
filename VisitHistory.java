public class VisitHistory {

    // first node in list
    VisitNode head;

    // starts with empty list
    public VisitHistory() {
        this.head = null;
    }

    // adds visit to end
    public void addVisit(Visit visit) {
        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            // list empty set head
            head = newNode;
            return;
        }

        // walk to last node
        VisitNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // removes visit by id
    public void removeVisit(int visitId) {
        if (head == null) {
            // nothing to remove here
            System.out.println("No visit history available.");
            return;
        }

        // head matches remove it
        if (head.data.visitId == visitId) {
            head = head.next;
            System.out.println("Visit with ID " + visitId + " removed.");
            return;
        }

        // find node before match
        VisitNode current = head;
        while (current.next != null && current.next.data.visitId != visitId) {
            current = current.next;
        }

        if (current.next == null) {
            // reached end not found
            System.out.println("Visit with ID " + visitId + " not found.");
            return;
        }

        // skip matched node out
        current.next = current.next.next;
        System.out.println("Visit with ID " + visitId + " removed.");
    }

    // finds visit by id
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

    // prints all visit records
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
