/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;

import java.util.Random;

/**
 *
 * @author villa_xaz9a7o
 */
public class Producer implements Runnable {

    private final static Random generator = new Random();
    private final Buffer sharedLocation; 
    int count1;

    public Producer(Buffer shared,int a) {
        sharedLocation = shared;
        count1=a;
    }

    public void run() {
        int sum = 0;
        System.out.println("---------"+count1);
        for (int count = 1; count <= count1; count++) {
            try
            {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.set(count);
                sum += count;
                System.out.printf( "\t%2d\n", sum );
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Producer done producing\\nTerminating Producer");
    }
}
