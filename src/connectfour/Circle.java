/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class Circle {
    double width;
    double height;
    Color color;

    public Circle(Color color) {
        this.color = color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
    
    
}
