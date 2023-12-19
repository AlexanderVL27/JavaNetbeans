
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Jorge Castro
 */
public class Multiplicar {
    public static void main(String [] args){
        List<Integer> a=Arrays.asList(1,2,3);
        List<Integer> b=Arrays.asList(4,5,6);
        
        //FORMA CHAFA
        //Multiplicacion multi=(c,d)->{
            //for(int i=0; i<c.size(); i++){
                //System.out.println(c.get(i)*d.get(i));
            //}
        //};
        //multi.Multiplicar(a,b);
        
        //FORMA LAMBDA
        Multiplicacion multi=(c,d)->{
            c.forEach(i->
                System.out.println(i*d.get(0))
            );
            
            IntStream.range(0, c.size()).forEach(index ->
                                                System.out.println(c.get(index)*d.get(index))
                                          );
            
        };
        multi.Multiplicar(a,b);
    }
}
