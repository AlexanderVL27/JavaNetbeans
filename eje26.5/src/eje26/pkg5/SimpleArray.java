/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje26.pkg5;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author villa_xaz9a7o
 */
public class SimpleArray {

    private final int[] array; // the shared integer array
    private int writeIndex = 0; // index of next element to be written
    private final static Random generator = new Random();

    // construct a SimpleArray of a given size
    public SimpleArray(int size) {
        array = new int[size];
    } // end constructor

    // add a value to the shared array
    public void add(int value) {
        int position = writeIndex;
        try {
            // put thread to sleep for 0-499 milliseconds
            Thread.sleep(generator.nextInt(500));
        } // end try
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        array[position] = value;
        System.out.printf("%s wrote %2d to element %d.\n",
                Thread.currentThread().getName(), value, position);
        ++writeIndex;
        System.out.printf("Next write index: %d\n", writeIndex);
    } // end method add

    // used for outputting the contents of the shared integer array
    public String toString() {
        return "\nContents of SimpleArray:\n" + Arrays.toString(array);
    } // e
}
