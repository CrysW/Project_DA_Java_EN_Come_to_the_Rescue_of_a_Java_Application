package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {

	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int dialatedPupilCount = 0;
	
	public static void main(String [] args) {

		try(BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"))) {
			String line = reader.readLine();

			while (line != null) {
				if (line.equals("headache")) {
					headacheCount++;
				} else if (line.equals("rash")) {
					rashCount++;
				} else if (line.equals("dialated pupils")) {
					dialatedPupilCount++;
				}

				line = reader.readLine();
			}

			System.out.println("number of headaches: " + headacheCount);
			System.out.println("number of rash: " + rashCount);
			System.out.println("number of dialated pupils: " + dialatedPupilCount);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		try(FileWriter writer = new FileWriter ("result.out")) {
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + dialatedPupilCount + "\n");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
