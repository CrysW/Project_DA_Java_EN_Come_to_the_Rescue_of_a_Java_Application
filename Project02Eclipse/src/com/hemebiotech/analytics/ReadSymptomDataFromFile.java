package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */

public class ReadSymptomDataFromFile implements ISymptomReader {

	// Attribut(s)

	// Constructeur(s)
	public ReadSymptomDataFromFile() {

	}

	// Méthodes(s)
	
	/**
	 * If no data is available, retunr an empty list
	 *
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */

	public List<String> getSymptoms() {

		List<String> result = new ArrayList<>();
		

		try (BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"))) {
			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
		}

		catch(IOException e) {
			e.printStackTrace();
		}

		return result;

	}

}
