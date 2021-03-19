package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 */

public class SymptomCounter implements ISymptomCounter {

    // Attribut(s)

    // Constructeur(s)
    public SymptomCounter() {

    }

    // Méthode(s)

    /**
     * @return a list of items organised according a key
     */

    public Map<String,Integer> counterList(List<String> lSymptoms) {

        Map<String,Integer> mySymptoms = new TreeMap<>();

        for (String symptoms : lSymptoms) {
            symptoms = symptoms.trim().toLowerCase();
            if (mySymptoms.containsKey(symptoms)) {
                mySymptoms.get(symptoms);
                int affections = mySymptoms.get(symptoms);
                affections = affections + 1;
                mySymptoms.put(symptoms,affections);
            }
            else {
                mySymptoms.put(symptoms, 1);
            }
        }

        return mySymptoms;

    }

}
