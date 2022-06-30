/**
 * 
 */
package professional;

import java.util.ArrayList;
import java.util.List;

import hospital.Hospital;
import hospital.Shift;

/**
 * @author psebo
 *
 */
public abstract class MedicalProfessional implements Professional {

	private String firstName;
	private String lastName;
	private String availability;
	public String numberHPCSA;

	public List<String> qualifications;
	public List<Hospital> hospitals;
	public List<Hospital.Department> departments;
	public Shift shift;
	public List<Shift> shifts;

	public MedicalProfessional(String name, String surname, String hpcsaNo) {
		firstName = name;
		lastName = surname;
		numberHPCSA = hpcsaNo;
		qualifications = new ArrayList<>();
		hospitals = new ArrayList<Hospital>();
		departments = new ArrayList<Hospital.Department>();
		shifts = new ArrayList<Shift>();
	}

	public void addHospital(Hospital hospital, Hospital.Department department) {
		if (hospital != null) {
			hospitals.add(hospital);
			departments.add(department);
		}
	}

	public String getName() {
		return firstName;
	}

	public String getSurname() {
		return lastName;
	}

	public Shift getShift() {
		return shift;
	}

	public void setAvailability(String date) {
		availability = date;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public void addShift(Shift shift) {
		shifts.add(shift);
	}

	public String getAvailability() {
		return availability;
	}

	public ArrayList<String> getQualifications() {
		return (ArrayList<String>) qualifications;
	}

	public String getHPCSANumber() {
		return numberHPCSA;
	}

	public ArrayList<Hospital> getHospitals() {
		return (ArrayList<Hospital>) hospitals;
	}

	public ArrayList<Hospital.Department> getDepartments() {
		return (ArrayList<Hospital.Department>) departments;
	}

	public ArrayList<Shift> getShifts() {
		return (ArrayList<Shift>) shifts;
	}

}
