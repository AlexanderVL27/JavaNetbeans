/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje26.pkg5;

/**
 *
 * @author villa_xaz9a7o
 */
public class ArrayWriter implements Runnable {

    private final SimpleArray sharedSimpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArray array) {
        startValue = value;
        sharedSimpleArray = array;
    } // end constructor

    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i); // add an element to the shared array
        } // end for
    } // end method run
}
