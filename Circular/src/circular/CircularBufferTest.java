/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CircularBufferTest {

    public static void main(String[] args) {
        Random generator = new Random();
        ExecutorService application = Executors.newCachedThreadPool();
        CircularBuffer sharedLocation = new CircularBuffer();
        sharedLocation.displayState("Initial State");
        int count1;
        count1 = generator.nextInt(100);
        int count2=count1;
        application.execute(new Producer(sharedLocation,count2));
        application.execute(new Consumer(sharedLocation,count1));
        application.shutdown();
    }
}
