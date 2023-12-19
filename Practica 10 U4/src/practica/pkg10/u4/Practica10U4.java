package practica.pkg10.u4;
import java.io.IOException;
import java.util.Scanner;

public class Practica10U4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sel;
        int arreglo[]=new int[5];
        int i=0;
        System.out.println("1) Insertar numero");
        System.out.println("2) Buscar numero");
        System.out.println("3) Modificar numero");
        System.out.println("4) Eliminar numero");
        System.out.println("5) Imprimir");
        System.out.println("6) salir");
        System.out.println("=========================================================");
        do{
        System.out.println("¿Que desea hacer?");
        sel=s.nextInt();
        System.out.println("==========================================================");
        switch(sel){
            case 1:  { try{
            System.out.println("¿Numero que desea ingresar?");
            arreglo[i]=s.nextInt();
                System.out.println("Numero ingresado con exito");
            desplegar(arreglo);}catch(Exception err){
            System.out.println("No hay espacio suficiente");
            desplegar(arreglo);
            }
            System.out.println("==========================================================");
            break;}
            
            case 2:{
                int j=0,n;
                System.out.println("Numero que desea buscar");
                n=s.nextInt();
                for (int k = 0; k < arreglo.length; k++) {
                    if (arreglo[k]==n) {
                        System.out.println("Si se enocontro el numero "+n);break;
                    }
                    j++;
                }
                if(j==arreglo.length){
                    System.out.println("El numero "+n+" no existe");
                }
                System.out.println("==========================================================");
                break;
            }
            case 3:{
                int j=0,n,n2;
                System.out.println("Numero que desea modiificar");
                n=s.nextInt();
                System.out.println("Numero por el que desea modificar");
                n2=s.nextInt();
                
                for (int k = 0; k < arreglo.length; k++) {
                    if (arreglo[k]==n) {
                        System.out.println("El numero "+arreglo[k]+" sera modifiado por el numero: ");
                        arreglo[k]=s.nextInt();
                        
                    }
                    j++;
                    break;
                }
                if(j==arreglo.length){
                    System.out.println("No encontrado");
                }
                System.out.println("==========================================================");
                break;
            }
            case 4:{
                int j=0,n;
                System.out.println("Numero que desea eliminar");
                n=s.nextInt();
                for (int k = 0; k < arreglo.length; k++) {
                    if (arreglo[k]==n) {
                        System.out.println("El numero "+n+" se ha eliminado");
                        arreglo[k]=0;
                        break;
                    }
                    j++;
                }
                if(j==arreglo.length){
                    System.out.println("No encontrado");
                }
                System.out.println("==========================================================");
                break;
            }
            case 5:{
                desplegar(arreglo);
            }
        }
        i++;
        }while(sel!=6);
    }

    public static void desplegar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; ++i) {
            System.out.println(i+" --> "+arreglo[i]);
        }
    }
    
}
