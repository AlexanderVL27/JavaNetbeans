/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionestda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author villa
 */
public class Aplicacionestda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int op=0;       
        String C, Cinv="";
        System.out.println("Ingrese una palabra");
        C=leer.readLine();      
       
        Ejepilas ob=new Ejepilas(C.length());
        Ejepilas ob2=new Ejepilas(C.length());
        Ejepilas ob3=new Ejepilas(C.length());
        do{
            System.out.println("1.-Insertar palabra");
            System.out.println("2.-Comprobar si es palindromo");           
            System.out.println("Elige una opcion");
            try{
            op=Integer.parseInt(leer.readLine());
            }catch(NumberFormatException e){
                System.out.println("Error de escritura");
            }
            switch(op){
                case 1:
                    if(!ob.full() && !ob2.full()){
                        for(int i=0;i<C.length();i++){
                            ob.push(C.charAt(i));
                            ob2.push(C.charAt(i));                          
                        }
                        while(ob3.full()!=true){
                            char d=ob.pop();                           
                            ob3.push(d);                            
                        }
                        if(ob3.full()==true && ob2.full()==true){
                            System.out.println("datos ingresados correctamente");
                        }
                    }else{
                        System.out.println("la píla esta llena");
                    }
                break;
                   
                case 2: 
                    char a = 0, b=0;
                    boolean band=true;
                    if(ob2.empty()!=true && ob3.empty()!=true){                       
                        while(ob2.empty()!=true && ob3.empty()!=true && band==true){
                            a=ob2.pop();
                            b=ob3.pop();
                            if(a==b){
                            band=true;
                            }else{
                                band=false;
                            }
                        }                       
                        if(band){
                            System.out.println(" la palabra es un palindromo");
                        }else{
                            System.out.println("la palabra no es palindromo");
                        }
                       
                    }else{
                        System.out.println("la pila esta vacia");  
                    }                       
                    break;                                                                       
                       
                case 3:
                    System.exit(0);
                    break;              
            }
        }while(op!=4);   
        
    }
    
}
