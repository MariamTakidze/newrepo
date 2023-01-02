package com.solvd.task;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class countUniqueWords {
    public static void main(String[] args) throws Exception{
        String filepath = "C:\\Users\\m.takidze\\IdeaProjects\\GangoVehicleJava\\src\\main\\java\\com\\solvd\\task\\data.txt";
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        Set<String> wordsOfText= new HashSet<>();
        String line = br.readLine();
        while(line != null) {
            if(!line.trim().equals("")) {
                String [] words = line.toUpperCase().split(" ");

                for(String word : words) {

                    wordsOfText.add(word);
                }
            }
            line = br.readLine();
        }
        String res=String.valueOf(wordsOfText.size());

//        Files.write(filepath,res.getBytes(), StandardOpenOption.APPEND); ???
        // append to the file
        try (FileWriter fw = new FileWriter(filepath, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(res);
            bw.newLine();
        }

    }



}

