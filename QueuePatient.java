public class QueuePatient {
    // basic patient queue info
    int patientId;
    String name;
    String medicalCondition;

    // sets queue patient fields
    public QueuePatient(int patientId, String name, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    // returns patient as text
    @Override
    public String toString() {
        return "ID: " + patientId + ", Name: " + name +
        ", Condition: " + medicalCondition;
    }
}
