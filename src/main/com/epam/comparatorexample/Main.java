package com.epam.comparatorexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {
    static Logger LOG = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Steve",21));
        persons.add(new Person("Vitaly",23));
        persons.add(new Person("Tanya",28));
        persons.add(new Person("Pavel",28));
        persons.add(new Person("Angelina",18));
        persons.add(new Person("Ann",28));
        persons.add(new Person("Ann",14));
        persons.add(new Person("Ann",22));
        LOG.info(persons.toString());
        Collections.sort(persons);
        LOG.info(persons.toString());
        //sorted by person comparator
        Collections.sort(persons,new PersonComparator());
        LOG.info(persons.toString());


    }
}
