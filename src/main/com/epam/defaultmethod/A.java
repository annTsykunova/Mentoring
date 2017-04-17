package com.epam.defaultmethod;

import com.epam.loopcontrol.TestLoop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface A {
    Logger LOG = LogManager.getLogger(A.class);
    static void sayHello(){LOG.info("Hello");}
    default void sayHi() {LOG.info("Hi");}
}
