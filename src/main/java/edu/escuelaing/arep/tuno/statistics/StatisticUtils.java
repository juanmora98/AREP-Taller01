package edu.escuelaing.arep.tuno.statistics;

import java.util.List;

public class StatisticUtils {

    public static double calculateMean(List<Double> numbers){
        int total = numbers.size();
        double sum = 0;
        for (Double num : numbers){
            sum += num;
        }
        return sum/total;
    }

    public static double calculateStandardDeviation(List<Double> numbers){
        double total = numbers.size();
        double avg = calculateMean(numbers);
        double numMinusAvgSquared = 0;
        for (Double num : numbers) {
            numMinusAvgSquared += Math.pow(num - avg, 2);
        }
        return Math.sqrt(numMinusAvgSquared/(total-1));
    }

}
