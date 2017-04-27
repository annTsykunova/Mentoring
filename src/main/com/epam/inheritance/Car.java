package com.epam.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car {
    private final Logger LOG = LogManager.getLogger(Car.class);
    private int id = 3;

    public void doMark(){
        id = this.getId();
        LOG.info("This is default car with id = " + id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
