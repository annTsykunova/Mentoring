package com.epam.stringtask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class TestString {
    private static final Logger LOG = LogManager.getLogger(TestString.class);

    public static void main(String[] args) {
        String names = "   Anya Alice   albina    Anastasya ALLA ArinA   ";
        String [] arrayOfNames = names.trim().split("\\s+");
        for(String str: arrayOfNames) {
            LOG.info(str);
        }
        Arrays.sort(arrayOfNames);
        LOG.info("Sorted array");
        for(String str: arrayOfNames) {
            LOG.info(str);
        }
    }
}
