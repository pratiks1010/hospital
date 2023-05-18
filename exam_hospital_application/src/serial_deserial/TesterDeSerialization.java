package serial_deserial;

import java.util.List;
import java.util.Scanner;

import hospital.Hospital;

import static serial_deserial.Utils.deserialization;

public class TesterDeSerialization {

	public static void main(String[] args) {


		try(Scanner out = new Scanner(System.in))
		{
			
			System.out.println("Entre the file Name");
			
			
			List<Hospital> myhospital = deserialization(out.next());
			for(Hospital h : myhospital)
			{
				System.out.println(h);
				System.out.println();
			}
			
			System.out.println("Deserialization Done!!!!");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
