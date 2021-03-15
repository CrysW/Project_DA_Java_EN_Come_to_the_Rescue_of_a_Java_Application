package com.hemebiotech.analytics.service;

import java.util.Map;

/**
 * Writing occurences to an output file
 */

public interface ISymptomWriter {

    /**
     * Write occurences to a file
     * @param is the TreeMap of symptoms counted and listed in alphabetical order
     */

    void writeList (Map<String,Integer> mySymptoms);

}
