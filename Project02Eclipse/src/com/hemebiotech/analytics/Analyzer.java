package com.hemebiotech.analytics;

import com.hemebiotech.analytics.service.*;

import java.util.List;
import java.util.Map;

/**
 * Read the symptoms from a file
 * Count the symptoms
 * Write the symptoms to a file
 */

public class Analyzer {

    // Attribut(s)
    private ISymptomReader reader = new ReadSymptomDataFromFile();
    private ISymptomCounter counter = new SymptomCounter();
    private ISymptomWriter writer = new WriteSymptomDataToFile();

    // Construteur(s)
    public Analyzer() {

    }

    // Méthode(s)

    /**
     * Read the symptoms
     * Count the symptoms
     * Write the symptoms
     */

    public void analyse() {

        List<String> r = reader.getSymptoms();

        Map<String,Integer> c = counter.counterList(r);

        writer.writeList(c);

    }
}
