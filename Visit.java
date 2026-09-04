public class Visit {
    // visit detail fields
    int visitId;
    String visitDate;
    String doctorName;
    String diagnosis;
    String treatment;

    // sets all visit fields
    public Visit(int visitId, String visitDate, String doctorName, String diagnosis, String treatment) {
        this.visitId = visitId;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    // returns visit as text
    @Override
    public String toString() {
        return "Visit ID: " + visitId + ", Date: " + visitDate +
        ", Doctor: " + doctorName + ", Diagnosis: " + diagnosis +
        ", Treatment: " + treatment;
    }
}
