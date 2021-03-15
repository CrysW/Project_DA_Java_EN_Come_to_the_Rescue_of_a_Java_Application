package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Simple brute force implementation
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

    // Attribut(s)

    // Constructeur(s)
    public WriteSymptomDataToFile() {

    }

    // Méthode(s)

    /**
     * Write occurences to a file
     * @param is the TreeMap of symptoms counted and listed in alphabetical order
     */

    public void writeList (Map<String,Integer> mySymptoms) {

        try(FileWriter writer = new FileWriter("result.out")) {
            Set<Map.Entry<String,Integer>> setView = mySymptoms.entrySet();

            Iterator<Map.Entry<String,Integer>> it = setView.iterator();

            while(it.hasNext()) {
                Map.Entry<String,Integer> entry = it.next();
                System.out.println("Number of symptoms of " + entry.getKey() + " : " + entry.getValue());
                writer.write("Number of symptoms of " + entry.getKey() + " : " + entry.getValue() + "\n");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
