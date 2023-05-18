package hospitalutils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import enum_wards.Wards;

import static hospitalvalidationrules.HospitalValidationRules.allValidationOfHospital;
import hospital.Hospital;

public class HospitalUtils {

	public static List<Hospital> populatedPatient() {
		List<Hospital> myhospital = new ArrayList<>();

		/*
		 * int patientID, String patientName, int patientAge, String patientGender,
		 * String patientCity, LocalDate patientdob, Wards patientward, LocalDate
		 * patientAddmisionDate
		 */
		myhospital
				.add(allValidationOfHospital(1214, "Pratik", 23, "Male", "Solapur", "1999-09-10", "ICU", "2021-01-10"));
		myhospital
		.add(allValidationOfHospital(1218, "Rahul", 22, "Male", "Kohlapur", "1998-10-24", "SPECIAL", "2020-07-23"));
		myhospital
		.add(allValidationOfHospital(1223, "Abhi", 21, "Male", "Pune", "2000-04-13", "OPERATION", "2018-05-14"));
		myhospital
		.add(allValidationOfHospital(1247, "Varun", 24, "Male", "Solapur", "1999-09-10", "ICU", "2021-02-22"));
		myhospital
		.add(allValidationOfHospital(1236, "Ankita", 28, "Female", "Satara", "1988-06-17", "SPECIAL", "2021-06-14"));
		myhospital
		.add(allValidationOfHospital(1204, "Onkar", 36, "Male", "Mumbai", "1973-06-13", "SPECIAL", "2021-09-23"));
		myhospital
		.add(allValidationOfHospital(1215, "Depali", 45, "Female", "Kohlapur", "1997-06-26", "OPERATION", "2021-12-22"));
		
		
		
		return myhospital;

	}

}
