/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje26.pkg5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author villa_xaz9a7o
 */
public class Eje265 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleArray sharedSimpleArray = new SimpleArray(6);

        // create two tasks to write to the shared SimpleArray
        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

        // execute the tasks with an ExecutorService
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);

        executor.shutdown();

        try {
            // wait 1 minute for both writers to finish executing
            boolean tasksEnded = executor.awaitTermination(1, TimeUnit.MINUTES);

            if (tasksEnded) {
                System.out.println(sharedSimpleArray); // print contents
            } else {
                System.out.println(
                        "Timed out while waiting for tasks to finish.");
            }
        } // end try
        catch (InterruptedException ex) {
            System.out.println(
                    "Interrupted while waiting for tasks to finish.");

        }

    }
}
