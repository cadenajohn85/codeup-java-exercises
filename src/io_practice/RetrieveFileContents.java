package io_practice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class RetrieveFileContents {

    public static void main (String[] args) {

        Path filePath = Paths.get("data", "io-sample.txt");

        List<String> retrievedContents = getFileContents(filePath);
        SOUTContents(retrievedContents);

        Path pathToGroceries = Paths.get("data", "grocery-list.txt");
        if (Files.notExists(pathToGroceries)) {
            try {
                System.out.println("File does not yet exist. Creating file now...");
                Files.createFile(pathToGroceries);
            } catch (Exception e) {
                System.out.println("Oops! An error occured.");
                throw new RuntimeException("Unable to perform operation.");
            }
        } else {
//            System.out.println("The file already exists.");
            try {
                Files.write(pathToGroceries, Arrays.asList("eggs"), StandardOpenOption.APPEND);

            } catch (Exception e) {
                System.out.println("Oops! An error occured.");
                throw new RuntimeException("Unable to perform operation.");
            }
        }

        SOUTContents(getFileContents(pathToGroceries));
    }

    public static List<String> getFileContents(Path someFilePath) {
        try {
            List<String> fileContents = Files.readAllLines(someFilePath);
            return fileContents;
        } catch (Exception e) {
            System.out.println("Oops! An error occured.");
            throw new RuntimeException("File not found.");
        }
    }

    public static void SOUTContents(List<String> someFileContents) {
        for (String line : someFileContents) {
            System.out.println(line);
        }
    }

}
