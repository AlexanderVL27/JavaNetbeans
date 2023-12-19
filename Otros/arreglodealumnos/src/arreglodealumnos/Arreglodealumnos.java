
package arreglodealumnos;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author villa
 */
public class Arreglodealumnos {

    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        int n=5,m=40; char car =' ';
        char [ ][ ] nombre=new char [n][m];
        System.out.println("Escriba los nombres de los alumnos: ");
        try{
            for (int i = 0; i < nombre.length; i++) {
                System.out.print((i+1)+" - ");
                for (int j = 0; j < nombre[0].length&& car !='\n'; j++) {
                    car=(char)isr.read( );
                    nombre [i][j]=car;
                }car=' ';
            }
        }
        catch(IOException err){
            System.out.println("Error de caprtura");
        }
        System.out.println("----------------------------------------------------------------------");
        for (int i = 0; i < nombre.length; i++) {System.out.print((i+1)+" - ");
            for (int j = 0; j < nombre[0].length; j++) {
                
                System.out.print(nombre[i][j]);
            }
        }
    }
    
}
