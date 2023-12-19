
package analizador2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws IOException, Exception {
        String rutaL = "C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\Lexico.flex";
        String rutaC = "C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\LexicoCup.flex";
        String[] rutas = {"-parser", "Sintaxis","C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\Sintaxis.cup"};
        
        File archivo;
        
        archivo = new File(rutaL);
        JFlex.Main.generate(archivo);
        
        archivo = new File(rutaC);
        JFlex.Main.generate(archivo);
        
            java_cup.Main.main(rutas);
            
        
        
        Path rutaSym = Paths.get("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\sym.java"), 
                Paths.get("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\sym.java")
        );
        Path rutaSin = Paths.get("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\Sintax.cup");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        //Files.move(
                //Paths.get("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\Sintax.cup"), 
                //Paths.get("C:\\Users\\villa_xaz9a7o\\OneDrive\\Documentos\\NetBeansProjects\\SkelPrototype\\src\\analizadors\\Sintax.cup")
        //);
        
    }
}
