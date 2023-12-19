/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author villa
 */
public class HerenciaFigura {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura f[] = new Figura[5];
        Circulo c = new Circulo();
        Rectangulo r = new Rectangulo();
        Cuadrado cu = new Cuadrado();
        Triangulo t = new Triangulo();
        Cubo cub = new Cubo();
        
        System.out.println("Circulo");
        c.llenar();
        c.area();
        c.perimetro();
        
        System.out.println("Rectangulo");
        r.llenar();
        r.area();
        r.perimetro();
        
        System.out.println("Cuadrado");
        cu.llenar();
        cu.area();
        cu.perimetro();
        
        System.out.println("Triangulo");
        t.llenar();
        t.area();
        t.perimetro();
        
        System.out.println("Cubo");
        cub.llenar();
        cub.area();
        cub.perimetro();
        cub.volumen();
        
        f[0]=c;
        f[1]=r;
        f[2]=cu;
        f[3]=cub;
        f[4]=t;
        
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }
}
