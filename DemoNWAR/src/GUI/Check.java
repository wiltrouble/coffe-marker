/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JPanel;
import java.awt.Color;
/**
 *
 * @author RodrigoMenacho
 */
public class Check {
    public void checkSensor(int state, JPanel panel){
        if (state>0) {
            panel.setBackground(Color.GREEN);
        }
        else{
            panel.setBackground(Color.RED);
        }
    }
}
