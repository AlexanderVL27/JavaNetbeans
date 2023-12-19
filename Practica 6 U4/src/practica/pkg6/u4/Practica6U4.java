package practica.pkg6.u4;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica6U4 {

    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        char car =' ';
        char[]cad=new char[80];
        int i=0;
        System.out.println("Escriba por favor");
        try{
            while(car!='\n'){
                car = (char) isr.read();
                cad[i++]=car;
            }
        }
        catch(IOException err){
            System.out.println("Error de captura");
        }
        int desp='a'-'A';
        for (i = 0; i < cad.length && cad[i]!='\0'; i++) {
            if(cad[i]>='a'&&cad[i]<='z'){
                cad[i]=(char) (cad[i]-desp);
            }
        }
        for (i = 0; i < cad.length&&cad[i]!='\0'; i++) {
            System.out.print(cad[i]);
        }
        
    }
    
}
