package edu.escuelaing.arep.tuno;

import edu.escuelaing.arep.tuno.collection.LinkedList;
import edu.escuelaing.arep.tuno.statistics.StatisticUtils;

import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args){
        if (args.length > 0){
            File dataFile = new File(args[0]);
            try {
                BufferedReader br = new BufferedReader(new FileReader(dataFile));
                List<Double> linkedList = new LinkedList<>();
                String line;
                while ((line = br.readLine() ) != null){
                    double num = Double.parseDouble(line);
                    linkedList.add(num);
                }
                double mean = StatisticUtils.calculateMean(linkedList);
                double stdv = StatisticUtils.calculateStandardDeviation(linkedList);
                System.out.printf("The mean of the data is: %.2f\nThe standard deviation is: %.2f\n", mean, stdv);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("[WARNING] No filepath for the data was provided");
            System.exit(-1);
        }
    }

}
