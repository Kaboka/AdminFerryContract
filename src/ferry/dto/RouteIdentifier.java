/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferry.dto;

import java.io.Serializable;

/**
 *
 * @author Mathias
 */
public class RouteIdentifier implements Serializable {
    
    private int ID;
    
    public RouteIdentifier() {
        }

    public RouteIdentifier(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
