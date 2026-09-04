# Hospital Emergency Management System

A small Java project for a DSA module assessment. Manages patient records and hospital data using core data structures.

## What's in here

- **Patient / PatientNode / PatientBST** - patient records stored in a Binary Search Tree, sorted by patient ID (insert, search, delete, inorder traversal)
- **QueuePatient / Queue** - emergency waiting list backed by a LinkedList, FIFO order (enqueue, dequeue, display)
- **TreatmentRecord / TreatmentStack** - treatment history backed by a Stack, LIFO order (push, pop, display)
- **Visit / VisitNode / VisitHistory** - a patient's visit history (linked list)

`Main.java` currently tests the Patient BST, the Queue, and the Stack. Visit history gets wired in next.
