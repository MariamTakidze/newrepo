package com.solvd.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    private static final Logger LOGGER = LogManager.getLogger(TryWithResources.class);


    public static void main(String[] args) {
        String filepath = "C:\\Users\\m.takidze\\IdeaProjects\\GangoVehicleJava\\src\\main\\java\\com\\solvd\\exceptions\\test.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            LOGGER.info("File Content:");
            LOGGER.info((br.readLine()));
        }
        catch(IOException e ) {
           LOGGER.error(e.getMessage());
        }
    }


}
