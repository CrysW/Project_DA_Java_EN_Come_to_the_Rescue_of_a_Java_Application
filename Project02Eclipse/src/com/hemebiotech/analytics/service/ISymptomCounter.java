package com.hemebiotech.analytics.service;

import java.util.List;
import java.util.Map;

/**
 * Will count the number of occurences from the ArrayList
 */

public interface ISymptomCounter {

    /**
     * @return a list of items organized according a key
     */

    Map<String,Integer> counterList (List<String> lSymptoms);

}
