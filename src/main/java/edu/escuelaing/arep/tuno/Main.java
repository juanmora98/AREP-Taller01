package edu.escuelaing.arep.tuno;

import edu.escuelaing.arep.tuno.collection.LinkedList;
import edu.escuelaing.arep.tuno.statistics.StatisticUtils;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File dataFile = null;
        if (args.length > 0){
            dataFile = new File(args[0]);
        }
        else{
            System.out.println("[WARNING] No file path provided, using src/main/resources/dat01.txt instead.");
            dataFile = new File("src/main/resources/dat01.txt");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            List<Double> linkedList = new LinkedList<>();
            String line;
            while ((line = br.readLine()) != null) {
                double num = Double.parseDouble(line);
                linkedList.add(num);
            }
            double mean = StatisticUtils.calculateMean(linkedList);
            double stdv = StatisticUtils.calculateStandardDeviation(linkedList);
            System.out.printf("The mean of the data is: %.2f\nThe standard deviation of the data is: %.2f\n", mean, stdv);
        } catch (FileNotFoundException e) {
            System.out.println("[WARNING] The file was not found.");
        } catch (IOException e) {
            System.out.println("[ERROR] The file couldn't be read.");
        }
    }

}
