/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaestatica;

/**
 *
 * @author villa
 */
public class Cola {
    int frente;
    int atras;
    int[] elems;
    int max;
    Cola(int n){
        max=n;
        elems=new int[max];
        frente=-1;
        atras=frente;
    }public boolean colallena(){
        if ((atras==max-1 && frente==0) || (atras+1==frente)) {
            return true;
        }else return false;
    }
    public boolean colavacia(){
        if (frente==-1) {
            return true;
        }else return false;
    }
    public void insertar(int dato){     
        if(colallena()) {
            System.out.println("Desbordamiento");
            return;
        }
        if(atras==max-1 && frente!=0) atras=0; else atras++;
        elems[atras]=dato;
        if(frente==-1) frente=0;
    }
    public int total(){
        int cont=0;
        if (colallena()==true) {
            return max;
        }else{
            int f=atras;
            for (int i = 0; f >= frente; i++) {
                f--;
                cont++;
            }
            return cont;
        }
    }
    public int info(){
         int dato =-1;
         if (colavacia()) {
             System.out.println("No hay informacion que mostrar");
         }else dato=elems[atras];
         return dato;
     }
    public void imprimir(){
        if (colavacia()) {
            System.out.println("Esta vacia");
        }else{
            int i=frente;
            do{
                System.out.println(elems[i]);
                i++;
                if (i==max&&frente>atras) {
                    i=0;
                }
            }while(i!=atras+1);
        }
    }
    public void elimina(){
        if(frente==-1) {
            System.out.println("Cola vacia");
            return;
        }
        if(frente==atras) {
            frente=-1; atras=-1;
            return;
        }
        if(frente==max) frente=0; 
        else frente++;
    }
}
