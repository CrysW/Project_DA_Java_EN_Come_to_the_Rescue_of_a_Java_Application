package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Read the symptoms from a file
 * Count the symptoms
 */

public class Analyzer {

    // Attribut(s)
    private ISymptomReader reader = new ReadSymptomDataFromFile();
    private ISymptomCounter counter = new SymptomCounter();

    // Construteur(s)
    public Analyzer() {

    }

    // Méthode(s)

    /**
     * Read the symptoms
     * Count the symptoms
     */

    public void analyse() {

        List<String> r = reader.getSymptoms();

        Map<String,Integer> c = counter.counterList(r);

    }
}
