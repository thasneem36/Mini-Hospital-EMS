public class Patient {
    int patientId;
    String name;
    int age;
    String contactNumber;
    String medicalCondition;

    public Patient(int patientId,
            String name,
            int age,
            String contactNumber,
            String medicalCondition) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    @Override
    public String toString() {

        return "ID: " + patientId + ", Name: " + name + 
        ", Age: " + age + ", Contact: " + contactNumber + 
        ", Condition: " + medicalCondition;
    }
}