package com.company;

import java.io.*;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        File inFile = new File("C:\\Users\\INordic\\Desktop\\java.txt");
        File outFile = new File("C:\\Users\\INordic\\Desktop\\javaout.txt");

        try (FileReader fileReader1 = new FileReader(inFile);
             FileWriter fileWriter1 = new FileWriter(outFile)) {
            int symbol;

            while ((symbol = fileReader1.read()) != -1) {
                char tempSymbol = (char) symbol;
                char tempSymbol1 = Character.toUpperCase(tempSymbol);
                

                fileWriter1.write(symbol);
            }
        } catch (IOException e) {
        }
    }
    }
