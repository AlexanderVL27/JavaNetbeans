/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividadejercicios;

/**
 *
 * @author villa
 */
public class Casos {

    public Casos() {
    }
    public int uno(int n){
        if (n==0) {
            return 1;
        }else 
            return n*uno(n-1);
    }
    public static void tres(int n){
        if (n>0) {
            tres(n-1);
            System.out.println(n);}
        
    }
    public int nat2(int n){
        if (n==0) {
            return 0;
        } else{
            
            return n+nat2(n-1);}
    }
    public int suma(int n){
        if (n==0) {
            return 0;
        }else return n%10+suma(n/10);
    }
    public int seis(int n){
        if (n==1) {
            return 1;
        } else{
            System.out.println(n);
            return seis(n-1);}
    }
    public int par(int n){
           if (n == 0){ 
               return 0;
           }else{
               if (n % 2 == 0) {
               return n + par(n - 1);
               } 
               else
                   return par(n - 1);
           }
    }
    public int potencia(int n){
        if (n==0) {
            return 1;
        }else
            return 2*potencia(n-1);
    }
    public int fibo (int n) {
       if ((n==1)||(n==2)) {
           
            return n;  
        }else{
           return ene(n-2)+ene(n-1);
           
       }
    }
    public int ene(int n){
       if ((n==1)||(n==2)) {
            return 1;
        }else return ene(n-2)+ene(n-1);
   }
    public boolean Palindrome(String texto)
    {
        if(texto.length() <= 1)
        {
            return true;
        }else
        {
            if(texto.charAt(0) == texto.charAt(texto.length()-1))
            {
                return Palindrome(texto.substring(1,texto.length()-1));
            }else
          return false;
        }
    }
    public void f(int num, int div){
     if (num>1) {
         if ((num%div) == 0) 
     {System.out.println(div);
     f(num/div,div);
     } else {f(num,div+1);}}}
    public int iter1(int n){
        if(n < 0)
        { 
            n = n*-1; 
        }
        if(n <= 0)
        { 
            return 1; 
        }
        int f = 1;
        while(n > 1)
        {
            f = f * n;
            n--;
        }
        return f;
    }
    public boolean Palindromo2(String palabra)
    {
        for(int i = 0; i < palabra.length(); i++)
        {
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-i-1))
            { return false; }
        }
        return true;
    }
}
