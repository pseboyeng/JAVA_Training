import hospital.Hospital;
import hospital.Shift;
import professional.MedicalProfessional;
import professional.Nurse;

/**
 * @author psebo
 *
 */
public class MedicruitMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create new Nurse object.
		MedicalProfessional nozuko = new Nurse("Nozuko", "Mbali", "N236554", "1123");
		// Set Nozuko's hourly rate.
		nozuko.setHourlyRate(800.50);

		System.out.println(nozuko);

		// create a new Hospital object.
		Hospital mediclinic = new Hospital("Mediclinic");
		// create mediclinic's department object.
		Hospital.Department cardiacDepartment = mediclinic.new Department("Cardiac", (byte) 10);

		// Request medical staff.
		mediclinic.requestMedicStaff(cardiacDepartment, "Nurse", "25-07-2022");

		// create a new Hospital object.
		Hospital christianBarnard = new Hospital("Christian Barnard");
		Hospital.Department maternityDepartment = christianBarnard.new Department("Maternity", (byte) 89);

		boolean isVerified = ((Nurse) nozuko).verifySANCNumber();

		if (isVerified) {

			// Add hospital to Nozuko's collection.
			nozuko.addHospital(mediclinic, cardiacDepartment);
			nozuko.addHospital(christianBarnard, maternityDepartment);

			nozuko.setAvailability("01-07-2022");

			System.out.println(nozuko.getName() + "\'s Affiliated Hospitals : " + nozuko.getHospitals() + "\n");

			System.out.println("Available on : " + nozuko.getAvailability());

			Shift shift1 = new Shift(mediclinic, cardiacDepartment, nozuko.getAvailability());
			Shift shift2 = new Shift(christianBarnard, maternityDepartment, nozuko.getAvailability());

			nozuko.addShift(shift1);
			nozuko.addShift(shift2);

			System.out.println(nozuko.getName() + " \'s shifts : " + nozuko.getShifts().size());

		} else {
			System.out.println("Please contact SANC to renew your license!");
		}

	}

}
