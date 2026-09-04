# Hospital Emergency Management System

This is my mid-module assessment for Data Structures and Algorithms (DSA). Its a simple Java project that manages hospital patient data using a few core data structures - no database, no framework, just plain Java classes.

The idea is to simulate a small part of how a hospital might keep track of patients: storing their records, queuing them up in an emergency, logging their treatment history, and keeping a record of past visits.

## What's inside

- **Patient / PatientNode / PatientBST** - patient records stored in a Binary Search Tree, sorted by patient ID. Supports insert, search, delete and inorder traversal.
- **QueuePatient / Queue** - emergency waiting list, FIFO order using a LinkedList. Supports enqueue, dequeue and display.
- **TreatmentRecord / TreatmentStack** - treatment history, LIFO order using a Stack. Supports push, pop and display.
- **Visit / VisitNode / VisitHistory** - a patient's visit history as a singly linked list. Supports add, search, remove and display.

## How it works

Each structure is its own small class with its own logic, and `Main.java` just wires them together and tests them one at a time:

1. Patients get inserted into the BST, then searched for and deleted by ID, printing the tree in order each time so you can see it update.
2. A few patients get added to the emergency Queue, then dequeued one by one until it's empty, to show the FIFO order and the empty-queue message.
3. Treatment records get pushed onto the Stack and popped off, showing LIFO order (last one added is the first one removed).
4. Visits get added to the VisitHistory list, searched for by ID, and removed (including removing the head of the list), to show how the linked list stays intact after each change.

This step by step setup made it easier to test each structure on its own before combining them, instead of debugging everything at once.

## Files

- `Patient.java`, `PatientNode.java`, `PatientBST.java` - patient records (BST)
- `QueuePatient.java`, `Queue.java` - emergency queue
- `TreatmentRecord.java`, `TreatmentStack.java` - treatment history (stack)
- `Visit.java`, `VisitNode.java`, `VisitHistory.java` - visit history (linked list)
- `Main.java` - runs everything and prints the results

## How to run

```
javac *.java
java Main
```

No external libraries needed, just a JDK.
