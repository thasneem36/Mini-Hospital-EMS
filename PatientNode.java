public class PatientNode {
    // node data and links
    Patient data;
    PatientNode left;
    PatientNode right;

    // creates a new node
    public PatientNode(Patient data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}