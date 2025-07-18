public class Dietitian extends HealthProfessional {
    private String specialityArea;

    public Dietitian() {
        super();
        this.specialityArea = "General Nutrition";
    }

    public Dietitian(int id, String name, String clinic, String specialityArea) {
        super(id, name, clinic);
        this.specialityArea = specialityArea;
    }

    @Override
    public void printDetails() {
        System.out.println("Type: Dietitian");
        super.printDetails();
        System.out.println("Speciality: " + specialityArea);
    }
}

