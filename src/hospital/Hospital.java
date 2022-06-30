/**
 * 
 */
package hospital;

/**
 * @author psebo
 *
 */
public final class Hospital {

	public String hospitalName;
	public Department department;

	public Hospital(String name) {
		hospitalName = name;
	}

	public String getName() {
		return hospitalName;
	}

	public Department getDepartment() {
		return department;
	}

	public void requestMedicStaff(Hospital.Department department, String type, String date) {
		System.out.println(getName() + " hospital needs a " + type + " on " + date + " in their " + department.getName()
				+ " department\n");
	}

	// Inner class Department.
	public class Department {
		private String dpName;
		private byte dpNo;

		public Department(String name, byte number) {
			dpName = name;
			dpNo = number;
		}

		public String getName() {
			return dpName;
		}

		public byte getNumber() {
			return dpNo;
		}
	}

	@Override
	public String toString() {
		return "{ Hospital : " + hospitalName + " }";
	}

}
