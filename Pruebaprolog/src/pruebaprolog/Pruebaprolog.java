package pruebaprolog;
import org.jpl7.Query;
import org.jpl7.Term;
/**
 *
 * @author villa_xaz9a7o
 */
public class Pruebaprolog {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String t1 = "consult('C:/Users/villa_xaz9a7o/OneDrive/Documentos/Prolog/practicas.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1+" "+q1.hasSolution()+"; ");
        
        String t2 = "abuelo(X,Y)";
        Query q2 = new Query(t2);
        
        while (q2.hasMoreSolutions()) {
            java.util.Map<String, Term> solution = q2.nextSolution();
            Term XTerm = solution.get("X");
            Term YTerm = solution.get("Y");
            System.out.println("Abuelo: " + XTerm + ", Nieto: " + YTerm);
        }
    }
}

