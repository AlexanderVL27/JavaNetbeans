/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;

/**
 *
 * @author villa_xaz9a7o
 */
public class Montecarlo {
 
	public double countPI(double n) {
		int i = 0;
		int count = 0;
		double pi = 0;
		double x = 0;
		double y = 0;
		while(i < n) {
			x = Math.random();
			y = Math.random();
			if ((x * x) + (y * y) < 1) {
				count++;
			}
			i++;
		}
		pi = 4 * (count / n);
		return pi;
	}
	
	public static void main(String[] args) {
		Montecarlo monteCarlo = new Montecarlo();
		double pi = 0;
		pi = monteCarlo.countPI(100000);
		 System.out.println ("Monte Carlo calcula el valor de pi:" + pi);
	}
    }
    
