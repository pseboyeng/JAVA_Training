/**
 * 
 */
package hospital;

/**
 * @author psebo
 *
 */
public final class Shift {
	public Hospital hospital;
	public Hospital.Department department;
	public String date;

	public Shift(Hospital hospital, Hospital.Department department, String date) {
		this.hospital = hospital;
		this.department = department;
		this.date = date;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public Hospital.Department getDepartment() {
		return department;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Shift {hospital : " + hospital + ", department : " + department + ", date : " + date + " }";
	}

}
