public class PatientBST {
    // root of the tree
    PatientNode root;

    // starts with empty tree
    public PatientBST() {
        this.root = null;
    }

    // adds new patient node
    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    // finds correct spot recursively
    private PatientNode insertRec(PatientNode current, Patient patient) {
        if (current == null) {
            return new PatientNode(patient);
        }

        if (patient.patientId < current.data.patientId) {
            current.left = insertRec(current.left, patient);
        } else if (patient.patientId > current.data.patientId) {
            current.right = insertRec(current.right, patient);
        }

        return current;
    }

    // finds patient by id
    public Patient search(int patientId) {
        return searchRec(root, patientId);
    }

    // searches left or right
    private Patient searchRec(PatientNode current, int patientId) {
        if (current == null) {
            return null;
        }

        if (patientId == current.data.patientId) {
            return current.data;
        } else if (patientId < current.data.patientId) {
            return searchRec(current.left, patientId);
        } else {
            return searchRec(current.right, patientId);
        }
    }

    // removes patient by id
    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    // handles all delete cases
    private PatientNode deleteRec(PatientNode current, int patientId) {
        if (current == null) {
            return null;
        }

        if (patientId < current.data.patientId) {
            current.left = deleteRec(current.left, patientId);
        } else if (patientId > current.data.patientId) {
            current.right = deleteRec(current.right, patientId);
        } else {
            // no children just remove
            if (current.left == null && current.right == null) {
                return null;
            }

            // one child skip node
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }

            // two children use successor
            PatientNode successor = findMin(current.right);
            current.data = successor.data;
            current.right = deleteRec(current.right, successor.data.patientId);
        }

        return current;
    }

    // finds smallest id node
    private PatientNode findMin(PatientNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // prints patients in order
    public void inorderTraversal() {
        inorderRec(root);
    }

    // visits left root right
    private void inorderRec(PatientNode current) {
        if (current == null) {
            return;
        }
        inorderRec(current.left);
        System.out.println(current.data);
        inorderRec(current.right);
    }
}
