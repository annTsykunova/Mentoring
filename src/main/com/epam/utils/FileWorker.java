package com.epam.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWorker {
    private static final Logger LOG = LogManager.getLogger(FileWorker.class);

    private List<String> list;
    private String file;

    public FileWorker(String path) {
        file = path;
    }

    public FileWorker() {
    }

    public List<String> getList() {
        return list;
    }

    public void readFile() throws EmptyException, FileNotFoundException {
        Scanner scanner;
        LOG.info("Read from file");
        scanner = new Scanner(new FileReader(file));
        list = new ArrayList<>();
        while (scanner.hasNext()) {
            String info = scanner.nextLine();
            if (!info.isEmpty())
                list.add(info);
        }
        scanner.close();
        if (list.isEmpty()) {
            throw new EmptyException("File is empty");
        }
    }

}

