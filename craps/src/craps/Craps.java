/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;
import java.util.Random;

/**
 *
 * @author villa
 */
public class Craps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p1;
        boolean res;
        System.out.println("Para ganar: ");
        System.out.println("Obtener 7 u 11 primera tirada");
        System.out.println("4,5,6,8,9 o 10 en la primera tirada y conseguir la misma puntuacion en tiradas subsecuentes antes de otener un 7 ");
        System.out.println("Para perder: ");
        System.out.println("Obtener 2,3,12 en la primera tirada ");
        System.out.println("Obtener 4,5,6,7,8,9 o 10 en la primera tirada y un 7 en subsecuente antes de repetir el valor de la primera tirada");
        p1=tirard();
        res=comparar(p1);
        imprimir(res);
    }


    public static int tirard() {
        int pts;
        Random md=new Random();
        pts=(md.nextInt(6)+1)+md.nextInt(6)+1;
        System.out.println("Tu numero es "+pts);
        return (pts);
    }

    public static boolean comparar(int p1) {
        boolean res = false;
        int pts2,p2;
        switch(p1){
            case 7:{
                System.out.println("Gano"); res=true;break;
            }
            case 11:{
                System.out.println("Gano");res=true;break;
            }
            case 2:{
                System.out.println("Perdio");res=false;break;
            }
            case 3:{
                System.out.println("Perdio");res=false;break;
            }
            case 12:{
                System.out.println("Perdio");res=false;break;
            }
            case 4:{
                System.out.println("Se tira otra vez ");
            
                do{
                    p2 = tirard();
                }while((p1==p2)&&(p2!=7));
                 if(p2!=7){
                    res=true;
                }
                else 
                    res=false;
                break;
            }
            case 5:{
                System.out.println("Se tira otra vez ");
            
                do{
                    p2 = tirard();
                }while((p1!=p2)&&(p2!=7));
                if(p2!=7){
                    res=true;
                }
                else 
                    res=false;
                break;
            }
            case 6:{
                System.out.println("Se tira otra vez ");
            
                do{
                    p2 = tirard();
                }while((p1!=p2)&&(p2!=7));
                if(p2!=7){
                    res=true;
                }
                else 
                    res=false;
                break;
            }
            case 8:{
                System.out.println("Se tira otra vez ");
            
                do{
                    p2 = tirard();
                }while((p1!=p2)&&(p2!=7));
                 if(p2!=7){
                    res=true;
                }
                else 
                    res=false;
                break;
            }
            case 9:{
                System.out.println("Se tira otra vez ");
            
                do{
                    p2 = tirard();
                }while((p1!=p2)&&(p2!=7));
                 if(p2!=7){
                    res=true;
                }
                else 
                    res=false;
                break;
            }
            case 10:{
                System.out.println("Se tira otra vez ");
            
                do{
                    p2 = tirard();
                }while((p1!=p2)&&(p2!=7));
                 if(p2!=7){
                    res=true;
                }
                else 
                    res=false;
                break;
            }
        }
        return(res);
    }

    private static void imprimir(boolean res) {
        if(res)
            System.out.println("Gano");
        else
            System.out.println("Perdio");
    }
    
}
