public class PatientDriverApp {

    public static void main(String[] args) {
        // Create object for patient and each procedure
        Patient Jack = new Patient("Abraham", "A", "Lincoln", "1600 Pennsylvania Avenue NW", "Washington",
                "DC", 20500, "Barack Obama", "240-123-5432");

        Procedure Procedure1 = new Procedure("X-Ray", "07/12/2023",
                "Dr. Simpalot", 250.0);
        Procedure Procedure2 = new Procedure("Amputation", "05/11/2023",
                "Dr. McRizz", 5000.0);
        Procedure Procedure3 = new Procedure("Knee Surgery", "01/02/2023",
                "Dr.Rizzai", 1000.0);

        // Use getters to print patient information
        System.out.println("Patient name: " + Jack.getFirstNAME() + " " +
                Jack.getMiddleName() + " " + Jack.getLastName());
        System.out.println("Address: " + Jack.getAddress());
        System.out.println("City: " + Jack.getCity());
        System.out.println("State: " + Jack.getState());
        System.out.println("ZIP: " + Jack.getZipCode());
        System.out.println("Emergency Contact: " + Jack.getEmergencyName() + " "
                + Jack.getEmergencyNum());

        // Print information for the first procedure
        System.out.println("\nProcedure #1:");
        System.out.println("Procedure: " + Procedure1.getProcedureName());
        System.out.println("Procedure Date: " + Procedure1.getProcedureDate());
        System.out.println("Practitioner: " + Procedure1.getPractitionerName());
        System.out.println("Procedure Charge: " + Procedure1.getProcedureCharge());

        // Print information for the second procedure
        System.out.println("\nProcedure #2:");
        System.out.println("Procedure: " + Procedure2.getProcedureName());
        System.out.println("Procedure Date: " + Procedure2.getProcedureDate());
        System.out.println("Practitioner: " + Procedure2.getPractitionerName());
        System.out.println("Procedure Charge: " + Procedure2.getProcedureCharge());

        // Print information for the third procedure
        System.out.println("\nProcedure #3:");
        System.out.println("Procedure: " + Procedure3.getProcedureName());
        System.out.println("Procedure Date: " + Procedure3.getProcedureDate());
        System.out.println("Practitioner: " + Procedure3.getPractitionerName());
        System.out.println("Procedure Charge: " + Procedure3.getProcedureCharge());

        // Create FINAL variables for end of program
        final String PROGRAMMER_NAME = "Jack Kouncar";
        final String MC_ID = "M21131443";
        final String DUE_DATE = "07/03/2023";

        // Print final statements
        System.out.println("\nStudent Name: " + PROGRAMMER_NAME);
        System.out.println("Student MC M#: " + MC_ID);
        System.out.println("Due Date: " + DUE_DATE);
    }
}