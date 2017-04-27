package com.epam.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FordCar extends Car {
    private final Logger LOG = LogManager.getLogger(FordCar.class);
    private int id ;
    {
        this.id = 10;
    }

    @Override
    public void doMark() {
        id = this.getId();
        LOG.info("This is ford car with id = " + id);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
}
