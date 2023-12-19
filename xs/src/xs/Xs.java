/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xs;

/**
 *
 * @author villa_xaz9a7o
 */
public class Xs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    int BusquedaBinariaNoRecursiva (int x, int a[], int n) {
int prim=0, ult= n-1, medio = 0;
boolean encontrado=false;
while ((!encontrado) || (prim <= ult)){
medio = (prim + ult)/ 2;
if (x == a[medio])
encontrado = true;
else{
if(x > a[medio])
prim = medio + 1;
else
ult = medio - 1;
};
};
if (!encontrado)
return -1;
return medio;
}
}