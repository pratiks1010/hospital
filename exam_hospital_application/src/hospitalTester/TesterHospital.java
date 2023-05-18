package hospitalTester;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import enum_wards.Wards;
import exceptionHospital.ExceptionHospitalHandling;
import hospital.Hospital;
import static hospitalutils.HospitalUtils.populatedPatient;
import static hospitalvalidationrules.HospitalValidationRules.allValidationOfHospital;

public class TesterHospital {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			System.out.println("-----Hospital Management Application--------");

			List<Hospital> mylist = populatedPatient();

			System.out.println();

			boolean exit = false;

			while (!exit)

			{
				System.out.println("Application Menu");
				System.out.println("1: Add Patient in Hospital");
				System.out.println("2: Display all Patient Details");
				System.out.println("3: Display Perticular Patient Details");
				System.out.println("4: Discharge Patient or Remove patient");
				System.out.println("5: sort patient by PatientID");
				System.out.println("0: Exit  Application");

				try {

					System.out.println("Entre Choice");
					int choice = in.nextInt();

					switch (choice) {

					case 1:

						/*
						 * int patientID, String patientName, int patientAge, String patientGender,
						 * String patientCity, LocalDate patientdob, Wards patientward, LocalDate
						 * patientAddmisionDate
						 */
						System.out.println("Fill below Form for Addmit");
						System.out.println("PatientID");
						System.out.println("PatientName");
						System.out.println("PatientAge");
						System.out.println("PatientGender");
						System.out.println("PatientCity");
						System.out.println("PatientDob");
						System.out.println("PatientWard");
						System.out.println("PatientAddmisionDate");

						mylist.add(allValidationOfHospital(in.nextInt(), in.next(), in.nextInt(), in.next(), in.next(),
								in.next(), in.next(), in.next()));

						break;

					case 2:

						System.out.println("Patient Details");

						for (Hospital h : mylist) {
							System.out.println(h);
							System.out.println();
						}

						break;

					case 3:

						System.out.println("Entre the PatientId to See All Details");

						int patientid = in.nextInt();

						for (Hospital h : mylist) {
							if (h.getPatientID() == patientid) {
								System.out.println(h);
								System.out.println();
							}

						}

						break;

					case 4:

						System.out.println("Entre patientID");

						int index = mylist.indexOf(new Hospital(in.nextInt()));

						if (index == -1)
							throw new ExceptionHospitalHandling("PatientId Not Available!!");

						System.out.println(mylist.remove(index));
						System.out.println("Patient Removed!!!!!!");
						System.out.println();

						break;

					case 5:

						Collections.sort(mylist);
						for (Hospital h : mylist) {
							System.out.println(h);
							System.out.println();
						}
						System.out.println("Sortted List");
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
					in.next();
				}

			}
			;

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
