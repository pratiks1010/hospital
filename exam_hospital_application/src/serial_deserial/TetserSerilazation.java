package serial_deserial;

import java.util.List;
import java.util.Scanner;
import static serial_deserial.Utils.serialization;


import hospital.Hospital;
import static hospitalutils.HospitalUtils.populatedPatient;

public class TetserSerilazation {

	public static void main(String[] args) {
		
		
		
		try(Scanner in = new Scanner(System.in))
		{
			
			List<Hospital> myhospital = populatedPatient();
			
			System.out.println("Entre the file Name");
			
			serialization(in.next(), myhospital);
			
			System.out.println("serialization Done!!!!!");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
