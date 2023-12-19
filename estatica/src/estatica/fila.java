/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatica;

/**
 *
 * @author villa
 */
public class fila {
   
     int frente, atras, max;
     private int elem[];
     public fila(int n ) {
         max= n;
         elem=new int[max];
         frente=-1;
         atras=-1;
     }
     public boolean filavacia(){
         if (frente==-1&&atras==-1) {
             return true;
         }else return false;
     }
     public boolean filallena(){
         if (atras==max-1) {
             return true;
         }else return false;
     }
     public void inserta(int dato){
         if (filallena()==false) {
             atras = atras +1;
             elem[atras]=dato;
             if (atras==0) {
                 frente =0;
             }
         }else System.out.println("Desbordamiento");
     }
     public int eliminar(){
         int dato=-1;
         if (filavacia()==false) {
             dato=elem[frente];
             if (frente==atras) {
                 frente=-1;
                 atras=-1;
             }else frente=frente+1;
         }else System.out.println("Sub desbordamiento");
         return dato;
     }
     public int info(){
         int dato =-1;
         if (filavacia()) {
             System.out.println("No hay informacion que mostrar");
         }else dato=elem[frente];
         return dato;
     }
     public void vaciar(){
         if (filavacia()==false) {
             frente=-1;
             atras=-1;
         }
     }
}
