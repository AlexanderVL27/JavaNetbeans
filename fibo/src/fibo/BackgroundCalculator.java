/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;
import javax.swing.SwingWorker;
import javax.swing.JLabel;
import java.util.concurrent.ExecutionException;
/**
 *
 * @author villa
 */
public class BackgroundCalculator extends SwingWorker< Long, Object > {
    private final int n;
    private final JLabel resultJLabel;
    public BackgroundCalculator( int number, JLabel label ){
        n = number;
        resultJLabel = label;
    }
    public Long doInBackground(){
        long nthFib;
        return nthFib = fibonacci( n );
    }
    protected void done(){
        try{
            resultJLabel.setText( get().toString() );
        }
        catch(InterruptedException ex){
            resultJLabel.setText( "Interrupted while waiting for results." );
        }
        catch ( ExecutionException ex ){
            resultJLabel.setText("Error encountered while performing calculation." );
        }
    }
    public long fibonacci( long number ){
        if ( number == 0 || number == 1 )
            return number;
        else
            return fibonacci( number - 1 ) + fibonacci( number - 2 );
    }
}
