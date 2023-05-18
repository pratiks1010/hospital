package hospitalvalidationrules;

import java.time.LocalDate;
import java.util.List;

import enum_wards.Wards;
import hospital.Hospital;
import exceptionHospital.ExceptionHospitalHandling;

public class HospitalValidationRules {

	/*
	 * int patientID, String patientName, int patientAge, String patientGender,
	 * String patientCity, LocalDate patientdob, Wards patientward, LocalDate
	 * patientAddmisionDate
	 */

	public static Hospital allValidationOfHospital (int patientId, String patientName, int patientAge,
			String patientGender, String patientCity, String patientDob, String patientWard,
			String patientAdmmisionDate) {

		LocalDate patientdob = LocalDate.parse(patientDob);
		LocalDate patientaddmision = LocalDate.parse(patientAdmmisionDate);
		Wards patientward = Wards.valueOf(patientWard.toUpperCase());

		return new Hospital(patientId, patientName, patientAge, patientGender, patientCity, patientdob, patientward,
				patientaddmision);
	}

	public static Wards parseHospitalWards(String ward) {
		return Wards.valueOf(ward.toUpperCase());
	}

	public static void duplicatePatientcheck(int patientId, List<Hospital> myhospital)
			throws ExceptionHospitalHandling {
		Hospital patientid = new Hospital(patientId);

		if (myhospital.contains(patientid))
			throw new ExceptionHospitalHandling("Duplicate Patient ID");

		System.out.println("Patient Sucessfully Admitted!!!!!!");

	}

}
