package com.epam.comparatorexample;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().equals(o2.getName())){
            if(o1.getAge() < o2.getAge()){
                return -1;
            }else {
                return 1;
            }
        }
        return 0;
    }
}