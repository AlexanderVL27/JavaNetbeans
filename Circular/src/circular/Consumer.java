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
public class Consumer implements Runnable {

    private final static Random generator = new Random();
    private final Buffer sharedLocation;
    int count1;


    public Consumer(Buffer shared,int a) {
        sharedLocation = shared;
        count1=a;
    }

    public void run() {
        int sum = 0;
        System.out.println("---------"+count1);
        for (int count=1; count <= count1; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sum += sharedLocation.get();
                System.out.printf("\t\t\t%2d\n", sum);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.printf("\n%s %d\n%s\n",
                "Consumer read values totaling", sum, "Terminating Consumer");
    }
}
