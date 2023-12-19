/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejedeitel2;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author villa
 */
public class Ejedeitel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");
        System.out.println("Starting Executor");
        ExecutorService threadExecutor = Executors.newCachedThreadPool();
        threadExecutor.execute(task1);
        threadExecutor.execute(task2);
        threadExecutor.execute(task3);
        threadExecutor.shutdown();
        System.out.println("Tasks started, main ends.\n");
    }

}
