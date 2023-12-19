package p3simulacion;

import java.util.Random;

/**
 *
 * @author villa_xaz9a7o
 */
public class P3simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double m = 2, m1 = 4, m2 = 2;
        int vueltas = 10;
        System.out.println("Poisson");
        System.out.println("----------------------");
        System.out.println("Para media de 2");
        for (int i = 0; i < vueltas; i++) {
            poisson(m);
        }
        System.out.println("----------------------");
        System.out.println("Para media de 4");
        for (int i = 0; i < vueltas; i++) {
            poisson(m1);
        }
        System.out.println("----------------------");
        System.out.println("Para media de 2");
        for (int i = 0; i < vueltas; i++) {
            poisson(m2);
        }
        System.out.println("----------------------");
        System.out.println("Bernoulli");
        for (int i = 0; i < vueltas; i++) {
            int x=Bernouli(0.5, i);
            System.out.println("La variable bernouli es : "+x);
        }
        System.out.println("----------------------");
        System.out.println("Variable geometrica");
        int veces=10;
        for (int i = 0; i < veces; i++) {
            System.out.println(i+" "+BinomialnegYGeometrica(10,0.5,i));
        }
        
    }

    public static double[] generador() {
        int g = 15, m, a = 45, c = 32767, x0 = 15817;
        double n;
        n = Math.pow(2, g);
        m = (int) n;
        double ri[] = new double[m];
        int aux = 0, xi;
        for (int i = 0; i < m; i++) {
            xi = (a * aux + c) % m;
            ri[i] = (double) xi / (m - 1);
            aux = xi;
        }
        return ri;
    }

    public static double exponencial(double m) {
        Random generator = new Random();
        double[] arreglo = generador();
        double ex, media = m;
        ex = (-(media) * Math.log(1 - arreglo[generator.nextInt(32767)]));
        return (ex);

    }

    public static void poisson(double m) {
        boolean f = true;
        double ta = 0, T = 1, y = 0;
        int X = 0,i=0;
        while (f) {
            y = exponencial(1 / m);
            ta = ta + y;
            if (ta > T) {
                f = false;
            } else {
                X++;
            }
        }
        System.out.println("El valor de x es" + X);
    }

    public static int Bernouli(double m, int i) {
        double[] ri = generador();
        int j = i;
        boolean f = true;
        if (ri[j] <= m) {
            i = 1;
        } else {
            i = 0;
        }
        return i;
    }
    
    public static double BinomialnegYGeometrica(int r,double m,int x){
        int pruebas=0,exitosos=0,i=0;
        double[]ri=generador();
        while(exitosos<r){
            if (Bernouli(m,i)==1) {
                exitosos++;
            }
            pruebas++;
            i++;
        }
        //System.out.println("Pruebas: "+pruebas+" Exitos: "+exitosos);
        int resultado=(pruebas-exitosos);
        double re=Math.pow(resultado, x-1)*exitosos;
        return re;
    }
}
