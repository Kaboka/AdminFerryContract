/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferry.eto;

/**
 *
 * @author Mathias
 */
public class OverBookedException extends Exception {

    public OverBookedException() {
    }
    
    public OverBookedException(String message){
        super(message);
    }
}
