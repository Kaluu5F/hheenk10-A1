public class Appointment {
    private String patientName;
    private String mobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
        this.patientName = "Unknown";
        this.mobile = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    public Appointment(String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobile = mobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public String getMobile() {
        return mobile;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + mobile);
        System.out.println("Time Slot: " + timeSlot);
        if (doctor != null) {
            System.out.println("Doctor Information:");
            doctor.printDetails();
        }
        System.out.println();
    }
}
