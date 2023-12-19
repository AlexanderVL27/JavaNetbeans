/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;

/**
 *
 * @author villa_xaz9a7o
 */
public interface Buffer {
    public void set( int value ) throws InterruptedException;
    public int get() throws InterruptedException;
}
