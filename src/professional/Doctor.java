/**
 * 
 */
package professional;

/**
 * @author psebo
 *
 */
public final class Doctor extends MedicalProfessional {
	private String samrcNumber;
	private double ratePerHour;

	public Doctor(String name, String surname, String hpcsaNo, String samrcNumber) {
		super(name, surname, hpcsaNo);
		this.samrcNumber = samrcNumber;

	}

	@Override
	public void setHourlyRate(double rate) {
		// TODO Auto-generated method stub

	}

	public String getSamrcNumber() {
		return samrcNumber;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public boolean verifySAMRCNumber() {
		return MedicalCouncil.MedicalCouncil.getSAMRC().equals(getSamrcNumber());
	}

	@Override
	public String toString() {
		return "Doctor { Full Name :" + getName() + " " + getSurname() + " . South_African_Medical_Research_Council"
				+ samrcNumber + ", hourly rate : " + ratePerHour + " }\n";
	}

}
