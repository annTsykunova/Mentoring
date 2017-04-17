package com.epam.loopcontrol;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLoop {
    private static final Logger LOG = LogManager.getLogger(TestLoop.class);
    public static void main(String[] args) {

        //continue
        for(int i = -10; i < 11;i++){
            if(i == 0){
                continue;
            }
            LOG.info(i/i);
        }

        //break
        for (int i = 1; i < 4; i++) {
           LOG.info("Point " + i + ": ");
            for (int j = 0; j < 10; j++) {
                if (j == 5)
                    break;
                LOG.info(j + " ");
            }
        }

        //iterator
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            numbers.add(String.valueOf(i+1));
        }
        if(!CollectionUtils.isEmpty(numbers)){
            Iterator<String> iter = numbers.iterator();
            LOG.info("Elements of list with iterator:");
            while (iter.hasNext()){
                LOG.info(iter.next());
            }
        }
    }
}
