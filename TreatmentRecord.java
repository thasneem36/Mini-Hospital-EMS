public class TreatmentRecord {
    // treatment record detail fields
    int patientId;
    String patientName;
    String treatmentDetails;
    String completionDate;

    // sets all record fields
    public TreatmentRecord(int patientId, String patientName, String treatmentDetails, String completionDate) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.treatmentDetails = treatmentDetails;
        this.completionDate = completionDate;
    }

    // returns record as text
    @Override
    public String toString() {
        return "ID: " + patientId + ", Name: " + patientName +
        ", Treatment: " + treatmentDetails + ", Completed: " + completionDate;
    }
}
