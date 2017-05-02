package com.epam.collectionsexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    static Logger LOG = LogManager.getLogger(SetExample.class);
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //Adding elements in HashSet
        stringSet.add("C");
        stringSet.add("G");
        stringSet.add("Csdf");
        stringSet.add("Afd");
        stringSet.add("Adf");
        stringSet.add("Kaf");
        stringSet.add("Bdsf");
        stringSet.add("Kff");

        LOG.info(stringSet);

        stringSet.remove("Bdsf");
        //HashSet after removing
        LOG.info(stringSet);

        //Adding elements in TreeSet
        treeSet.add("C");
        treeSet.add("G");
        treeSet.add("Csdf");
        treeSet.add("Afd");
        treeSet.add("Adf");
        treeSet.add("Kaf");
        treeSet.add("Bdsf");
        treeSet.add("Kff");

        //Sorted by natural order(ascii code)
        LOG.info(treeSet);

        treeSet.remove("Csdf");
        //TreeSet after removing
        LOG.info(treeSet);
    }
}
