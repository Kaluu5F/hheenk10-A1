public class GeneralPractitioner extends HealthProfessional {
    private String licenseNumber;

    public GeneralPractitioner() {
        super();
        this.licenseNumber = "GP000";
    }

    public GeneralPractitioner(int id, String name, String clinic, String licenseNumber) {
        super(id, name, clinic);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void printDetails() {
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("License Number: " + licenseNumber);
    }
}
