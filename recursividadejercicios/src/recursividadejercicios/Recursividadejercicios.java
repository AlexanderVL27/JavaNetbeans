/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadejercicios;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Recursividadejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        String t;
        Casos c = new Casos(); 
        System.out.println("Escoja una opcion por favor");
        System.out.println("1) Factorial de un numero recursivo");
        System.out.println("2) Factorial de un numero iterativo");
        System.out.println("3) Suma de n numeros");
        System.out.println("4) Primeros n numeros naturales");
        System.out.println("5) n-esimo numero fibonacci");
        System.out.println("6) Suma de digitos");
        System.out.println("7) Numeros hasta el 1");
        System.out.println("8) Suma de numeros pares");
        System.out.println("9) Algoritmo recursivo");
        System.out.println("10) Potencia del numero 2");
        System.out.println("11) Fibonacci");
        System.out.println("12) Palindromo recursivo");
        System.out.println("13) Palindromo iterativo");
        int op = s.nextInt();
        System.out.println("--------------------------------------------------");
        switch(op){
            case 1:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.uno(n));
            break;
            }
            case 2:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.iter1(n));
            break;}
            case 3:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.nat2(n));
            break;
            }
            case 4:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
            Casos.tres(n);
            break;
            }
            case 5:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.ene(n));
            break;
            }
            case 6:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.suma(n));
            break;
            }
            case 7:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.seis(n));
            break;
            }
            case 8:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.par(n));
            break;
            }
            case 9:{System.out.println("Dado el siguiente algoritmo recursivo");
                System.out.println("void f(int num, int div){\n" +
                "     if (num>1) {\n" +
                "         if ((num%div) == 0) \n" +
                "     {System.out.println(div);f(num/div,div);\n" +
                "     } else {f(num,div+1);}}}");
                System.out.println("a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la funciónrecursiva f(x,2)? "
                        + "¿Cuál sería un nombre más adecuado para la función f?");
                System.out.println("Ingrese el numero x");
                n=s.nextInt();
                System.out.println("Se llamaria Minimo comun multiplo "+n);
                System.out.println("--------------------------------------------------");
                c.f(n, 2);
                break;
            }
            case 10:{System.out.println("Ingrese el numero al cual quiere elevarlo");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                System.out.println(c.potencia(n));
            break;
            }
            case 11:{System.out.println("Ingrese el numero");
            n=s.nextInt();
            System.out.println("--------------------------------------------------");
                for(int i = 1; i<=n; i++){
               System.out.print(c.fibo(i)+ ", ");
          }
            break;
            }
            case 12:{System.out.println("Ingrese el palindromo");
            t=s.next();
            System.out.println("--------------------------------------------------");
                if (c.Palindrome(t)==true) {
                    System.out.println("Es palindromo");
                }else System.out.println("No es palindromo");
                break;
            }
            case 13:{System.out.println("Ingrese el palindromo");
            t=s.next();
            System.out.println("--------------------------------------------------");
                if (c.Palindromo2(t)==true) {
                    System.out.println("Es palindromo");
                }else System.out.println("No es palindromo");
                break;
            }
            default:{
                System.out.println("No hay ese numero");
            }
        }
    }
    
}
