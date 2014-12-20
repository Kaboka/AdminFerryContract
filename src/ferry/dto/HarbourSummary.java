/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferry.dto;

import java.io.Serializable;

public class HarbourSummary implements Serializable {

    private String name;
    private int id;

    public HarbourSummary(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    
    
}
