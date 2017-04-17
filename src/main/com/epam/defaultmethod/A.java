package com.epam.defaultmethod;

import com.epam.loopcontrol.TestLoop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Hanna_Tsykunova on 4/17/2017.
 */
public interface A {
    Logger LOG = LogManager.getLogger(A.class);
    static void sayHello(){LOG.info("Hello");}
    default void sayHi() {
        LOG.info("Hi");
    }
}
