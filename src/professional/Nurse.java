/**
 * 
 */
package professional;

/**
 * @author psebo
 *
 */
public final class Nurse extends MedicalProfessional {

	private String sancNumber;
	private double ratePerHour;

	public Nurse(String name, String surname, String hpcsaNo, String sancNo) {
		super(name, surname, hpcsaNo);
		sancNumber = sancNo;
	}

	@Override
	public void setHourlyRate(double rate) {
		ratePerHour += rate;
	}

	public String getsancNumber() {
		return sancNumber;
	}

	public double getHourlyRate() {
		return ratePerHour;
	}

	public boolean verifySANCNumber() {
		return MedicalCouncil.MedicalCouncil.getSANC().equals(getsancNumber());
	}

	@Override
	public String toString() {
		return "Nurse {Full Name : " + getName() + " " + getSurname() + ". South_African_Nursing_Council_Number : "
				+ sancNumber + ", hourly rate : R " + ratePerHour + "}\n";
	}

}
