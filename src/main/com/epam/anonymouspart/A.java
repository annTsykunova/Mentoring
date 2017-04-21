package com.epam.anonymouspart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class B {
    int bfield;
    B(int bfield) {
        this.bfield = bfield;
    }
    int getValue() {
        return bfield;
    }
}
public class A{
    private static final Logger LOG = LogManager.getLogger(A.class);
    static B createAnon() {
        int dlocal = 40;
        //creating anonymous class
        return new B(10) {
            int afield = 20;
            int cfield;
            {
                cfield = 30;
            }
            int getValue() {
                return bfield + afield + cfield + dlocal;
            }
        };
    }
    public static void main(String[] args) {
        B b = createAnon();
        LOG.info(b.getValue());
        //about Anonymous class
        LOG.info(b.getClass().toString());
    }
}
