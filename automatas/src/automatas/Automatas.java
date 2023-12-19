/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatas;

import java.util.Scanner;

/**
 *
 * @author villa_xaz9a7o
 */
public class Automatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String[] cof = new String[4];
        String[] alfa = new String[2];
        String[] inicio = new String[1];
        String[] efinal = new String[2];
        String[] cadena = new String[4];
        String[][] trans = new String[3][2];
        
        System.out.println("Ingrese el conjunto finito de estados");
        
        for (int i = 0; i < 4; i++) {
            cof[i]=teclado.nextLine();
        }
        System.out.println("Ingrese el alfabeto de simbolos");
        for (int i = 0; i < 2; i++) {
            alfa[i]=teclado.nextLine();
        }
        System.out.println("Ingrese el estado inicial");
        for (int i = 0; i < 1; i++) {
            inicio[i]=teclado.nextLine();
        }
        System.out.println("Ingrese el estado final");
        for (int i = 0; i < 2; i++) {
            efinal[i]=teclado.nextLine();
        }
        System.out.println("*************************");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                trans[i][j]= cof[(int)(Math.random()*3)];
                System.out.println(trans[i][j]);
            }
        }
        
        System.out.println("Ingrese la cadena a evaluar");
        for (int i = 0; i < 4; i++) {
            cadena[i]=teclado.nextLine();
        }
        //a,b,c
        
        
        int k=0,x=0, y=0;
        String[] com = new String[3];
        while(k>cadena.length){
	for(int i=0; i<cof.length; i++)
	{
		if(cof[i] == inicio[0])
		{
			x = i;
			break;
		}
	}
	
        for(int j=0; j<alfa.length; j++)
	{
		if(alfa[j] == cadena[j])
		{
			y = j;
			break;
		}
	}System.out.println(inicio[0]+" "+cadena[k]);
        inicio[0] = trans[x][y];
        System.out.println(" = "+inicio[0]);
        k++;
        }
        System.out.println("Resultado "+inicio[0]);
        for(int i=0; i<efinal.length; i++){
		if(efinal[i] == inicio[0])
                    System.out.println("Si es aceptada");
        }
	       System.out.println("No es aceptada");
        
        
    }
    
    
}
