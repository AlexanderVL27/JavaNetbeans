
package vayve;

import java.text.DecimalFormat;

/**
 *
 * @author villa_xaz9a7o
 */
public class Vayve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double x[] = new double[1000];
        double[] muestra = new double[1000];
        double lambda = 0.1;
        double[] arreglo = g();
        double[] empirica = new double[muestra.length];
        DecimalFormat f = new DecimalFormat("0.00000");
        System.out.println("Variables continuas exponencial");
        for (int i = 0; i < 1000; i++) {
            x[i] = (-1 * Math.log(1 - arreglo[i])) / lambda;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(f.format(x[i]));
        }
        System.out.println("Variables empiricas");
        for (int i = 0; i < 1000; i++) {
            muestra[i] = arreglo[i];
        }
        for (int i = 0; i < 1000; i++) {
            empirica[i] = Math.sqrt(muestra[i]);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.print(f.format(empirica[i]));
        }
    }

    public static double[] g() {
        double sem = 15817, a = 45, c = 32767, mod = 32768;
        double[] r = new double[32768];
        double[] dis = new double[32768];
        for (int i = 0; i < dis.length; i++) {
            r[i] = ((a * sem) + c) % mod;
            sem = r[i];
            dis[i] = r[i] / mod;
        }
        int aux = 0;
        for (int i = 0; i < r.length - 1; i++) {
            if (r[i] == r[i + 1]) {
                aux++;
            }
        }
        return dis;
    }
}

