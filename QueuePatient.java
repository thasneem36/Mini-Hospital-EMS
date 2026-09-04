public class QueuePatient {
    int patientId;
    String name;
    String medicalCondition;

    public QueuePatient(int patientId, String name, String medicalCondition) {
        this.patientId = patientId;
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    @Override
    public String toString() {
        return "ID: " + patientId + ", Name: " + name +
        ", Condition: " + medicalCondition;
    }
}
