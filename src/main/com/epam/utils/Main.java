package com.epam.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            FileWorker fileWorker = new FileWorker("input.txt");
            fileWorker.readFile();
        } catch (EmptyException e) {
            LOG.error(e.getMessage());
        } catch (FileNotFoundException e) {
            LOG.error("File not found", e);
        }
    }
}
