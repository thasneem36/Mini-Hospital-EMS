import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // seed the sample data once
        PatientBST bst = new PatientBST();
        bst.insert(new Patient(100, "test", 24, "0771234567", "Fever"));

        Queue queue = new Queue();
        queue.enqueue(new QueuePatient(100, "test", "Asthma"));

        TreatmentStack stack = new TreatmentStack();
        stack.push(new TreatmentRecord(100, "teast treatment", "Nebulizer treatment", "2026-09-01"));

        VisitHistory history = new VisitHistory();
        history.addVisit(new Visit(100, "2026-08-10", "Dr. test", "Fever", "tablet"));

        // menu loop
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Patient Record");
            System.out.println("------------------------");
            System.out.println("1 - add patient");
            System.out.println("2 - list patient");
            System.out.println("3 - search patient");
            System.out.println("4 - delete patient");
            System.out.println();
            System.out.println("Emergency Patient Queue");
            System.out.println("------------------------");
            System.out.println("5 - add to queue");
            System.out.println("6 - remove from queue");
            System.out.println("7 - view queue");
            System.out.println();
            System.out.println("Treatment History");
            System.out.println("------------------------");
            System.out.println("8 - add treatment");
            System.out.println("9 - remove treatment");
            System.out.println("10 - view treatment history");
            System.out.println();
            System.out.println("Visit History");
            System.out.println("------------------------");
            System.out.println("11 - add visit");
            System.out.println("12 - search visit");
            System.out.println("13 - remove visit");
            System.out.println("14 - view visit history");
            System.out.println();
            System.out.println("0 - exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, try again.");
                continue;
            }

            switch (choice) {
                // patient record
                case 1: {
                    try {
                        System.out.print("Enter patient ID: ");
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter contact number: ");
                        String contact = scanner.nextLine();
                        System.out.print("Enter medical condition: ");
                        String condition = scanner.nextLine();
                        bst.insert(new Patient(id, name, age, contact, condition));
                        System.out.println("Patient added.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, patient not added.");
                    }
                    break;
                }

                case 2:
                    bst.inorderTraversal();
                    break;

                case 3: {
                    System.out.print("Enter patient ID: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    Patient patient = bst.search(id);
                    if (patient != null) {
                        System.out.println("Patient found: " + patient);
                    } else {
                        System.out.println("No patient with ID " + id + ".");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter patient ID: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    if (bst.search(id) != null) {
                        bst.delete(id);
                        System.out.println("Deleted patient " + id + ".");
                    } else {
                        System.out.println("No patient with ID " + id + ".");
                    }
                    break;
                }

                // emergency queue
                case 5: {
                    try {
                        System.out.print("Enter patient ID: ");
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter medical condition: ");
                        String condition = scanner.nextLine();
                        queue.enqueue(new QueuePatient(id, name, condition));
                        System.out.println(name + " added to the queue.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, not added to queue.");
                    }
                    break;
                }

                case 6: {
                    QueuePatient next = queue.dequeue();
                    if (next != null) {
                        System.out.println("Removed from queue: " + next);
                    }
                    break;
                }

                case 7:
                    queue.displayQueue();
                    break;

                // treatment history
                case 8: {
                    try {
                        System.out.print("Enter patient ID: ");
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter patient name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter treatment details: ");
                        String details = scanner.nextLine();
                        System.out.print("Enter completion date: ");
                        String date = scanner.nextLine();
                        stack.push(new TreatmentRecord(id, name, details, date));
                        System.out.println("Treatment record added for " + name + ".");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, treatment not added.");
                    }
                    break;
                }

                case 9: {
                    TreatmentRecord latest = stack.pop();
                    if (latest != null) {
                        System.out.println("Removed: " + latest);
                    }
                    break;
                }

                case 10:
                    stack.displayRecords();
                    break;

                // visit history
                case 11: {
                    try {
                        System.out.print("Enter visit ID: ");
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter visit date: ");
                        String date = scanner.nextLine();
                        System.out.print("Enter doctor name: ");
                        String doctor = scanner.nextLine();
                        System.out.print("Enter diagnosis: ");
                        String diagnosis = scanner.nextLine();
                        System.out.print("Enter treatment: ");
                        String treatment = scanner.nextLine();
                        history.addVisit(new Visit(id, date, doctor, diagnosis, treatment));
                        System.out.println("Visit added.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number, visit not added.");
                    }
                    break;
                }

                case 12: {
                    System.out.print("Enter visit ID: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    Visit visit = history.searchVisit(id);
                    if (visit != null) {
                        System.out.println("Visit found: " + visit);
                    } else {
                        System.out.println("No visit with ID " + id + ".");
                    }
                    break;
                }

                case 13: {
                    System.out.print("Enter visit ID: ");
                    int id = Integer.parseInt(scanner.nextLine().trim());
                    history.removeVisit(id);
                    break;
                }

                case 14:
                    history.displayHistory();
                    break;

                case 0:
                    System.out.println("Goodbye.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }
}
