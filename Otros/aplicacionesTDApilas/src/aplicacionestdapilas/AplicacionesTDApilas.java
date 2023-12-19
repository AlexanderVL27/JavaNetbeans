/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionestdapilas;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class AplicacionesTDApilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        String o;
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1) orden inverso");
            System.out.println("2) Verificar la funcion correcta");
            System.out.println("3) Verificar los parentesis");
            System.out.println("4) Palabre palindromo");
            op=s.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Orden inverso");
                    System.out.println("Tamaño de la pila");
                    n=s.nextInt();
                    ejepilas a = new ejepilas(n);
                    a.apilar();
                    a.sacar();break;
                }
                case 2:{
                    System.out.println("Tamaño de la pila");
                    n = s.nextInt();
                    ejepilas b = new ejepilas(n);
                    System.out.println("Ingrese la funcion");
                    String f = s.next();
                    b.parentesis(f);
                    if (b.parentesis(f)==false) {
                        System.out.println("Esta correcta");
                    }else System.out.println("Favor de verificar la expresion");break;
                }
                case 3:{
                    System.out.println("Tamaño de la pila");
                    n = s.nextInt();       
                    System.out.println("Ingrese la funcion infija");
                    String r =s.next();
                    ejepilas c = new ejepilas(n);
                    c.posfija(r);break;
                }
                case 4:{
                    System.out.println("ingrese la palabra");
                    String p=s.next();
                    ejepilas d;
                    d = new ejepilas(p.length());
                    ejepilas e;
                    e = new ejepilas(p.length());
                    boolean es=true;
                    
                    for (int i = 1; i < p.length(); i++) {
                        d.apilar2(p.charAt(i));
                    }
                    for(int j=0;es&&!d.pilav();){
                        es=(p.charAt(j++)==d.xpop3());
                    }
                    if (es) {
                        System.out.println("es");
                    }else
                        System.out.println("no es");
                    break;
                }
            }
            System.out.println("Algun otro metodo?");
            o = s.next();
        } while (o.equals("si"));                       
    }
}
