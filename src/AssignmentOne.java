import java.util.ArrayList;

public class AssignmentOne {

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "Southport Clinic", "GP123");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Jane", "Metro Medical", "GP456");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Patel", "Healthy Life Clinic", "GP789");

        Dietitian d1 = new Dietitian(101, "Dr. Lee", "Southport Clinic", "Weight Management");
        Dietitian d2 = new Dietitian(102, "Dr. Kumar", "Metro Medical", "Diabetic Nutrition");

        gp1.printDetails();
        System.out.println();
        gp2.printDetails();
        System.out.println();
        gp3.printDetails();
        System.out.println();
        d1.printDetails();
        System.out.println();
        d2.printDetails();

        System.out.println("------------------------------");
    }
}
