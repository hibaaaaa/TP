package org.jhotdraw.draw.action;

import org.jhotdraw.draw.*;

/*
 * A proposal contains the values we want the Model to accept
 */
public class Proposal {
    
    public Figure figure;
    private String actionName;
    
    Proposal(Figure figure, String actionName) {
        this.figure = figure;
        this.actionName = actionName;
    }
    
    public void setActionName(String name) {
        this.actionName = name;
    }
    
    public String getActionName() {
        return this.actionName;
    }
}
