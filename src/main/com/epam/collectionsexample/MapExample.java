package com.epam.collectionsexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    static Logger LOG = LogManager.getLogger(SetExample.class);
    public static void main(String[] args) {
        Map<String,Integer> stringIntegerMap  = new HashMap<>();
        Map<String,Integer> treeMap = new TreeMap<>();

        //Adding elements in HashMap
        stringIntegerMap.put("c",12457);
        stringIntegerMap.put("C", 45795);
        stringIntegerMap.put("a",458124);
        stringIntegerMap.put("aa", 54801);
        stringIntegerMap.put("B",14705);
        stringIntegerMap.put("b", 440548);
        stringIntegerMap.put("Kk",25408);
        stringIntegerMap.put("lL", 158015);

        LOG.info(stringIntegerMap);

        //Adding element with the same key
        stringIntegerMap.put("lL", 12);
        LOG.info(stringIntegerMap);

        //Removing element
        stringIntegerMap.remove("Kk");
        LOG.info(stringIntegerMap);

        //Adding elements in TreeMap
        treeMap.put("c",12457);
        treeMap.put("C", 45795);
        treeMap.put("a",458124);
        treeMap.put("aa", 54801);
        treeMap.put("B",14705);
        treeMap.put("b", 440548);
        treeMap.put("Kk",25408);
        treeMap.put("lL", 158015);

        //Sorted by natural order(ascii code)
        LOG.info(treeMap);

        //Adding element with the same key
        treeMap.put("lL", 12);
        LOG.info(treeMap);

        //Removing element
        treeMap.remove("Kk");
        LOG.info(treeMap);


    }
}
