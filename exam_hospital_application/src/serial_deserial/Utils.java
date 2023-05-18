package serial_deserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import hospital.Hospital;

public interface Utils {

	public static void serialization(String filename, List<Hospital> myhospital) throws IOException {

		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filename))) {
			obj.writeObject(myhospital);
		}

	}

	public static List<Hospital> deserialization(String fileName) throws IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {

			return (List<Hospital>) in.readObject();

		}

	}

}
