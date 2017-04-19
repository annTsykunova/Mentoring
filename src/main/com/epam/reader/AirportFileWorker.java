package com.epam.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

public class AirportFileWorker {
    private static final Logger LOG = LogManager.getLogger(AirportFileWorker.class);

    private static final String KEY_FLIGHT_ORIGIN = "flight.origin";
    private static final String KEY_FLIGHT_DESTINATION = "flight.destination";


    public void readOriginAirport(String[] items, String[] result) throws IOException {

        for (int i = 0; i < items.length; ++i) {
            result[i] = items[i];
        }

    }

    public void readDestinationAirport(String[] items, String[] result) throws IOException {
        int i = result.length - 1;
        for (String str : items) {
            result[i] = str;
            i--;
        }

    }

    public static void main(String[] args) {
        AirportFileWorker airportFileWorker = new AirportFileWorker();
        Properties prop = new Properties();
        try {
            prop.load(AirportFileWorker.class.getClassLoader().getResourceAsStream("flight.properties"));
            String[] airportOrigin = prop.getProperty(KEY_FLIGHT_ORIGIN).trim().split("\\s+");
            String[] airportDestination = prop.getProperty(KEY_FLIGHT_DESTINATION).trim().split("\\s+");
            String[] allAirports = new String[airportOrigin.length + airportDestination.length];
            airportFileWorker.readOriginAirport(airportOrigin, allAirports);
            airportFileWorker.readDestinationAirport(airportDestination, allAirports);
            for(String str:allAirports){
                LOG.info(str);
            }
        } catch (IOException e) {
            LOG.error(e);
        }
    }
}
