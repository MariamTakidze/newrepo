package com.solvd.task;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;


public class Task {


    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\m.takidze\\IdeaProjects\\GangoVehicleJava\\src\\main\\java\\com\\solvd\\task\\data.txt");
        Set<String> wordsOfText= new HashSet<>();
        String lines = FileUtils.readLines(file, StandardCharsets.UTF_8).toString().replaceAll("[^\\dA-Za-z ]", "");
        String [] words = lines.toUpperCase().split(" ");
        for(String word : words) {
            wordsOfText.add(word);
        }

        String res="\n The count of unique words:  "+ String.valueOf(wordsOfText.size());
        Files.write(Paths.get(file.getPath()), res.getBytes(), StandardOpenOption.APPEND);

    }
}
//        Files.write(file, res);

//        FileUtils.writeStringToFile(file, res, Charset.defaultCharset());