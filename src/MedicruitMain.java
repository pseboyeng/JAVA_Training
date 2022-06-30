import hospital.Hospital;
import hospital.Shift;
import professional.Doctor;
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
		MedicalProfessional nozuko = new Nurse("Nozuko", "Mbali", "N236554", "1122");
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

		boolean isVerifiedSANC = ((Nurse) nozuko).verifySANCNumber();

		if (isVerifiedSANC) {

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

		// Instantiate a doctor object reference variable.
		MedicalProfessional malose = new Doctor("Malose", "Kekana", "Nf254875", "3322");

		// christian barnard seeks doctor in maternity department.
		christianBarnard.requestMedicStaff(maternityDepartment, "Doctor", "13-07-2022");

		malose.addHospital(christianBarnard, maternityDepartment);

		boolean isVerifiedSAMRC = ((Doctor) malose).verifySAMRCNumber();

		if (isVerifiedSAMRC) {

			// Add hospital to Malose's collection.
			malose.addHospital(christianBarnard, maternityDepartment);
			malose.addHospital(mediclinic, cardiacDepartment);
			malose.setHourlyRate(1500.00);

			Shift shift1 = new Shift(christianBarnard, maternityDepartment, malose.getAvailability());
			Shift shift2 = new Shift(mediclinic, cardiacDepartment, malose.getAvailability());

			malose.setAvailability("13-07-2022");

			malose.addShift(shift1);
			malose.addShift(shift2);

		} else {
			System.out.println(malose.getName() + "\'s Affiliated Hospitals : " + malose.getHospitals() + "\n");
			System.out.println("Available on : " + malose.getAvailability());
		}

	}

}
