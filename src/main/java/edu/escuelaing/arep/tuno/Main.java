package edu.escuelaing.arep.tuno;

import edu.escuelaing.arep.tuno.collection.LinkedList;
import edu.escuelaing.arep.tuno.statistics.StatisticUtils;

import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Double> linkedList = new LinkedList<Double>();
        linkedList.add(160d);
        linkedList.add(591d);
        linkedList.add(114d);
        linkedList.add(229d);
        linkedList.add(230d);
        linkedList.add(270d);
        linkedList.add(128d);
        linkedList.add(1657d);
        linkedList.add(624d);
        linkedList.add(1503d);
        System.out.println(StatisticUtils.calculateMean(linkedList));
        System.out.println(StatisticUtils.calculateStandardDeviation(linkedList));
    }

}
