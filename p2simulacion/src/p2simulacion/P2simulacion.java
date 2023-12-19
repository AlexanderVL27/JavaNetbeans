
package p2simulacion;

import java.text.DecimalFormat;

/**
 *
 * @author villa_xaz9a7o
 */
public class P2simulacion {

    static DecimalFormat f = new DecimalFormat("0.00000");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] arreglo = generador();
        double m=3,m1=5,m2=10,m3=2;
        exponencial(arreglo,m);
        exponencial(arreglo,m1);
        exponencial(arreglo,m2);
        for (int i = 0; i < 4; i++) {
            lognorm(arreglo,m3);
            m3=m3+12;
        }
        
    }
    public static double[] generador(){
        int g = 15,m,a=45,c=32767,x0=15817;
        double n;
        n=Math.pow(2, g); 
        m=(int) n;
        double ri[]=new double[m];  
        
        int aux=0,xi;
        for (int i = 0; i < m; i++) {
            xi=(a*aux+c)%m;
            ri[i]=(double)xi/(m-1);
            aux=xi;
            //System.out.println(ri[i]);
        }
        return ri;
    }
    public static void exponencial (double []ri,double m){
        double[] arreglo = ri;
        double ex=0,media=m;
        
        System.out.println("Variable exponencial");
        for (int i = 31767; i < arreglo.length-1; i++) { //salen los ultimos 1000 numeros, cambiar si se requieren mas nuemros
            ex=(-(media)*Math.log(1-arreglo[i]));
            System.out.println(f.format(ex));
        }
    }
    public static void lognorm(double []ri,double s){
        double[] arreglo = ri;
        double varianza=0.23376348,media=0.23376348,suma = 0,c=0,res;
        for (int i=(int) s; i < s+12; i++) {
            suma=(arreglo[i]+suma)-6;
        }
        System.out.println("Variable logaritmica");
        c= (media+((Math.pow(varianza, 0.5))*suma));
        res=Math.pow(2.72, c);
        System.out.println(res);
    }
    
}
