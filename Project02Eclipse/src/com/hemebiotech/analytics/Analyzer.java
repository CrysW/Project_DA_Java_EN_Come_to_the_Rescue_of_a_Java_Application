package com.hemebiotech.analytics;

import java.util.List;

/**
 * Read the symptoms from a file
 */

public class Analyzer {

    // Attribut(s)
    private ISymptomReader reader = new ReadSymptomDataFromFile();

    // Construteur(s)
    public Analyzer() {

    }

    // Méthode(s)

    /**
     * Read the symptoms
     */

    public void analyse() {

        List<String> r = reader.getSymptoms();

    }
}
