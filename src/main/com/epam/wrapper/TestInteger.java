package com.epam.wrapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestInteger {
    private static final Logger LOG = LogManager.getLogger(TestInteger.class);
    public static void main(String[] args) {
        Integer a = 120;
        Integer b = 120;
        Integer c = 130;
        Integer d = 130;

        /*result - true
        Two Integers objects are equal with == because they created using auto boxing and there value is between -128 to 128
       */
        LOG.info(a==b);
        /*result - false
        Two Integer objects created with auto boxing with value " + "outside -128 to 128 are not equal using ==
        */
        LOG.info(c==d);

        Integer a1 = new Integer(120);
        Integer b1 = new Integer(120);
        /*result-false
        /two integers will not be equal because new Integer() creates separate object
        */
        LOG.info(a1==b1);
    }
}
