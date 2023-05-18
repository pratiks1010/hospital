package hospital;

import java.io.Serializable;
import java.time.LocalDate;

import enum_wards.Wards;

public class Hospital implements Comparable<Hospital>,Serializable {

	private int patientID;
	private String patientName;
	private int patientAge;
	private String patientGender;
	private String patientCity;
	private LocalDate patientdob;
	private Wards patientward;
	private LocalDate patientAddmisionDate;

	public Hospital(int patientID, String patientName, int patientAge, String patientGender, String patientCity,
			LocalDate patientdob, Wards patientward, LocalDate patientAddmisionDate) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientCity = patientCity;
		this.patientdob = patientdob;
		this.patientward = patientward;
		this.patientAddmisionDate = patientAddmisionDate;
	}

	public Hospital(int patientID) {
		this.patientID = patientID;

	}

	public String toString() {
		return "patientId :" + this.patientID + "\n" + "PatientName :" + this.patientName + "\n" + "PatientAge :"
				+ this.patientAge + "\n" + "PatientGender :" + this.patientGender + "\n" + "PatientCity :"
				+ this.patientCity + "\n" + "PatientDob :" + this.patientAddmisionDate + "\n" + "PatientWard :"
				+ this.patientward + "\n" + "PatientAdmmisionDate :" + this.patientAddmisionDate;
	}

	public boolean equals(Object o) {
		if (o instanceof Hospital)
			return ((Integer) this.patientID).equals(((Hospital) o).patientID);

		return false;
	}

	public int compareTo(Hospital hosp) {

		return ((Integer) this.patientID).compareTo((hosp).patientID);

	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public Wards getPatientward() {
		return patientward;
	}

	public void setPatientward(Wards patientward) {
		this.patientward = patientward;
	}

	public LocalDate getPatientAddmisionDate() {
		return patientAddmisionDate;
	}

	public void setPatientAddmisionDate(LocalDate patientAddmisionDate) {
		this.patientAddmisionDate = patientAddmisionDate;
	}

}
