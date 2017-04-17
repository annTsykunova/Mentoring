package com.epam.wrapper;


import com.epam.loopcontrol.TestLoop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestByte {
    private static final Logger LOG = LogManager.getLogger(TestByte.class);
    public static void main(String[] args) {

        //It's a two-dimensional array with name Byte
        Byte [] Byte [] = {{2}};
        LOG.info(Byte.getClass());

        byte a = 50;

        /*compilation error
        2 - int
        */
        //a = a * 2;

        /*result - 100
        this expression is equivalent to 'a = (byte) ((a)*(2))'
        */
        a*= 2;
        LOG.info(a);
    }
}
