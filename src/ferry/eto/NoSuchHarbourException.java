/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferry.eto;

/**
 *
 * @author Kasper
 */
public class NoSuchHarbourException extends Exception {
    
    public NoSuchHarbourException(){};
    
    public NoSuchHarbourException(String message){
        super(message);
    }
}
