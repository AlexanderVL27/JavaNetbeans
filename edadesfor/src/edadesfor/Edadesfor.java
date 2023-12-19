/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edadesfor;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Edadesfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,cn=0,cad=0,adul=0,cam=0,i;
        System.out.println("-------------------------------------");
        System.out.println("Ingrese el numero de personas:");
        n = sc.nextInt();
         System.out.println("-------------------------------------");
        String[]noms = new String[n];
        int[]edad = new int[n];
    
        for( i = 0; i <n ; ++i){
            System.out.println("Ingrese el nombre:");
            noms[i] = sc.next();
            
            System.out.println("Ingrese la edad:");
            edad[i] = sc.nextInt();
             System.out.println("-------------------------------------");
        }
        System.out.println("=========================================");
        for( i = 0; i<n; i++){ 
            if(edad[i]<12){
                System.out.println("-----------------------------------------");
                   System.out.println("Niño:" +noms[i]);
                   System.out.println("Edad:" + edad[i]);
                 cn++; 
                 System.out.println("----------------------------------------");
             }
            else if(edad[i]<18){
                System.out.println("Adolescente:" + noms[i]);
                System.out.println("Edad:" + edad[i]);
                cad++;
                System.out.println("-----------------------------------------");
            }
            else if(edad[i]<60){
                System.out.println("Adulto:" + noms[i]);
                System.out.println("Edad:" + edad[i]);
                adul++;
                System.out.println("-----------------------------------------");
            }
            else{
                System.out.println("Adulto mayor:" + noms[i]);
                System.out.println("Edad:" + edad[i]);
            cam++;
            System.out.println("-----------------------------------------");
            }    
        }
        System.out.println("La cantidad de Niños es:" + cn);
        System.out.println("-----------------------------------------");
        System.out.println("La cantidad de Adolescentes es:" + cad);
        System.out.println("-----------------------------------------");
        System.out.println("La cantidad de Adultos es:" + adul);
        System.out.println("-----------------------------------------");
        System.out.println("La cantidad de Adultos mayores es:" + cam);
        System.out.println("-----------------------------------------");
        
       String[]nombresniños = new String[cn];
       int[]edadniños = new int[cn];
       
       String[]nombreadol = new String[cad];
       int[]edadadol = new int[cad];
       
       String[]nombreadulto = new String[adul];
       int[]edadadulto = new int[adul];
       
       String[]nombreadulmay = new String[cam];
       int[]edadadulmay = new int[cam];
      
       int a=0,b=0,c=0,d=0;
       for( i = 0; i<n; i++){ 
            if(edad[i]<12){
                nombresniños[a] = noms[i];
                edadniños[a] = edad[i];   
                a++;
             }
            else if(edad[i]<18){
                nombreadol[b] = noms[i];
                edadadol[b] = edad[i];
                b++;
            }
            else if(edad[i]<60){
                nombreadulto[c] = noms[i];
                edadadulto[c] = edad[i];
                c++;
            }
            else{
               nombreadulmay[d] = noms[i];
               edadadulmay[d] = edad[i];
               d++;
            }    
        }
        System.out.println("Arreglo de niños:");
        for(int u=0; u<cn; u++){
           
            System.out.println("Nombres:" + nombresniños[u]);
            System.out.println("Edad:" + edadniños[u]);
            System.out.println("=======================================================");
        }
         System.out.println("Arreglo de adolescentes:");
        for(int x = 0; x<cad; x++){
            System.out.println("Nombres" + nombreadol[x]);
            System.out.println("Edad" + edadadol[x]);
            System.out.println("=======================================================");
        
        }
         System.out.println("Arreglo de adultos:");
        for(int y = 0; y<adul; y++){
            System.out.println("Nombres:" + nombreadulto[y]);
            System.out.println("Edad:" + edadadulto[y]);
            System.out.println("=======================================================");
        
        }
         System.out.println("Arreglo de adultos mayores");
        for(int z = 0; z<cam; z++){
            System.out.println("Nombres:" + nombreadulmay[z]);
            System.out.println("Edad:" + edadadulmay[z]);
            System.out.println("=======================================================");
        
        }
    }
    
}
