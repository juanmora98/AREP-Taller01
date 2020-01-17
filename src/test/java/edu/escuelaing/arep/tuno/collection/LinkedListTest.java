package edu.escuelaing.arep.tuno.collection;


import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {


    @Test
    public void shouldAddElementsToTheLinkedListAndGetTheSizeCorrectly(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++){
            linkedList.add(i);
        }
        assertEquals(10 , linkedList.size());
    }

}
