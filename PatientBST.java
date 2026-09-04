public class PatientBST {
    PatientNode root;

    public PatientBST() {
        this.root = null;
    }

    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

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

    public Patient search(int patientId) {
        return searchRec(root, patientId);
    }

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

    // delete - Patient ID vachi patient-a remove pannum
    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    // deleteRec - recursive-a correct node-a kandupidichu delete pannum
    private PatientNode deleteRec(PatientNode current, int patientId) {
        if (current == null) {
            return null; // patient kedaikala, nothing to delete
        }

        if (patientId < current.data.patientId) {
            current.left = deleteRec(current.left, patientId); // chinna ID, left side po
        } else if (patientId > current.data.patientId) {
            current.right = deleteRec(current.right, patientId); // periya ID, right side po
        } else {
            // idhu thaan delete pannanum node

            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: one child - andha child-a nikkara node oda idam vachikko
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }

            // Case 3: two children - right subtree oda smallest node-a eduthu replace pannu
            PatientNode successor = findMin(current.right);
            current.data = successor.data; // value copy pannu
            current.right = deleteRec(current.right, successor.data.patientId); // duplicate-a remove pannu
        }

        return current;
    }

    private PatientNode findMin(PatientNode node) {
        while (node.left != null) {
            node = node.left; // ellame left side thaan smallest, left-ku left po
        }
        return node; // left illama irukura node thaan smallest
    }

    // inorderTraversal - patientId ascending order-la ellarayum print pannum
    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(PatientNode current) {
        if (current == null) {
            return;
        }
        inorderRec(current.left);
        System.out.println(current.data);
        inorderRec(current.right);
    }
}