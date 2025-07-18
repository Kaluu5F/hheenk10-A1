public class HealthProfessional {
    protected int id;
    protected String name;
    protected String clinic;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.clinic = "Unknown Clinic";
    }

    public HealthProfessional(int id, String name, String clinic) {
        this.id = id;
        this.name = name;
        this.clinic = clinic;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Clinic: " + clinic);
    }
}
