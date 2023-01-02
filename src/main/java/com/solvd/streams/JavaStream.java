package com.solvd.streams;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//import java.util.stream.IntStream;
import java.util.stream.*;

public class JavaStream {
    private static final Logger LOGGER = LogManager.getLogger(JavaStream.class);
    public static void main(String[] args)  throws IOException {

        //1. integer stream

        IntStream.range(1,80)
                .skip(16)
                .forEach(l-> LOGGER.info(l));

        //2 busdrivers
        List<String> busDrivers = new ArrayList<>();

        busDrivers.add("Spyridon Bangis");
        busDrivers.add("Ferdinando San");
        busDrivers.add("Pietro Maisto");
        busDrivers.add("David el Greco");
        busDrivers.add("Kostas Polimeras");
        busDrivers.add("Daniel Bardanca");
        busDrivers.add("Vahe Zargarian");
        //i drugie :d

        busDrivers
                .stream()
                .map(String::toUpperCase)
                .filter(l -> l.startsWith("D"))
                .forEach(System.out::println);


        //3 people list in file

        Stream <String> people = Files.lines(Paths.get("C:\\Users\\LENOVO\\Downloads\\finitoGangoVehicleJava\\GangoVehicleJava\\src\\main\\java\\com\\solvd\\streams\\people.txt"));
        people.sorted().filter(l-> l.length()>20).forEach(System.out::println);
        people.close();

        //4
        Arrays.stream(new int[]  {1,3,4,5,7}).map(l->l*5).average().ifPresent(System.out::println);

        //5
        List <String> famPeople =  Files.lines(Paths.get("C:\\Users\\LENOVO\\Downloads\\finitoGangoVehicleJava\\GangoVehicleJava\\src\\main\\java\\com\\solvd\\streams\\famPeople.txt"))
                .filter(l->l.contains("19")).collect(Collectors.toList());
        famPeople.forEach(l-> LOGGER.info(l));

        //6 doubles reduce sum
        double total = Stream.of(1.5,2.7,9.7).reduce(0.0,(Double a, Double b)-> a+b );
        LOGGER.info("Total" + total);

        //7
        Stream.of("Unknown","mySoulmate","groupMate","LifePassenger")
                .sorted().findFirst().ifPresent(System.out::println);

    }
}
