package carrito;
import java.util.Scanner;
public class Carrito {

    public static void main(String[] args) {
        double pre,des=0,desf=0,pago=0,suma=0;
        int n,selec,i;
        Scanner s =new Scanner(System.in);
        System.out.println("Ingrese los articulos del carrito");
        n=s.nextInt();System.out.println("\n");
        System.out.println("Cual es el departamento al que pertenece");
        System.out.println("(1) perfumeria");
        System.out.println("(2) abarrotes");
        System.out.println("(3) vinos y licores");
        System.out.println("(4) frutas y verduras");
        selec=s.nextInt();
        for (i = 1; i <=n; ++i) {
        
        System.out.println("Cual es el precio del producto?");
        pre=s.nextDouble();
        
        switch(selec){
            case 1:{
                System.out.println("A seleccionado departamento de perfumeria");
                des=pre*.10;
                break;
            }
            case 2:{
                System.out.println("A seleccionado departamento de abarrotes");
                des=pre*.20;
                break;
            }
            case 3:{
                System.out.println("A seleccionado departamento de vinos y licores");
                des=pre*.30;
                break;
            }
            case 4:{
                System.out.println("A seleccionado departamento de frutas y verduras");
                des=pre*.10;
                break;
            }
            default:{
                System.out.println("No tiene descuento el articulo");
            }
                
        }
        desf=pre-des;
        pago=pago+desf;
        pre=0;
        des=0;
        }
        System.out.println("Total a pagar es "+pago);
    }
    
}
