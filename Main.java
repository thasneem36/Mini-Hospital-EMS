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
    }
}
