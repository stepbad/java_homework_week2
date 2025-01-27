package example1;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // ---- Doctor and Patient Section ----
        System.out.println("---- Doctor and Patient Section ----");

        // Create Doctor objects
        Doctor doctor1 = new Doctor(1, "Dr. Smith", "Cardiologist", 15);
        Doctor doctor2 = new Doctor(2, "Dr. Johnson", "Neurologist", 10);

        // Create Patient objects
        Patient patient1 = new Patient(101, "Noah Seven", 45, "Heart Problem", "Dr. Smith");
        Patient patient2 = new Patient(102, "Sarah Two", 30, "Migraine", "Dr. Johnson");

        // Display Doctor and Patient details
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(patient1);
        System.out.println(patient2);

        // Perform Doctor actions
        doctor1.diagnosePatient(patient1.getName());
        doctor2.prescribeMedicine(patient2.getName());
        doctor1.performSurgery(patient1.getName());

        // Perform Patient actions
        patient1.admit();
        patient2.admit();
        patient2.updateMedicalRecord("Severe Migraine");
        patient1.discharge();

        // ---- Nurse, Drug, Equipment, Ward, and Operating Theatre Section ----
        System.out.println("\n---- Nurse, Drug, Equipment, Ward, and Operating Theatre Section ----");

        // Create Nurse object
        Nurse nurse1 = new Nurse(101, "Alice", "Pediatrics");

        // Create Drug object
        Drug drug1 = new Drug("Paracetamol", "ABC Pharma", 10.5);

        // Create Equipment object
        Equipment equipment1 = new Equipment("X-Ray Machine", "Radiology", true);

        // Create Ward object
        Ward ward1 = new Ward("General Ward", 20);

        // Create Operating Theatre object
        OperatingTheatre ot1 = new OperatingTheatre(1, true);

        // Display Nurse details and perform action
        System.out.println(nurse1);
        nurse1.assistDoctor("Surgery preparation");

        // Display Drug details
        System.out.println(drug1);

        // Display Equipment details and perform action
        System.out.println(equipment1);
        equipment1.serviceEquipment();

        // Display Ward details and admit patients
        System.out.println(ward1);
        ward1.admitPatient();
        ward1.admitPatient();

        // Display Operating Theatre details and schedule surgery
        System.out.println(ot1);
        ot1.scheduleSurgery();

        // Try scheduling surgery again and update availability
        ot1.scheduleSurgery();
        ot1.setAvailable(true); // Make the theatre available again
        ot1.scheduleSurgery();
    }
}
